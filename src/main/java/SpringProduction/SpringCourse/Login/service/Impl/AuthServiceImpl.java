package SpringProduction.SpringCourse.Login.service.Impl;

import SpringProduction.SpringCourse.Login.dto.LoginDto;
import SpringProduction.SpringCourse.Login.dto.RegisterDto;
import SpringProduction.SpringCourse.Login.entity.Role;
import SpringProduction.SpringCourse.Login.entity.User;
import SpringProduction.SpringCourse.Login.exception.TodoAPIexception;
import SpringProduction.SpringCourse.Login.repository.RoleRepository;
import SpringProduction.SpringCourse.Login.repository.UserRepository;
import SpringProduction.SpringCourse.Login.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    private AuthenticationManager authenticationManager;


    @Override
    public String register(RegisterDto registerDto) {
        // Check username is already exist in database
        if(userRepository.existsByUsername(registerDto.getUsername())) {
            throw new TodoAPIexception(HttpStatus.BAD_REQUEST, "Username already exists!.");
        }

        // check email is already exist in database
        if(userRepository.existsByEmail(registerDto.getEmail())) {
            throw new TodoAPIexception(HttpStatus.BAD_REQUEST,"Email already exists!");
        }

        User user = new User();
        user.setName(registerDto.getName());
        user.setUsername(registerDto.getUsername());
        user.setEmail(registerDto.getEmail());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));

        Set<Role> roles = new HashSet<>();
        Role userRole = roleRepository.findByName("ROLE_USER");
        roles.add(userRole);

        user.setRoles(roles);
        userRepository.save(user);
        return "User Registered Successfully! ";
    }

    @Override
    public String login(LoginDto loginDto) {
       Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getUsernameOrEmail(),
                loginDto.getPassword()
        ));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return "User logged successfully.";
    }

    
}

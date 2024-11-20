package SpringProduction.SpringCourse.Login.service;

import SpringProduction.SpringCourse.Login.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
}

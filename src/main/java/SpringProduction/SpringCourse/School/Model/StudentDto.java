package SpringProduction.SpringCourse.School.Model;

public record StudentDto (
        String firstName,
        String lastName,
        String email,
        Integer SchoolId
) {

    @Override
    public Integer SchoolId() {
        return SchoolId;
    }
}

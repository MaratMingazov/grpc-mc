package maratmingazovr.grpc_client.dto;

import jakarta.validation.constraints.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import maratmingazovr.grpc_common.User;

@Getter
@Setter
public class UserDto {

    @NotNull(message = "Id cannot be null")
    @Positive(message = "Id should be a positive number")
    private int id;

    @NotEmpty(message = "Name cannot be empty")
    @NotBlank(message = "Name cannot be blank")
    @Pattern(regexp = "^[a-zA-Z]+(?:\\s+[a-zA-Z]+)*$", message = "Name must contain only alphabets along with white spaces.")
    private String name;


    @Pattern(regexp = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$", message = "DOB must of pattern: yyyy-mm-dd")
    private String dob;

    @PositiveOrZero(message = "Salary should be greater than or equal to 0")
    private double salary;

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.dob = user.getDob();
        this.salary = user.getSalary();
    }


    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", name:'" + name + '\'' +
                ", dob: '" + dob + '\'' +
                ", salary: " + salary +
                '}';
    }
}

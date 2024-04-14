package maratmingazovr.grpc_client.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@XmlRootElement(name = "user")
//@XmlAccessorType(XmlAccessType.FIELD)
public class UserDto {

    //    @XmlElement(name = "id")
    @NotNull(message = "Id cannot be null")
    @Positive(message = "Id should be a positive number")
    private int id;

    @NotEmpty(message = "Name cannot be empty")
    @NotBlank(message = "Name cannot be blank")
//    @XmlElement(name = "name")
    @Pattern(regexp = "^[a-zA-Z]+(?:\\s+[a-zA-Z]+)*$", message = "Name must contain only alphabets along with white spaces.")
    private String name;


    @Pattern(regexp = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$", message = "DOB must of pattern: yyyy-mm-dd")
//    @XmlElement(name = "dob")
    private String dob;

    @PositiveOrZero(message = "Salary should be greater than or equal to 0")
//    @XmlElement(name = "salary")
    private double salary;


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

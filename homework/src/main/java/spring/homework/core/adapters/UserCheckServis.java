package spring.homework.core.adapters;
import java.time.LocalDate;
public interface UserCheckServis {
 boolean checkIfRealPerson (String nationaltyId,String firstName,String lastName,LocalDate dateOfBirthYear);
}

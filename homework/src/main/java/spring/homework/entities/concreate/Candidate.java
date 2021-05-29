package spring.homework.entities.concreate;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name="id")
public class Candidate extends user{
	
	@NotBlank(message = "Name may not be blank first name")
	@Column(name ="first_name")
	private String firstName;
	 
	@NotBlank(message = "Name may not be blank message")
	@Column(name ="last_name")
	private String lastName;
	
	@NotBlank(message = "Name may not be blank identity number")
	@Column(name ="identity_number")
	@Size(max=11,min=11)
	private String identityNumber;
	
	@NotBlank(message = "Name may not be blank birthdate")
	@Column(name ="birhdate")
	private LocalDate dateOfBirth;

}

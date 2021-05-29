package spring.homework.entities.concreate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employess")
@PrimaryKeyJoinColumn(name="id")
public class Employees  extends user{
	@NotBlank(message = "Name may not be blank")
	@Column(name="first_name")
	private String firstName;
	 
	@NotBlank(message = "Name may not be blank")
	@Column(name="last_name")
	private String lastName;
}

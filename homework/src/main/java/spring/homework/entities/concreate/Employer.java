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
@Table(name ="employers")
@PrimaryKeyJoinColumn(name="id")
public class Employer extends user{
	@NotBlank(message = "Name may not be blank")
	@Column(name = "company_name")
	private String companyName;
	 
	@NotBlank(message = "Name may not be blank web address")
	@Column(name = "web_adress")
	private String webAddress;
	 
	@NotBlank(message = "Name may not be blank phone number")
	@Column(name = "phone_number")
	private String phoneNumber;
	

	@Column(name = "is_activated")
	private Boolean isActivated;
}

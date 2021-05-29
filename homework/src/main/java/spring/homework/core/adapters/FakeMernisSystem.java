package spring.homework.core.adapters;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
@Service("fakeMernis")
public class FakeMernisSystem implements UserCheckServis{

	@Override
	public boolean checkIfRealPerson(String nationaltyId, String firstName, String lastName,
			LocalDate dateOfBirthYear) {
		// TODO Auto-generated method stub
		return true;
	}

}

package spring.homework.core.verifications;

import spring.homework.core.utilities.result.Result;
import spring.homework.core.utilities.result.SuccessResult;

public class EmployerConfirmationManager implements EmployerConfirmationService{

	@Override
	public Result confirmEmployer(int employerId) {
		
		return new SuccessResult("Employer onaylandi");
	}

}

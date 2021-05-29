package spring.homework.business.concreate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import spring.homework.business.abstracts.EmployerService;
import spring.homework.core.utilities.result.DataResult;
import spring.homework.core.utilities.result.ErrorResult;
import spring.homework.core.utilities.result.Result;
import spring.homework.core.utilities.result.SuccessDataResult;
import spring.homework.core.utilities.result.SuccessResult;
import spring.homework.core.verifications.EmailService;
import spring.homework.dataAccsess.abstracts.EmployerUserDao;
import spring.homework.entities.concreate.Employer;
@Service
public class EmployerManager implements EmployerService {
	EmployerUserDao employerUserDao;
	EmailService emailService;

	@Autowired
	public EmployerManager(EmployerUserDao employerUserDao,@Qualifier("fakeEmail")EmailService emailService) {
		super();
		this.employerUserDao = employerUserDao;
		 this.emailService = emailService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(employerUserDao.findAll(),"işveren listesi başarılı geldi");
	}

	@Override
	public Result add(Employer employer) {
		if (!(emailService.emailSend(employer.getEmail()))) {
			return new ErrorResult("email formatına uygun bir email değil");
		}
		this.employerUserDao.save(employer);
		return new SuccessResult("kayıtınızın tamamlanması için email adresinize mail gönderdik. ");
	}

	
}

package spring.homework.business.concreate;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import spring.homework.business.abstracts.CandidatesService;
import spring.homework.core.adapters.UserCheckServis;
import spring.homework.core.utilities.result.DataResult;
import spring.homework.core.utilities.result.ErrorResult;
import spring.homework.core.utilities.result.Result;
import spring.homework.core.utilities.result.SuccessDataResult;
import spring.homework.core.utilities.result.SuccessResult;
import spring.homework.dataAccsess.abstracts.CandidatesDao;
import spring.homework.entities.concreate.Candidate;
@Service
public class CandidatesManager implements CandidatesService{

	private  CandidatesDao candidatesDao;
	private UserCheckServis userCheckServis;
	
	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao,@Qualifier("fakeMernis") UserCheckServis userCheckServis) {
		
		this.candidatesDao = candidatesDao;
		this.userCheckServis=userCheckServis;
	}
	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(this.candidatesDao.findAll());
	}
	@Override
	public Result add(Candidate candidatess) {
		
		if(!(userCheckServis.checkIfRealPerson(candidatess.getIdentityNumber(), candidatess.getFirstName()
				, candidatess.getLastName(), candidatess.getDateOfBirth()))) {
		
		return new SuccessResult("kayıt gercekleşmedi.");
				}
		else if (this.candidatesDao.existsByEmail(candidatess.getEmail()))
		{
			return new ErrorResult("Email daha önce kullanılmıştır.");
		}
		else if((candidatesDao.existsByIdentityNumber(candidatess.getIdentityNumber()))) {
			return new ErrorResult("TC. Kimlik no daha önce kullanılmıştır.");
		}
		else if (!(candidatess.getPassword().equals(candidatess.getPasswordRepait()))) {
			return new ErrorResult("kayıt gercekleşmedi parola uyuşmuyor.");
		}
		this.candidatesDao.save(candidatess);
		return new SuccessResult("kayıt gercekleşti");
		
	}

	

}

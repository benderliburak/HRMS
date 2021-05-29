package spring.homework.business.concreate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.homework.business.abstracts.UserService;
import spring.homework.core.utilities.result.DataResult;
import spring.homework.core.utilities.result.SuccessDataResult;
import spring.homework.dataAccsess.abstracts.UserDao;
import spring.homework.entities.concreate.user;
@Service
public class UserManager implements UserService {
private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
	super();
	this.userDao = userDao;
}

	@Override
	public DataResult<List<user>> getAll() {
		
		return new SuccessDataResult<List<user>>(this.userDao.findAll(),"Tüm kullanıcı listesi başarıyla geldi");
	}

	

}

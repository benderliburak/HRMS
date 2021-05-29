package spring.homework.business.concreate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.homework.business.abstracts.EmployeersService;

import spring.homework.core.utilities.result.DataResult;
import spring.homework.core.utilities.result.Result;
import spring.homework.core.utilities.result.SuccessDataResult;
import spring.homework.core.utilities.result.SuccessResult;
import spring.homework.dataAccsess.abstracts.EmployeesDao;

import spring.homework.entities.concreate.Employees;
@Service
public class EmployeesManager implements EmployeersService {

	private EmployeesDao employeesDao;

	@Autowired
	public EmployeesManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}

	@Override
	public DataResult<List<Employees>> getAll() {

		this.employeesDao.findAll();
		return new SuccessDataResult<List<Employees>>("çalışan listeniz başarıyla geldi");
	}

	@Override
	public Result add(Employees employees) {

		this.employeesDao.save(employees);
		return new SuccessResult("kayıt gercekleşti");
	}

}

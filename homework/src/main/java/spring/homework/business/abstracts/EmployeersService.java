package spring.homework.business.abstracts;

import java.util.List;

import spring.homework.core.utilities.result.DataResult;
import spring.homework.core.utilities.result.Result;

import spring.homework.entities.concreate.Employees;



public interface EmployeersService {
DataResult<List<Employees>> getAll();
Result add(Employees employees);
}

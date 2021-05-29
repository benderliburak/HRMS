package spring.homework.business.abstracts;

import java.util.List;

import spring.homework.core.utilities.result.DataResult;
import spring.homework.core.utilities.result.Result;
import spring.homework.entities.concreate.Employer;

public interface EmployerService {
DataResult<List<Employer>> getAll();

Result add(Employer employer);

}

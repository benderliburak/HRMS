package spring.homework.business.abstracts;

import java.util.List;



import spring.homework.core.utilities.result.DataResult;
import spring.homework.entities.concreate.user;

public interface UserService {
DataResult<List<user>> getAll();

}

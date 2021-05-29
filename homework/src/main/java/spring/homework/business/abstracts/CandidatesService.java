package spring.homework.business.abstracts;


import java.util.List;

import spring.homework.core.utilities.result.DataResult;
import spring.homework.core.utilities.result.Result;
import spring.homework.entities.concreate.Candidate;

public interface CandidatesService {
DataResult<List<Candidate>> getAll();

Result add(Candidate Candidate);

}

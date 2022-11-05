package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;

public interface TechnologiesService {
	List<GetAllTechnologiesResponse> getAll();

	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
	void delete(CreateTechnologyRequest createTechnologyRequest);
	void update(CreateTechnologyRequest createTechnologyRequest)throws Exception;
}

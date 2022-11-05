package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologiesService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologiesRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technologies;

@Service
public class TechnologiesManager implements TechnologiesService{
	private TechnologiesRepository technologiesRepository;
	@Autowired
	public TechnologiesManager(TechnologiesRepository technologiesRepository) {
		super();
		this.setTechnologiesRepository(technologiesRepository);
	}
	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		List<Technologies> technologies=technologiesRepository.findAll();
		List<GetAllTechnologiesResponse> technologiesResponses=new ArrayList<GetAllTechnologiesResponse>();
		for (Technologies technologies1 : technologies) {
			GetAllTechnologiesResponse responseItem=new GetAllTechnologiesResponse();
			responseItem.setId(((Technologies) technologies1).getId());
			responseItem.setName(((Technologies) technologies1).getTechnology());
			technologiesResponses.add(responseItem);

			
		}		return technologiesResponses;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		Technologies technologies=new Technologies();
		technologies.setTechnology(createTechnologyRequest.getName());
		this.technologiesRepository.save(technologies);
	}
	public TechnologiesRepository getTechnologiesRepository() {
		return technologiesRepository;
	}
	public void setTechnologiesRepository(TechnologiesRepository technologiesRepository) {
		this.technologiesRepository = technologiesRepository;
	}
	@Override
	public void delete(CreateTechnologyRequest createTechnologyRequest) {
		Technologies technologies=new Technologies();
		technologies.setTechnology(createTechnologyRequest.getName());
		this.technologiesRepository.delete(technologies);		
	}
	@Override
	public void update(CreateTechnologyRequest createTechnologyRequest) {
		Technologies technologies=new Technologies();
		technologies.setTechnology(createTechnologyRequest.getName());
		this.technologiesRepository.save(technologies);		
	}
}

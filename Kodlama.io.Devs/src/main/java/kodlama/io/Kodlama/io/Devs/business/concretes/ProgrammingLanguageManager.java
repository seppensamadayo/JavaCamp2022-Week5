package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
private ProgrammingLanguageRepository programmingLanguageRepository;
@Autowired
public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
	super();
	this.programmingLanguageRepository = programmingLanguageRepository;
}
@Override
public List<GetAllLanguagesResponse> getAll() {
	List<ProgrammingLanguage> programmingLanguages=programmingLanguageRepository.findAll();
	List<GetAllLanguagesResponse> programmingLanguagesResponse=new ArrayList<GetAllLanguagesResponse>();
	for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
		GetAllLanguagesResponse responseItem=new GetAllLanguagesResponse();
		responseItem.setId(programmingLanguage.getId());
		responseItem.setName(programmingLanguage.getLanguage());
		programmingLanguagesResponse.add(responseItem);

		
	}
	return programmingLanguagesResponse;
}
@Override
public void add(CreateLanguageRequest createLanguageRequest) {
ProgrammingLanguage programmingLanguage=new ProgrammingLanguage();
programmingLanguage.setLanguage(createLanguageRequest.getName());
this.programmingLanguageRepository.save(programmingLanguage);
}
@Override
public void delete(CreateLanguageRequest createLAnguageRequest) {
	// TODO Auto-generated method stub
	
}
@Override
public void update(CreateLanguageRequest createLAnguageRequest) {
	// TODO Auto-generated method stub
	
}
@Override
public void list(CreateLanguageRequest createLAnguageRequest) {
	// TODO Auto-generated method stub
	
}
@SuppressWarnings("deprecation")
public ProgrammingLanguage findById(int id) {
return programmingLanguageRepository.getById(id);
}
}

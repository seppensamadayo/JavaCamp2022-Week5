package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
List<GetAllLanguagesResponse> getAll();
ProgrammingLanguage findById(int id);
void add(CreateLanguageRequest createLAnguageRequest);
void delete(CreateLanguageRequest createLAnguageRequest);
void update(CreateLanguageRequest createLAnguageRequest);
void list(CreateLanguageRequest createLAnguageRequest);


}

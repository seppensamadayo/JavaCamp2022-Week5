package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllLanguagesResponse;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}
	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll() {
		return programmingLanguageService.getAll();
	}
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		programmingLanguageService.add(createLanguageRequest);
	}

	@DeleteMapping("/delete")
	public void delete(CreateLanguageRequest createLanguageRequest) {
		programmingLanguageService.delete(createLanguageRequest);
	}

	@PutMapping("/update")
	public void update(CreateLanguageRequest createLanguageRequest) throws Exception {
		programmingLanguageService.update(createLanguageRequest);
	}

	

	@GetMapping("/findbyid")
	public void finddById(CreateLanguageRequest id) {
		return;
	}

}

package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologiesService;
import kodlama.io.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;

@RestController
@RequestMapping("/api/programminglanguages/technologies")
public class TechnologiesController {
private TechnologiesService technologiesService;
@Autowired
public TechnologiesController(TechnologiesService technologiesService) {
	super();
	this.technologiesService = technologiesService;
}
@GetMapping("/getall")
public List<GetAllTechnologiesResponse> getAll() {
	return technologiesService.getAll();
}
@PostMapping("/add")
public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
	technologiesService.add(createTechnologyRequest);
}

@DeleteMapping("/delete")
public void delete(CreateTechnologyRequest createTechnologyRequest) {
	technologiesService.delete(createTechnologyRequest);
}

@PutMapping("/update")
public void update(CreateTechnologyRequest createTechnologyRequest) throws Exception {
	technologiesService.update(createTechnologyRequest);
}



@GetMapping("/findbyid")
public void finddById(CreateTechnologyRequest id) {
	return;
}

}

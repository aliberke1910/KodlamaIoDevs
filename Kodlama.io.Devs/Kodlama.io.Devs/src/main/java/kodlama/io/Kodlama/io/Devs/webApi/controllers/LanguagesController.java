package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<Language> getall() {
		return languageService.getAll();

	}

	@PostMapping("/add")
	public void add(Language language){
		languageService.addLanguage(language);
	}
	
	@DeleteMapping("/deleteLanguage/{id}")
    public void deleteLanguage(@PathVariable("id") int id){
        languageService.deleteLanguage(id);
    }
	
	 @GetMapping("/getById/{id}")
	    public Language getLanguageWithId(@PathVariable("id") int id){
	        return languageService.getLanguageById(id);
	    }
	 
	 @PutMapping("/update")
	    public void updateLanguage(Language language) throws Exception {
	        languageService.updateLanguage(language, language);
	    }
}
package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	
	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));

	}

	@Override
	public List<Language> getAll() {

		return languages;
	}

	public void addLanguage(Language language) {

		languages.add(language);
	}
	
	public Language getLanguageById (int id) {
		return languages.get(id);
	}

	@Override
	public void deleteLanguage(int id) {
		languages.remove(id);
		
	}

	@Override
	public void updateLanguage(Language existLanguage, Language newLanguage) {
		languages.set(existLanguage.getId(), newLanguage);
		
	}

}
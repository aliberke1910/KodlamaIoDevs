package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	void addLanguage(Language language);
	void deleteLanguage(int id);
	Language getLanguageById(int id);
	void updateLanguage(Language existLanguage, Language newLanguage);
}
package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	void addLanguage(Language language);
	Language getLanguageById (int id);
	void deleteLanguage(int id);
	void updateLanguage(Language existLanguage, Language newLanguage);
}
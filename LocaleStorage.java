package by.nearbyall.util;

import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Enum required to store locales
 * 
 * @author nearbyall
 *
 */
public enum LocaleStorage {

	ENG(Locale.US),
	RUS(new Locale("ru", "RU"));

	private static final Logger logger = LogManager.getLogger(LocaleStorage.class);

	private final Locale locale;

	LocaleStorage(Locale locale) {
		this.locale = locale;
	}

	/**
	 * Finds and returns the matching locale
	 * 
	 * @param inputLanguage required locale
	 * @return {@link LocaleStorage#ENG} if locale is not found.
	 */
	public static LocaleStorage getLocaleFromLanguage(String inputLanguage) {
		for (LocaleStorage currentLocale: LocaleStorage.values()) {
			if (currentLocale.locale.getLanguage().equals(inputLanguage)) {
				return currentLocale;
			}
		}
		logger.warn(String.format("locale %s is not found, default locale is %s", inputLanguage, ENG.locale.toString()));
		return ENG;
	}

	public String getLanguage() {
		return locale.getLanguage();
	}

	public Locale getLocale() {
		return locale;
	}
	
}

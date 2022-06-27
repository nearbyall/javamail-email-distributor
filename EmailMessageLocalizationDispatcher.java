package by.epamtc.melnikov.onlineshop.util.email;

import org.apache.commons.lang3.StringUtils;

import by.epamtc.melnikov.onlineshop.controller.LocaleStorage;
import by.epamtc.melnikov.onlineshop.util.exception.UtilException;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * The class is required for the correct localization of an email message.
 * 
 * @author nearbyall
 *
 */
public class EmailMessageLocalizationDispatcher {
	
	private static final String RESOURCE_NAME = "emailMessages";

	public String getLocalizedMessage(String key, String... messageArgs) throws UtilException {
		if (StringUtils.isBlank(key) || StringUtils.isAnyEmpty(messageArgs)) {
			throw new UtilException("Invalid message arguments");
		}
		StringBuilder message = new StringBuilder();
		for (LocaleStorage locale : LocaleStorage.values()) {
			ResourceBundle resourceBundle = ResourceBundle.getBundle(RESOURCE_NAME, locale.getLocale());
			String[] localizedArgs = getLocalizedMessageArgs(resourceBundle, messageArgs);
			String formattedMessageFragment = String.format(resourceBundle.getString(key), localizedArgs);
			message.append(formattedMessageFragment).append('\n');
		}
		return message.toString();
	}

	private String[] getLocalizedMessageArgs(ResourceBundle resourceBundle, String... messageArgs) {
		String[] localizedArgs = new String[messageArgs.length];
		for (int i = 0; i < localizedArgs.length; i++) {
			try {
				String arg = resourceBundle.getString(messageArgs[i]);
				localizedArgs[i] = arg;
			} catch (MissingResourceException e) {
				localizedArgs[i] = messageArgs[i];
			}
		}
		return localizedArgs;
	}
	
}

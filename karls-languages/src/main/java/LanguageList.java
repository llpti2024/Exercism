import java.util.ArrayList;
import java.util.List;

public class LanguageList {
	private final List < String > languages = new ArrayList <> ( );

	/**
	 * Checks if the list is empty.
	 *
	 * @return {@code true} if the list is empty, {@code false} otherwise.
	 */
	public boolean isEmpty ( ) {
		return languages.size ( ) == 0;
	}

	/**
	 * Adds a language to the list.
	 *
	 * @param language the language to be added.
	 */
	public void addLanguage ( String language ) {
		languages.add ( language );
	}

	/**
	 * Removes a language from the list.
	 *
	 * @param language the language to be removed.
	 */
	public void removeLanguage ( String language ) {
		languages.remove ( language );
	}

	/**
	 * Returns the first language in the list.
	 *
	 * @return the first language in the list.
	 */
	public String firstLanguage ( ) {
		return languages.get ( 0 );
	}

	/**
	 * Returns the number of languages in the list.
	 *
	 * @return the number of languages in the list.
	 */
	public int count ( ) {

		return languages.size ( );
	}

	/**
	 * Checks if a language is in the list.
	 *
	 * @param language the language to be checked.
	 *
	 * @return {@code true} if the language is in the list, {@code false} otherwise.
	 */
	public boolean containsLanguage ( String language ) {
		return languages.contains(language);
	}

	/**
	 * Checks if the list is "exciting", i.e., if it contains at least one language.
	 *
	 * @return {@code true} if the list is "exciting", {@code false} otherwise.
	 */
	public boolean isExciting ( ) {
		return languages.contains("Java") || languages.contains("Kotlin");
	}
}

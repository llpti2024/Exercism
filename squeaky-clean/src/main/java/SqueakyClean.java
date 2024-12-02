import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SqueakyClean {
	/**
	 * Replaces spaces with underscores, converts letters to uppercase after hyphens,
	 * replaces leetspeak characters with their corresponding letters, and removes
	 * non-alphabetic characters.
	 *
	 * @param identifier the input string to be processed
	 * @return the processed string
	 */
	static String clean ( String identifier ) {
		// Step 1: Replace spaces with underscores
		String step1 = identifier.replaceAll("\\s", "_");

		// Step 2: Convert letters to uppercase after hyphens
		Matcher matcher = Pattern.compile ( "-(\\w)" ).matcher ( step1 );
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
		}
		matcher.appendTail(sb);

		// Step 3: Replace leetspeak characters with their corresponding letters

		String step2 = sb.toString();


		String step3 = step2.replaceAll("4", "a")
				.replaceAll("3", "e")
				.replaceAll("0", "o")
				.replaceAll("1", "l")
				.replaceAll("7", "t");

		// Step 4: Remove non-alphabetic characters
		String step4 = step3.replaceAll("[^a-zA-Z_]", "");

		return step4;
	}
	}

/**
 * @author Lucas Levy Peruchi
 * @version 1.0
 * @since 2021-05-25
 */


public class Lasagna {

	/**{@code @method} expectedMinutesInOven is a public and int for can return an int value.
	 * @return a valour of 40.
	 */

	public int expectedMinutesInOven ( ) {
		return 40;

	}

	/**{@code @method} remainingMinutesInOven is a public and int for can return an int value.
	 * @param actualMinutes create a int variable for receiver some valour extern of this method.
	 * @return with a method - variable for the receive the remainingMinutesInOven.
	 */

	public int remainingMinutesInOven ( int actualMinutes ) {
		return expectedMinutesInOven() - actualMinutes;
		}

	/**{@code @method} preparationTimeInMinutes is a public and int for can return an int value.
	 * @param amountLayers create a int variable for receive some valour of Layers.
	 * @return a multiplication of 2 minutos for each layer.
	 */

	public int preparationTimeInMinutes ( int amountLayers ) {
 	        return amountLayers * 2;
	}

	/**{@code @method} totalTimeInMinutes is a public and int for can return an int value.
	 * @param amountLayers receive a int variable for receive some valour of Layers extern of this method.
	 * @param actualMinutes receive a int variable for receive some valour of actualMinutes extern of this method.
	 * @return a method preparationTimeInMinutes with the int amountLayers and sum with the int actualMinutes.
	 */

	public int totalTimeInMinutes ( int amountLayers , int actualMinutes ) {
		return preparationTimeInMinutes(amountLayers) + actualMinutes;

	}

     //Only use this to define the  names of my methods !!!
	// TODO: define the 'expectedMinutesInOven()' method
 	// TODO: define the 'remainingMinutesInOven()' method
 	// TODO: define the 'preparationTimeInMinutes()' method
 	// TODO: define the 'totalTimeInMinutes()' method
}

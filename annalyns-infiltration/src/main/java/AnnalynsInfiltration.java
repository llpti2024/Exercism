public class AnnalynsInfiltration {


	/**
	 * {@code @metho} This method check its possibility to make a fast attack.
	 *
	 * @param knightIsAwake its check if the knight is awake
	 *
	 * @return if knight is sleep return true.
	 */
	public static boolean canFastAttack ( boolean knightIsAwake ) {
		return ! knightIsAwake;

	}

	/**
	 * {@code @metho} This method check its possibility to make a spy.
	 *
	 * @param knightIsAwake   its check if the knight is awake
	 * @param archerIsAwake   its check if the archer is awake
	 * @param prisonerIsAwake its check if the prisoner is awake
	 *
	 * @return only if knight, archer or prisoner is awake return true .
	 */

	public static boolean canSpy ( boolean knightIsAwake , boolean archerIsAwake , boolean prisonerIsAwake ) {
		return knightIsAwake || archerIsAwake || prisonerIsAwake;
	}

	/**
	 * {@code @metho} This method check its possibility to make a signal.
	 *
	 * @param archerIsAwake   its check if the archer is awake
	 * @param prisonerIsAwake its check if the prisoner is awake
	 *
	 * @return if archer sleep and prisoner is awake return true else return false.
	 */


	public static boolean canSignalPrisoner ( boolean archerIsAwake , boolean prisonerIsAwake ) {
		return ! archerIsAwake && prisonerIsAwake;
	}

	/**
	 * {@code @method} checks if it's possible to free a prisoner.
	 *
	 * @param knightIsAwake   Is the knight awake?
	 * @param archerIsAwake   Is the archer awake?
	 * @param prisonerIsAwake Is the prisoner awake?
	 * @param petDogIsPresent Is the pet dog present?
	 *
	 * @return Returns true if the prisoner can be freed based on the following conditions:
	 * The prisoner is awake and the pet dog is present, regardless of the knight and archer's state.
	 * The knight is asleep, the archer is awake, the prisoner is awake, and the pet dog is present.
	 * The knight and archer are asleep, the prisoner is awake, and the pet dog is not present.
	 * The knight and archer are asleep, the prisoner is asleep, and the pet dog is present.
	 * The knight is awake, the archer is asleep, the prisoner is asleep, and the pet dog is present.
	 * /Otherwise, returns false.
	 */

	public static boolean canFreePrisoner ( boolean knightIsAwake , boolean archerIsAwake , boolean prisonerIsAwake ,
	                                        boolean petDogIsPresent ) {
		if ( knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == true ) {
			return true;
		}
		else if ( knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == true ) {
			return true;
		}
		else if ( knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == false ) {
			return true;
		}
		else if ( knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == true ) {
			return true;
		}
		else if ( knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == true ) {
			return true;
		}
		else {
			return false;
		}
		/**Other Solution  i found is return (!knightIsAwake && !archerIsAwake && prisonerIsAwake) || (!archerIsAwake&& petDogIsPresent);  */
	}
}

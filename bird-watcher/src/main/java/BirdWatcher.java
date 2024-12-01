
class BirdWatcher {
	private final int[] birdsPerDay;

	public BirdWatcher ( int[] birdsPerDay ) {
		this.birdsPerDay = birdsPerDay.clone ( );
	}


	/**
	 * {@code @method} getLastWeek is a method that returns last week's counts.
	 *
	 * @return will return a new int with array size of 7
	 */
	public int[] getLastWeek ( ) {
		return new int[] { 0 , 2 , 5 , 3 , 7 , 8 , 4 };
	}

	/**
	 * {@code @method} getToday is a method that returns today's count.
	 *
	 * @return will return the last element of the array
	 */

	public int getToday ( ) {
		return birdsPerDay[ birdsPerDay.length - 1 ];
	}

	/**
	 * {@code @method} incrementTodaysCount is a method that increments today's count
	 *
	 * @return will sum one to the last element of the array
	 */
	public void incrementTodaysCount ( ) {
		birdsPerDay[ birdsPerDay.length - 1 ]++;
	}

	/**
	 * {@code @method} hasDayWithoutBirds is a method that checks if there was a day with no visiting birds
	 * I will use for each loop to do this.
	 *
	 * @return will return true if there was a day with no visiting birds .
	 */

	public boolean hasDayWithoutBirds ( ) {
		for ( int count : birdsPerDay ) {
			if ( count == 0 ) {
				return true;
			}
		}
		return false;
	}

	/**
	 * {@code @method} getCountForFirstDays is a method that returns the number of visiting birds for the first number of days.
	 * @param numberOfDays its for limit the count.
	 *  I will use for loop to do this.
	 * And I need create a daysToCount variable to limit the count. with a Math.min method
	 * because its for the loop don't want to go over the length of the array
	 * @return will return the number of visiting birds for the first day of the last week but limit the count to the specified number
	 * of days from the beginning of the week.
	 * */


	public int getCountForFirstDays ( int numberOfDays ) {
		int count = 0;
		int daysToCount = Math.min(numberOfDays, birdsPerDay.length);
		for (int i = 0; i < daysToCount; i++) {
			count += birdsPerDay[i];
		}
		return count;
	}
  /**
   * {@code @method} getBusyDays is a method that returns the number of busy days.
   * I will use for loop to do this  and if count >= 5 busyDays++.
   * @return will return the number of busy days.
   * */
	public int getBusyDays ( ) {
		int busyDays = 0;
		for (int count : birdsPerDay) {
			if (count >= 5) {
				busyDays++;
			}
		}
		return busyDays;
	}
	}

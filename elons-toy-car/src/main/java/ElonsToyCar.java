import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

/**{@code @Class} ElonsToyCar I implement functions for the Elon's Toy Car for buy, for showing the distance driven and the battery percentage and  for executing the drive function.
 * {@code @Attribute} distance, battery
 * {@code @Methods} buy, distanceDisplay, batteryDisplay, drive  **/
public class ElonsToyCar {
	int distance = 0;
	int battery = 100;

	/**
  * {@code @method} buy Start a new car
  * @return new ElonsToyCar.
  * **/
	public static ElonsToyCar buy ( ) {
		return new ElonsToyCar ( );
	}

	/**
	 * {@code @method} distanceDisplay Show  in the LED display the distance driven in meters
	 * @return String in the display.
	 ***/
	public String distanceDisplay ( ) {
		return "Driven " + this.distance + " meters";
	}

	/**
	 **{@code @method}  batteryDisplay Show in the LED display the battery percentage
	 * @return a String in the display with some conditions for the battery percentage
	 ***/
	public String batteryDisplay ( ) {
		if ( this.battery < 1 ) {
			return "Battery empty";
		}
		else {
			return "Battery at " + this.battery + "%";
		}
	}

	/**{@code @method} drive Update the number of meters driven when driving and the battery percentage when driving
	 * @return with some conditions for the battery percentage or return a message in the display or update the distance and the battery.
	 ***/

	public void drive ( ) {
		if ( this.battery < 1 ) {
	     getMessage ();
		}
		else {
			this.distance = distance + 20;
			this.battery = battery - 1;
		}

	}

	/**
	 * {@code @method} getMessage  its created for showing a message in the display when the battery is
	 * drained because for good pratice its better a method String then a System.out in the display .
	 * @return a String in the display
	 ***/
	public String getMessage() {
	return "...\n Drain the Battery";
		}

}

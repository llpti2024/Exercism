import javax.swing.*;

/**
 * {@code @Class NeedForSpeed} I created 4 variables  for can use getters and setters  inside the methods  and use in
 * another class.
 * <p>
 * {@code @var} speed I will use  inside the constructor  and inside the method drive for get the distanced drive.
 * {@code @var} batteryDrain I will use  inside the constructor  and inside the method  batteryDrained  to do a
 * condition
 * for the method drive  work when  set the valour about the battery.
 * {@code @var} battery I will use  inside the constructor  and inside the method  batteryDrained  to do a condition
 * for the
 * method drive  work when  set the valour about the battery.
 * {@code @var} distanceDriven I will use  inside the constructor  and inside the method  distanceDriven to return the
 * distance and  for  inside the method drive  to set the real valour of the distance..
 **/
class NeedForSpeed {
	int speed;
	int batteryDrain;
	int battery;
	int distanceDriven;

	/**
	 * {@code @Constructor NeedForSpeed} my new car need set the speed  and  the batteryDrain and I set fix valours to
	 * the battery  and the distanceDriven..
	 **/
	NeedForSpeed ( int speed , int batteryDrain ) {
		this.setSpeed ( speed );
		this.setBatteryDrain ( batteryDrain );
		this.setBattery ( 100 );
		this.setDistanceDriven ( 0 );
	}

	/**
	 * {@code @Method batteryDrained} I will use  inside the method drive  to do a condition  for the method drive
	 * work when  set the valour about the battery.
	 *
	 * @return do the firts condition abou the battery is drained or not
	 **/
	public boolean batteryDrained ( ) {
		return this.getBattery ( ) < this.getBatteryDrain ( );
	}

	/**
	 * {@code @Method distanceDriven} I will use  inside the method drive  to set the real valour of the distance
	 * drived.
	 *
	 * @return the distance drived
	 **/
	public int distanceDriven ( ) {
		return this.getDistanceDriven ( );
	}

	/**
	 * {@code @Method drive} I will use  method batteryDrained  to do a condition when the boolean is false set the
	 * valour about the battery and distance.
	 **/
	public void drive ( ) {
		if ( ! this.batteryDrained ( ) ) {
			this.setBattery ( this.getBattery ( ) - this.getBatteryDrain ( ) );
			this.setDistanceDriven ( this.getDistanceDriven ( ) + this.getSpeed ( ) );
		}


	}

	/**
	 * {@code @Method nitro} I will created a diferent and specific car with a static method.
	 *
	 * @return the new NeedForSpeed Nitro Car
	 **/
	public static NeedForSpeed nitro ( ) {
		return new NeedForSpeed ( 50 ,
		                          4 );
	}

	/**
	 * {@code @getter} speed
	 **/
	public int getSpeed ( ) {
		return speed;
	}

	/**
	 * {@code @setter} speed
	 **/
	public void setSpeed ( int speed ) {
		this.speed = speed;
	}

	/**
	 * {@code @getter} batteryDrain
	 **/
	public int getBatteryDrain ( ) {
		return batteryDrain;
	}

	/**
	 * {@code @setter} batteryDrain
	 **/
	public void setBatteryDrain ( int batteryDrain ) {
		this.batteryDrain = batteryDrain;
	}


	/**
	 * {@code @getter} battery
	 **/
	public int getBattery ( ) {
		return battery;
	}

	/**
	 * {@code @setter} battery
	 **/
	public void setBattery ( int battery ) {
		this.battery = battery;
	}

	/**
	 * {@code @getter} distanceDriven
	 **/
	public int getDistanceDriven ( ) {
		return distanceDriven;
	}

	/**
	 * {@code @setter} distanceDriven
	 **/
	public void setDistanceDriven ( int distanceDriven ) {
		this.distanceDriven = distanceDriven;
	}
}

/**
 * {{@code @Code} @Class RaceTrack} I will use to start the race and verifie if the car can finish the race or not
 * <p>
 * {@code @var} distance to set the valour of the distance final
 **/
class RaceTrack {
	int distance;

	/**
	 * {@code @constructor} RaceTrack use  a int to set the valour of the distance
	 **/
	RaceTrack ( int distance ) {
		setDistance ( distance );
	}

	/**
	 * {@code @Method canFinishRace} I will use  this method to verifie if the car can finish the race or not . I used
	 * Getters and Setters  created in the other class to do a condition
	 *
	 * @return true or false
	 **/
	public boolean canFinishRace ( NeedForSpeed car ) {
		if ( ( getDistance ( ) <= ( ( car.getBattery ( ) / car.getBatteryDrain ( ) ) * ( car.getSpeed ( ) ) ) ) ) {
			return true;
		}
		else {
			return false;
		}

	}

	/**
	 * {@code @getter} distance
	 **/
	public int getDistance ( ) {
		return distance;
	}

	/**
	 * {@code @setter} distance
	 **/
	public void setDistance ( int distance ) {
		this.distance = distance;
	}
}

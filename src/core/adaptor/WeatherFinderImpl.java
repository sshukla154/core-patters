package core.adaptor;

import java.util.Random;

public class WeatherFinderImpl implements WeatherFinder {

	@Override
	public int find(String city) {
		return new Random().nextInt(40);
	}

}

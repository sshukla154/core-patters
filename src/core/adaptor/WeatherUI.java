package core.adaptor;

public class WeatherUI {

	public void showTemperature(int zipcode) {
		/*
		 * Can't use WeatherFinder because in WF we have a API which takes city as INPUT
		 * and then gives the tempature. So we need to implement Adaptor which takes
		 * city zipcode and convert it into city by some other api and finally return
		 * temperature
		 * 
		 */
//		WeatherFinder finder = new WeatherFinderImpl();
//		finder.find(city);

		WeatherAdapter weatherAdapter = new WeatherAdapter();
		System.out.println(weatherAdapter.findTemperature(19406));
	}
	
	public static void main(String[] args) {
		new WeatherUI().showTemperature(19406);
	}

}

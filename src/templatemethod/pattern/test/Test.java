package templatemethod.pattern.test;

import templatemethod.pattern.CSVDataRenderer;
import templatemethod.pattern.DataRenderer;
import templatemethod.pattern.XMLDataRenderer;

public class Test {

	public static void main(String[] args) {

		DataRenderer xmlDataRenderer = new XMLDataRenderer();
		xmlDataRenderer.render();
		DataRenderer csvDataRenderer = new CSVDataRenderer();
		csvDataRenderer.render();
	}

}

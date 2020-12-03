package core.templatemethod.test;

import core.templatemethod.CSVDataRenderer;
import core.templatemethod.DataRenderer;
import core.templatemethod.XMLDataRenderer;

public class Test {

	public static void main(String[] args) {

		DataRenderer xmlDataRenderer = new XMLDataRenderer();
		xmlDataRenderer.render();
		DataRenderer csvDataRenderer = new CSVDataRenderer();
		csvDataRenderer.render();
	}

}

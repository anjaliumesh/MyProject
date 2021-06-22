package alpha;

import org.apache.logging.log4j.*;

public class demo {

	private static Logger Log=LogManager.getLogger(demo.class.getName());
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.debug("i m clicking on the button");
		Log.info("button is present");
		Log.error("button is not displayed ");
		Log.fatal("button is missing on the page");
	}

}

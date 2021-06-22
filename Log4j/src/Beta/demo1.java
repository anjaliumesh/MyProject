package Beta;

import org.apache.logging.log4j.*;

public class demo1 {

	private static Logger Log=LogManager.getLogger(demo1.class.getName());
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.debug("i m clicking on the button"); /// put all ur actions in debug metod
		Log.info("button is present"); 
		Log.error("button is not displayed ");
		Log.fatal("button is missing on the page");
	}

}

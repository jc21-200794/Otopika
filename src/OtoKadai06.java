import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 *
 */


/**
 * @author AB2B02
 *
 */
public class OtoKadai06  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Otopika oto1 = new Otopika();
		Otopika oto2 = new Otopika();
		oto1.powerOn();
		oto2.powerOn();
		while(true) {
			oto2.lightRed();
			oto1.lightGreen();
			oto1.sleep();
			oto1.sleep();
			oto1.sleep();
			oto1.sleep();
			oto1.sleep();
			oto1.sleep();
			oto1.sleep();
			oto1.sleep();
			oto1.sleep();
			oto1.sleep();
			
			oto1.lightYellow();
			oto1.sleep();
			oto1.sleep();
			
			oto1.lightRed();
			oto1.sleep();
			oto1.lightOff();
			oto1.sleep();
			
			oto2.lightGreen();
			oto2.sleep();
			oto2.sleep();
			oto2.sleep();
			oto2.sleep();
			oto2.sleep();
			oto2.sleep();
			oto2.sleep();
			oto2.sleep();
			oto2.sleep();
			oto2.sleep();
			oto2.sleep();
			
			oto2.lightYellow();
			oto2.sleep();
			oto2.sleep();
			
			oto2.lightRed();
			oto2.sleep();
			oto2.lightOff();
			oto2.sleep();
		}

	}

}

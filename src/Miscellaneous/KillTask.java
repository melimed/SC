package Miscellaneous;

import org.openqa.selenium.os.WindowsUtils;

public class KillTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//only works on windows os
		WindowsUtils.killByName("notepad.exe");

	}

}

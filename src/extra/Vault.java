package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vault{
	Random randy = new Random();
	int code = randy.nextInt(1000001);
	

		
		
	
	
	boolean tryCode(int trycode) {
	
			return trycode == code;
		
		
			
		
	}
}

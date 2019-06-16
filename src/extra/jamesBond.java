
public class jamesBond {

	public static void main(String[] args) {
		
	 Vault vault = new Vault();
	 
int code = findCode(vault);
System.out.println(code);
	}
static int findCode(Vault vault) {
	for (int i = 0; i < 1000001; i++) {
		if(vault.tryCode(i)) {
			return i;
		}
		
	
	}
	return -1;
}
}


public class testcase1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shiftcipher cc = new shiftcipher();
		int pt = 1001;
		int key = 234231;
		int ct = cc.encrypt(pt, key);
		int dt = cc.decrypt(ct, key);
		System.out.println("The plaintext is: " + pt);
		System.out.println("The key is: " + key);
		
		System.out.println("After encryption: " + ct);
		System.out.println("After decryption: " + dt);
	}

}

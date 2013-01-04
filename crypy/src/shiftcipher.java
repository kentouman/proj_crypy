
public class shiftcipher {
	public int encrypt(int plaintext, int key)
	{
		return (plaintext + key);
	}
	
	public int decrypt(int ciphertext ,int key)
	{
		return(ciphertext - key);
	}
}

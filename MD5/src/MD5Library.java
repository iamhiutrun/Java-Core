import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Library {
	public static String md5(String pass) {
		String result ="";
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("MD5");
			digest.update(pass.getBytes());
			BigInteger bigInteger = new BigInteger(1,digest.digest());
			result = bigInteger.toString();
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(MD5Library.md5("CT040320"));
	}
}



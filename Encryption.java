package crypto;

import java.security.MessageDigest;

public class Encryption {
	
	
	// take a string input and return a hashed string using SHA-256 cryptographic algorithm
	public static String sha256() {
		
		try {
			MessageDigest sha = MessageDigest.getInstance("SHA-256");
			
			int i = 0;
			
			byte[] hash = sha.digest(input.getBytes("UTF-8"));
			
			
			// store the hexadecimal hash
			StringBuffer hexHash = new StringBuffer();
			
			while(i< hash.length) {
				
				String hex = Integer.toHexString(0xff & hash[i]);
				
				if (hex.length() == 1) {
					hexHash.append('0');
				}
				
				hexHash.append(hex);
				i++;
			}
			
       // return hexadecimal hash as string value
			return hexHash.toString();
			
		} catch(Exception e) {
			throw new RuntimeException(e);
		}

	}

}

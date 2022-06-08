package crypto;

import java.util.Date;

public class Block extends Encryption {

	// Blockchain features:
  
  // current hash
	public String hash;
  
  // previous hash
  public String previousHash;
  
  // transaction data
  private String data;
  
  // timestamp (cronological order of block connection)
  private long timeStamp;
	
    
    // Block constructor
    public Block(String data, String previousHash) {
    	
    	this.data = data;
    	this.previousHash = previousHash;
    	this.timeStamp = new Date().getTime();
    	this.hash = calculateHash();
    }
	
  
	// calculateHash() function
    public String calculateHash() {
    		
      
    		// function to calculate hash value defined in class Encryption
    	String calculatedHash = Encryption.sha256(previousHash + Long.toString(timeStamp) + data);
    		
    	return calculatedHash;
    		
    }
    
	
}

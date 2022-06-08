package crypto;

import java.util.ArrayList;

public class BlockList {
		
  
    // ArrayList to store blocks and respective hash values
		public static ArrayList<Block> blockchain = new ArrayList<Block>();
		

		// Driver code
		public static void main(String[] args) {
			
      
			// adding blocks+hashes to the ArrayList
			blockchain.add(new Block("Block 1", "0"));
			blockchain.add(new Block("Block 2", blockchain.get(blockchain.size() - 1).hash));
			blockchain.add(new Block("Block 3", blockchain.get(blockchain.size() - 1).hash));
			blockchain.add(new Block("Block 4", blockchain.get(blockchain.size() - 1).hash));
			blockchain.add(new Block("Block 5", blockchain.get(blockchain.size() - 1).hash));
		}
		
	}

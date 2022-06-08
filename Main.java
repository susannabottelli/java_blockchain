package cryto;

//Java class implementation to check validity of the blockchain

public class Main extends GFG{
  
//Function to check the validity of the blockchain
  
public static Boolean isChainValid()
{
 Block currentBlock;
 Block previousBlock;

  
 // Iterating through all the blocks
  
 for (int i = 1;
      i < blockchain.size();
      i++) {

   
     // Storing the current block and the previous block in two variables
   
     currentBlock = blockchain.get(i);
     previousBlock = blockchain.get(i - 1);

   
     // Checking whether the CURRENT hash is equal to the calculated hash
   
     if (!currentBlock.hash
              .equals(
                  currentBlock
                      .calculateHash())) {
         System.out.println(
             "Hashes are not equal");
         return false;
     }

   
     // Checking whether the PREVIOUS hash is equal to the calculated hash
   
     if (!previousBlock
              .hash
              .equals(
                  currentBlock
                      .previousHash)) {
         System.out.println(
             "Previous Hashes are not equal");
         return false;
     }
 }

 // THE BLOCKCHAIN IS VALID ONLY IF ALL THE HASHES CORRESPOND TO THE CALCULATED HASHES
 return true;
}
}

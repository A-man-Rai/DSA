import java.util.Arrays;
class QuadraticProbing{
    String[] hashTable;
    int usedNoOfCells;

    QuadraticProbing(int size){
       hashTable=new String[size];
    }

    public int hashCode(String word,int size){
     return (word.hashCode() & Integer.MAX_VALUE) % size;
    }

    public double getLoadFactor(){
        return usedNoOfCells*1.0/hashTable.length;
    }

    public void insertInTable(String word){
        double loadfactor=getLoadFactor();
       if(loadfactor>=0.7){
           rehash();
           return;
        }
         int index=hashCode(word,hashTable.length);
         int counter=0;
         int i=index;
         while(i<hashTable.length){
            if(hashTable[i]==null){
               break;  
            }
            counter++;
            i=index+(counter*counter);
         }
         if(i>=hashTable.length){
            rehash();
          }
          usedNoOfCells++;
          hashTable[i]=word;        
    }

    public void rehash(){
       
        String[] temp=new String[hashTable.length];
        for(int i=0;i<hashTable.length;i++){
            temp[i]=hashTable[i];
        }
        hashTable=new String[hashTable.length*2];
        usedNoOfCells=0;
        for(int i=0;i<temp.length;i++){
         if(temp[i]!=null){
            insertInTable(temp[i]); 
           }    
        }

    }
  
    public void hashTable(){
        System.out.println("--HASH TABLE--");
        for(int i=0;i<hashTable.length;i++) {
         System.out.println("ITEM IN INDEX "+i+" "+hashTable[i]);
        }
    }

    public boolean contains(String word){
        int index=hashCode(word,hashTable.length);
        int counter=0;
        for(int i=index;i<hashTable.length;i=index+(counter*counter)){
         if(hashTable[i]!=null && hashTable[i].equals(word)){
            System.out.println("FOUND IN INDEX "+i);
            return true;
         }
         else{
            counter++;
         }
        }
        System.out.println("NOT FOUND IN TABLE");
        return false;
    }


    public static void main(String args[]){
    QuadraticProbing hash=new QuadraticProbing(10);
    hash.insertInTable("DSA");
    hash.insertInTable("DSA");
    hash.insertInTable("DSA");
    hash.insertInTable("DSA");
    //hash.insertInTable("DSA");
   
    hash.hashTable();
    System.out.println(hash.usedNoOfCells);
   hash.contains("DSA");

    }
}
import java.util.ArrayList;
class LinearProbing{
    ArrayList<String> hashTable;
    int usedNoOfCells;

    LinearProbing(int size){
      hashTable=new ArrayList<String>(size);
      for(int i=0;i<size;i++){
         hashTable.add(null);
       }
    }

    public int hashCode(String str,int size){
        return (str.hashCode() & Integer.MAX_VALUE) % size;
    }

    public double getLoadFactor(){
        return usedNoOfCells*1.0/hashTable.size();
    }

    public void insertInTable(String word){
      double loadfactor=getLoadFactor();
        if(loadfactor>=0.75){
          rehash(word);
        }
        else{
            int index=hashCode(word,hashTable.size());
            while(index < hashTable.size() && hashTable.get(index) != null) {
                System.out.println(index + " IS OCCUPIED TRYING NEXT INDEX");
                index++;
            }
            
            if (index >= hashTable.size()) {
                rehash(word);
                return;
            }
            
            usedNoOfCells++;
            hashTable.set(index, word);
            
        }
    }
     
    public void rehash(String word){
      usedNoOfCells=0;
      ArrayList<String> temp=new ArrayList<>(hashTable.size());
      for(String ele : hashTable){
          temp.add(ele);
      }
      int length=hashTable.size()*2;
      hashTable=new ArrayList<String>(length);
      
       for(int i=0;i<length;i++){
          hashTable.add(null);
       }
       for(String ele : temp){
            if(ele!=null){
                insertInTable(ele);
            }     
        }
        insertInTable(word);
    }
    
    public void hashTable(){
        System.out.println("----HASH TABLE-----");
        for(int i=0;i<hashTable.size();i++){
           System.out.println("INDEX "+i+" ELEMENT "+ hashTable.get(i));
        }
    }

   public boolean contains(String word){
      int index=hashCode(word,hashTable.size());
      for(int i=index;i<hashTable.size();i++){
          if(hashTable.get(i)!=null && hashTable.get(i).equals(word)){
            System.out.println("FOUND AT LOCATION: "+i);
            return true;
          }
      }
      System.out.println("NOT FOUND IN TABLE");
      return false;
   }

   public void delete(String word){
   int index=hashCode(word,hashTable.size());
   for(int i=index;i<hashTable.size();i++){
    if(hashTable.get(i)!=null && hashTable.get(i).equals(word)){
      hashTable.set(i,null);
      System.out.println("DELETED FROM TABLE");
      return;
     }
   }
   System.out.println("VALUE NOT FOUND IN TABLE");
   }

    public static void main(String[] args) {
         LinearProbing hash=new LinearProbing(10);
         hash.insertInTable("DSA");
         hash.insertInTable("DSA");
         hash.insertInTable("DSA");
         hash.insertInTable("DSA");
         hash.insertInTable("JAVA");
         hash.insertInTable("REACT"); 
         hash.insertInTable("dsa");

         hash.hashTable();
        hash.contains("asdasdas");
        hash.delete("aasdnajnknsd");
       // hash.hashTable();
        }
}
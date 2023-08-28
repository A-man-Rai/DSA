import java.util.ArrayList;
import java.util.LinkedList;
class DirectChaining{
    ArrayList<LinkedList<String>> hashTable;
    DirectChaining(int size){
        hashTable=new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            hashTable.add(new LinkedList<>());
        }
    }
    
    public int hashCode(String str){
        return (str.hashCode() & Integer.MAX_VALUE) % hashTable.size();
    }

    public void insert(String str){
        int index=hashCode(str);
        hashTable.get(index).add(str);
    }

    public void hashTable(){
        System.out.println("---HASH-TABLE---");
        for(int i=0;i<hashTable.size();i++){
           System.out.println("ELEMENT AT INDEX "+i+" "+hashTable.get(i)); 
        }
    }
    

    public boolean search(String str){
        int index=hashCode(str);
        if(hashTable.get(index)!=null && hashTable.get(index).contains(str)){
            System.out.println("FOUND AT INDEX: "+index);
            return true;
        }
        System.out.println("NOT FOUND IN TABLE");
        return false;
    }

    public void delete(String str){
        int index=hashCode(str);
        boolean result=search(str);
        if(result){
            hashTable.get(index).remove(str);
            System.out.println("deleted");
        }
        else{
            System.out.println("NOT FOUND IN TABLE");
        }
      
        
    }
     
     
    public static void main(String args[]){
     DirectChaining hash=new DirectChaining(5);
     hash.insert("dsa");
     hash.insert("java");
     hash.insert("web");
     hash.insert("REACT");
     hash.insert("express");
     hash.insert("mongo");
     hash.hashTable();
     hash.delete("java");
     hash.hashTable();
    
    }
}
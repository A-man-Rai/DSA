class SearchInString{
    static boolean search(String str,char target){
     if(str.length()==0){
       return false;
     }
     for(int i=0; i<str.length(); i++){
       if(str.charAt(i)==target){
          return true;
       }
     }
     return false;
    }
    public static void main(String args[]){
     String str="amanrai";
    System.out.println(search(str,'x'));
    }
}
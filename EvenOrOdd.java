class EvenOrOdd{
    static boolean isEven(int n){
        return (n & 1)==0 ;
    }
    public static void main(String args[]){
     for(int i=0;i<=50;i++){
       if(isEven(i)){
       System.out.print(i + " ");
       }
     }
    }
}
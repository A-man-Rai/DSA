class NoOFDigits{
    static int noOfDigits(int n){
      int count=0;
        while(n>0){
         count++;
         n=n>>1;
        }
        return count;
    }

    static int digits(int n,int b){
     return (int)(Math.log(n)/Math.log(b))+1;
    }
     public static void main(String args[]){
     System.out.println(digits(8,2));
    }
}
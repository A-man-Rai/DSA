class MagicNumber{
    static int findMagicNumber(int n){
      int ans=0;
      int base=5;
      int digit=0;
      while(n>0){
        digit=n & 1;
        ans += digit*base;
        n=n>>1;
        base*=5;
      }
      return ans;
    }
    public static void main(String args[]){
     System.out.println(findMagicNumber(5));
    }
}
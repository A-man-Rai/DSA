class Pattern3{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
          for(int j=1 ; j<2*n ;j++){
            if(j<=((2*n-i)-n) || j>=(2*n-((2*n-i)-n)) ){
                System.out.print("  ");
            }
            else{
                System.out.print(i+" ");
            }
          }
          System.out.println();
        }
    }

}
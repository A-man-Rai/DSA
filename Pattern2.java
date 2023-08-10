class Pattern2{
    public static void main(String args[]){
     int n=5;
        for(int i=1;i<2*n;i++){
         if(i>n){
            for(int j=0;j<n;j++){////1  //4
               if(j<(n-(2*n-i))){
                  System.out.print(" ");
               }
               else{
                System.out.print("* ");
               }
            }

         }
         else{
            for(int j=n;j>0;j--){
                if(j>i){//1>2
                  System.out.print(" ");
                   continue;   
                  }
                  System.out.print("* ");
              }
         }
       System.out.println();
     } 
    }
}
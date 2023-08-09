class FindNumbers{
    static int findNumbers(int[]arr){
       int ans=0;
       for(int ele : arr){
        if(ele < 0){
            ele*=-1;
        }
        int digit=(int)(Math.log10(ele)+1);
         if((digit & 1) == 0){
             ans++;
         }
       }
       return ans;
    }
    public static void main(String args[]){
     int[]arr={12,345,2,6,7896,12,1,8945,-8655};
     System.out.println(findNumbers(arr));
    }
}
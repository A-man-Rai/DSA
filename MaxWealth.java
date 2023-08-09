class MaxWealth{
    static int findMax(int[][]arr){
       int ans=0;
        for(int[]row:arr){
            int sum=0;
         for(int ele : row){
            sum+=ele;
         }
         if(ans<sum){
           ans=sum;
         }
       }
       return ans;
    }
    public static void main(String args[]){
        int[][]arr={{1,2,3,4},{1,4,4},{1,1,1}};
        System.out.println(findMax(arr));
    }

}
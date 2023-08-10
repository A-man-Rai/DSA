class MissingNo{
    static  int sort(int[]arr){
        int i=0;
        while(i<arr.length-1){
           if(arr[i]<arr.length && arr[i]!=i){
             int temp=arr[i];
             arr[i]=arr[arr[i]];
             arr[temp]=temp;
           }
           else{
            i++;
           }
        }
        for(i=0;i<arr.length;i++){
           if(arr[i]!=i){
               return i;
           }
        }
        return i;
    }
    public static void main(String args[]){
      int[]arr={1,2,0,3,5,4};
      
      System.out.println(sort(arr));
    }
}
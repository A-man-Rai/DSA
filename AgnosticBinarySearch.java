class AgnosticBinarySearch{
    static int search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
            
        while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return arr[mid];
          }
         if(arr[start]<arr[end]){
          if(arr[mid]<target){
            start=mid+1;
            }
            else{
             end=mid-1;
                }
             }
        else{
            if(arr[mid]<target){
            go end=mid-1;
                  }
                  else{
                    start=mid+1;
                  }
             }
            }
              return -1;
}
    public static void main(String args[]){
     int[]arr={10,20,30,40,50,60};
     int[]arr2={60,50,40,30,20,10};
     System.out.println(search(arr,40));
    }
}
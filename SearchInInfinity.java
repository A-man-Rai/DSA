class SearchInInfinity{
    static int SearchInInfinity(int[]arr,int target){
     int start=0;
     int end=1;
     while(arr[end]<target){
        int temp=start;
        start=end+1;
        end=end+(end-temp+1)*2;
     }
     while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
           return arr[mid];
        }
        else if(arr[mid]>target){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
     }
     return -1;
    }
    public static void main(String args[]){
        int[]arr={1,3,5,8,9,10,15,18,20,24,25,26,27,28};
        System.out.println(SearchInInfinity(arr,20));
    }
}
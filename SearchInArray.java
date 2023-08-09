class SearchInArray{

    static int searchInRange(int[]arr,int target,int start ,int end){
        if(arr.length==0){
           return -1;
        }
        for(int i=start;i<=end;i++){
           if(arr[i]==target){
               return arr[i];
           }
        }
        return -1;
    }

    static int maxNumber(int[]arr){
     int max=arr[0];
     for(int ele : arr){
        if(ele>max){
          max=ele;
        }
     }
     return max;
    }
    public static void main(String args[]){
        int[]arr={10,20,4,5,9,11,6,7,15};
        System.out.println(searchInRange(arr,11,1,5));
        System.out.println(maxNumber(arr));
    }
}
class LinearSearch{

    static int search(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int ele : arr){
          if(ele==target){
            return ele;
          }
        }
        return -1;
    }
    public static void main(String args[]){
     int[]nums={10,20,30,40,50,60};
     System.out.println(search(nums,100));

    }
}
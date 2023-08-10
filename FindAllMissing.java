import java.util.ArrayList;
class FindAllMissing{
    static ArrayList<Integer> sort(int[]arr){
   int i=0;
   while(i<arr.length){
         int index=arr[i]-1;
         if(arr[i]!=arr[index]){
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
         }else{
          i++;
         }
      }
      ArrayList<Integer> list= new ArrayList<>();
      for( i=0;i<arr.length;i++){
        if(arr[i]!=i+1){
          list.add(i+1);
        }
      }
      return list;
   }
    public static void main(String args[]){
    int[]arr={4,3,2,7,8,2,3,1};
    System.out.println(sort(arr));
    }
}
import java.util.Arrays;
import java.util.ArrayList;
class ActivitySelectionProblem{
  
    public static ArrayList<Integer> getMaxActivity(int N,int[] startTime,int[]finishTime){
    int arr[][]=new int[N][3];
    for(int i=0;i<arr.length;i++){
      arr[i][0]=i+1;
      arr[i][1]=startTime[i];
      arr[i][2]=finishTime[i];
    }  
    Arrays.sort(arr, (a, b) -> a[2] - b[2]);
    ArrayList<Integer> list=new ArrayList<Integer>();
    int time=arr[0][2];
    list.add(arr[0][0]);
    for(int i=1;i<arr.length;i++){
      if(arr[i][1]>=time){
         list.add(arr[i][0]);
         time=arr[i][2];
      }
       
    }
    return list;
    } 

    public static void main(String args[]){
    int[] startTime={0,3,1,5,5,8};
    int[] finishTime={6,4,2,8,7,9};
    int N=6  ;
   ArrayList<Integer> ans= getMaxActivity(N,startTime,finishTime);
   System.out.println(ans);
    }

}
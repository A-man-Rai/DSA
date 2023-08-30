import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
class Graph{
    ArrayList<Node> list;
    int[][]adjacentMatrix;
   
    public  static class Node{
        String data;
        int index;
        boolean isVisited;
        Node(int index,String data){
          this.data=data;
          this.index=index;
        }
    }

    public Graph(ArrayList<Node> list){
         this.list=list;
         this.adjacentMatrix=new int[list.size()][list.size()];
    }
    

    public void addEdge(int i,int j){
      adjacentMatrix[i][j]=1;
      adjacentMatrix[j][i]=1;
    }


    public void print(){
        for(int row[]:adjacentMatrix){
           for(int ele : row){
              System.out.print(ele+" ");
            }
            System.out.println();
        }
    }


    public ArrayList<Node> getNeighbour(Node node){
    int index=node.index;
    ArrayList<Node>neighbour=new ArrayList<Node>();
     for(int i=0;i<adjacentMatrix.length;i++){
      if(adjacentMatrix[index][i]==1){
         neighbour.add(list.get(i));
       }
      }
      return neighbour;
     }

    public void bfsTraversal(){
      Node node=list.get(0);
      Queue<Node> q=new LinkedList<Node>();
      q.add(node);
      while(!q.isEmpty()){
       Node temp=q.remove();
       temp.isVisited=true;
       System.out.print(temp.data+" ");
       ArrayList<Node>neighbour=getNeighbour(temp);
       for(Node ele : neighbour){
       if(!ele.isVisited){
        q.add(ele);
        ele.isVisited=true;
        }  
       }
      }
    }

     



    public static void main(String args[]){
     ArrayList<Node> list=new ArrayList<>();
     list.add(new Node(0,"A"));
     list.add(new Node(1,"B"));
     list.add(new Node(2,"C"));
     list.add(new Node(3,"D"));
     list.add(new Node(4,"E"));
     Graph graph=new Graph(list);
     graph.addEdge(0,1);
     graph.addEdge(0,2);
     graph.addEdge(0,3);
     graph.addEdge(1,4);
     graph.addEdge(2,3);
     graph.addEdge(3,4);
     graph.print();
     graph.bfsTraversal();

    }
}
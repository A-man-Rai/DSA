import java.util.ArrayList;
import java.util.Stack;
class Topological{
    ArrayList<Node> list;
    static int index;
    
    public class Node{
        String data;
        ArrayList<Node>neighbour;
        int index;
        boolean isVisited;
        
        public Node(int index,String data){
            this.index=index;
            this.data=data;
            this.neighbour=new ArrayList<Node>();
        }
        public Node(String data){
            this.data=data;
            this.neighbour=new ArrayList<Node>();
        }
    }

    public Topological(){
        this.list=new ArrayList<Node>();
    }
    
    public void addVertex(String data){
      Node node =new Node(index,data);
      index++;
      list.add(node);
    }
   
    public void addEdge(int src , int dest){
        if(src < 0 || src >= list.size()){
           System.out.println("ENTER VALID SRC");
           return;
        }
        if(dest < 0 || dest >= list.size()){
           System.out.println("ENTER VALID SRC");
           return;
        }
        
        Node main=list.get(src);
        Node neighbour=list.get(dest);
        main.neighbour.add(neighbour);
    }
  
    public void printGraph(){
        for(Node node : list){
            System.out.print(node.data+"->");
                for(Node temp:node.neighbour){
                System.out.print(temp.data+" ");
                }
           
           System.out.println();
        }
    }

    public void pushNode(Node node , Stack<Node>stack){
        if(node==null){
           return;
        }
       
        ArrayList<Node> neighbours=node.neighbour;
        for(Node neighbour: neighbours){
                pushNode(neighbour,stack);
        }
        if(!node.isVisited){
            node.isVisited=true;
           stack.push(node);
        }
    }

    public void topologicalSort(){
    Stack<Node> stack=new Stack<Node>();
        for(Node node: list){
           if(!node.isVisited){
             pushNode(node,stack);
           }
       }  
       while(!stack.isEmpty()){
           Node node=stack.pop();
           System.out.print(node.data+" ");
       }  
    }
    
   
    public static void main(String[] args) {
    Topological graph=new Topological();
    graph.addVertex("A"); 
    graph.addVertex("B"); 
    graph.addVertex("C"); 
    graph.addVertex("D"); 
    graph.addVertex("E"); 
    graph.addVertex("F"); 
    graph.addVertex("G"); 
    graph.addVertex("H"); 
    graph.addEdge(0,2);
    graph.addEdge(1,2);
    graph.addEdge(1,3);
    graph.addEdge(2,4);
    graph.addEdge(3,5);
    graph.addEdge(4,5);
    graph.addEdge(4,7);
    graph.addEdge(5,6);
    graph.printGraph();
    graph.topologicalSort();

    }
}
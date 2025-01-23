import java.util.*;

class BFT{

	static void bfs(List<List<Integer>> adj, int s,boolean[] visited) {
        	Queue<Integer> q = new LinkedList<>();
        
       		 visited[s] = true;
       		 q.add(s);
       		 while (!q.isEmpty()) {
       		 	int pnode=q.poll();
    			System.out.println(pnode+" ");
   		     	for(int n : adj.get(pnode)){
  		      		if(!visited[n]){
        				visited[n]=true;
        				q.add(n);
        			}
			}
		}	
	}
	static void bft(List<List<Integer>> adj,int s){
		boolean [] visited=new boolean[adj.size()];
		for(int i=0;i<adj.size();i++){
			if(!visited[i]){
				bfs(adj,i,visited);
			}
		}
	}
		
	 static void addEdge(List<List<Integer>> adj, int u, int v) {
       		 adj.get(u).add(v);
       		 adj.get(v).add(u);
    }
public static void main(String[] args) {
      	Scanner sc=new Scanner(System.in);
        int V = 6;
        
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 4, 3);
        addEdge(adj, 3, 5);
        System.out.println("enter the number start");
         int num=sc.nextInt();
        System.out.println("The Breadth first search starting from 4:");
        bft(adj,num);
    }
}

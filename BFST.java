import java.util.*;

class BFST{

	static void bfs(List<List<Integer>> adj, int s) {
        	Queue<Integer> q = new LinkedList<>();
        
       		 boolean[] visited = new boolean[adj.size()];
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
	 static void addEdge(List<List<Integer>> adj, int u, int v) {
       		 adj.get(u).add(v);
       		 adj.get(v).add(u);
    }
public static void main(String[] args) {
      
        int V = 5;
        
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 2, 4);
        System.out.println("The Breadth first search starting from 4:");
        bfs(adj, 4);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static boolean[] visited;
	static int[] res;
	static int index;
	static ArrayList<Integer>[] adj;
    private static void toposort() {
        for(int i=0;i<adj.length;i++) {
        	explore(i);
        }
    }
    private static void explore(int s) {
    	if(!visited[s]) {
    		visited[s]=true;
    		for(int i=0;i<adj[s].size();i++) {
    			explore(adj[s].get(i));
    		}
    		res[index++]=s;
    	}
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        while(true) {
        	adj = (ArrayList<Integer>[])new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < m; i++) {
                int x, y;
                x = scanner.nextInt();
                y = scanner.nextInt();
                adj[y - 1].add(x - 1);
            }
            visited=new boolean[n];
            res=new int[n];
            index=0;
            toposort();
            for(int i=0;i<res.length-1;i++) {
            	System.out.print(res[i]+1+" ");
            }
            System.out.println(res[n-1]+1);
            n=scanner.nextInt();
            m=scanner.nextInt();
            if(n==0)
            	break;
        }
        scanner.close();
    }
}


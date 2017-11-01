import java.util.Scanner;
public class Main {
	static boolean[] visited=new boolean[100];
	static int visitedCount=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        	int n=sc.nextInt();
        	if(n==0)
        		break;
        	sc.nextLine();
        	int[][] edge=new int[n+1][];
        	while(true){
        		String[] oneline=sc.nextLine().split(" ");
        		int index=Integer.parseInt(oneline[0]);
        		if(index==0)
        			break;
        		edge[index]=new int[oneline.length-2];
    			for(int i=1;i<oneline.length-1;i++){
        			edge[index][i-1]=Integer.parseInt(oneline[i]);
    			}
        	}
        	//input reading done
        	//next is to read start index and output answer
        	int count=sc.nextInt();
        	for(int i=0;i<count;i++){
        		visited=new boolean[n+1];
            	visitedCount=0;
        		int startVertex=sc.nextInt();
        		//process
        		dfs(startVertex,edge);
        		//output
        		int unvisitedCount=n-visitedCount;
        		System.out.print(unvisitedCount);
        		for(int j=1;j<=n;j++){
        			if(!visited[j])
        			System.out.print(" "+j);
        		}
        		System.out.println();
        	}
        }
        sc.close();
    }
    
    static void dfs(int startVertex,int[][] edge){
    	for(int i=0;edge[startVertex]!=null && i<edge[startVertex].length;i++){
    		if(!visited[edge[startVertex][i]]){
    			visited[edge[startVertex][i]]=true;
    			visitedCount+=1;
    			dfs(edge[startVertex][i],edge);
    		}
    	}
    }
}

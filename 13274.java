import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testcase=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=testcase;i++){
			String[] s=br.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
			int k=Integer.parseInt(s[1]);
			int[] index=new int[n+1];
			int[][] edge=new int[n+1][n+1];
			for(int j=1;j<n;j++){
				s=br.readLine().split(" ");
				int node1=Integer.parseInt(s[0]);
				int node2=Integer.parseInt(s[1]);
				edge[node1][index[node1]++]=node2;
				edge[node2][index[node2]++]=node1;
			}
			int[] visited=new int[1001];
			visited[1]=1;
			int ans=count(edge,k,1,visited);
			sb.append("Case "+i+": "+ans+"\n");
		}
		System.out.print(sb.toString());
			
	}
	public static int count(int[][] edge,int k,int current,int[] visited){
		int index=0;
		int total=0;
		int count=0;
		int[] accept=new int[1000];
		while(true){
			if(edge[current][index]!=0){
				if(visited[edge[current][index]]==0){
					visited[edge[current][index]]=1;
					accept[index]=count(edge, k,edge[current][index],visited);
					count++;
				}
				index++;
			}
			else{
				if(count<k){
					total=1;
				}
				else{
					Arrays.sort(accept);
					for(int i=0;i<k;i++){
						total+=accept[999-i];
					}
					total+=1;
				}
				break;
			}	
		}
		return total;
	}
}

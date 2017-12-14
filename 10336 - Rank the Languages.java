import java.util.*;
public class Main
{
	static char[][] data;
	static int h,w;
	static int[] x=new int[]{-1,0,1,0};
	static int[] y=new int[]{0,1,0,-1};
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=1;i<=testcase;i++){
			h=sc.nextInt();
			w=sc.nextInt();
			data=new char[h][w];
			for(int j=0;j<h;j++)
				data[j]=sc.next().toCharArray();
			int[] count=new int[26];
			for(int j=0;j<h;j++)
				for(int k=0;k<w;k++){
					if(data[j][k]!='A'){
						count[data[j][k]-'a']++;
						char c=data[j][k];
						data[j][k]='A';
						dfs(c,j,k);
					}
				}
			ArrayList<Model> ans=new ArrayList<Model>();
			for(int j=0;j<26;j++)
				if(count[j]!=0)
					ans.add(new Model((char)('a'+j),count[j]));
			Collections.sort(ans);
			System.out.println("World #"+i);
			for(int j=0;j<ans.size();j++){
				System.out.println(ans.get(j).c+": "+ans.get(j).count);
			}
		}
	}
	public static void dfs(char c,int j,int k){
		for(int i=0;i<4;i++){
			int jnew=j+x[i];
			int knew=k+y[i];
			if(jnew>=0 && jnew<h && knew>=0 && knew<w && data[jnew][knew]!='A' && data[jnew][knew]==c){
				data[jnew][knew]='A';
				dfs(c,jnew,knew);
			}
		}
	}
}
class Model implements Comparable<Model> {
	char c;
	int count;
	Model(char c,int count){
		this.c=c;
		this.count=count;
	}
	public int compareTo(Model other) {

		if(this.count > other.count )
			return -1; 
		else if(this.count < other.count)
			return 1;
		else{
			if(this.c < other.c )
				return -1; 
			else
				return 1;
		}
	} 
}

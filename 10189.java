import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
		char[][] data;
		String line;
		int num=1;
		while(true){
			n=sc.nextInt();
			m=sc.nextInt();
			if(n==0)
				break;
			if(num>1)
				System.out.println();
			data=new char[n][m];
			for(int i=0;i<n;i++){
				line=sc.next();
				for(int j=0;j<m;j++){
					data[i][j]=line.charAt(j)=='*'?'*':'0';
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					if(data[i][j]=='*'){
						if(i-1>=0 && j-1>=0 && data[i-1][j-1]!='*')
							data[i-1][j-1]+=1;
						if(i-1>=0 && data[i-1][j]!='*')
							data[i-1][j]+=1;
						if(i-1>=0 && j+1<m && data[i-1][j+1]!='*')
							data[i-1][j+1]+=1;
						if(j-1>=0 && data[i][j-1]!='*')
							data[i][j-1]+=1;
						if(j+1<m && data[i][j+1]!='*')
							data[i][j+1]+=1;
						if(i+1<n && j-1>=0 && data[i+1][j-1]!='*')
							data[i+1][j-1]+=1;
						if(i+1<n && data[i+1][j]!='*')
							data[i+1][j]+=1;
						if(i+1<n && j+1<m && data[i+1][j+1]!='*')
							data[i+1][j+1]+=1;
					}
				}
			}
			System.out.println("Field #"+(num++)+":");
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
				     System.out.print(data[i][j]);
				}
				System.out.println();
			}
		}
	}
}

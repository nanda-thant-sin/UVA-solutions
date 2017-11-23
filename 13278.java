import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
		 	int n;
		 	n=Integer.parseInt(br.readLine());
		 	if(n==0)
		 	break;
		 	int[] x_forward=new int[10001];
		 	int[] x_backward=new int[10001];
		 	int xmin=10001,xmax=0,x,y,out=0;
		 	for(int i=0;i<n;i++){
				String[] s=br.readLine().split(" ");
				x=Integer.parseInt(s[0]);
				y=Integer.parseInt(s[1]);
				if(x+y<10001){
					x_backward[x+y]++;
					if(x+y<xmin)
						xmin=x+y;
				}
				if(x-y>=0){
					x_forward[x-y]++;
					if(x-y>xmax)
						xmax=x-y;
				}
		 	}
		 	int max=0,count=0;
		 	for(int i=xmin+1;i<=xmax;i++){
		 		count+=x_forward[i];
		 	}
		 	count=n-count;
		 	max=count;
		 	for(int i=xmin+1;i<=xmax;i++){
		 		count+=x_forward[i]-x_backward[i-1];
		 		if(max<count)
		 			max=count;
		 	}
		 	System.out.println(max);
		 }
	}
}

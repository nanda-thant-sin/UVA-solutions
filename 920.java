import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++){
        	int n=sc.nextInt();
        	int ymax=-1;
        	int index=0;
        	double ans=0.0;
        	int[] xcoor=new int[n];
        	int[] ycoor=new int[n];
        	for(int j=0;j<n;j++){
        		xcoor[j]=sc.nextInt();
        		ycoor[j]=sc.nextInt();
        		
        	}
        	
        	//just sorting
        	for(int j=0;j<n;j++){
        		for(int k=j+1;k<n;k++){
        			if(xcoor[j]>xcoor[k]){
        				int temp=xcoor[j];
        				xcoor[j]=xcoor[k];
        				xcoor[k]=temp;
        				temp=ycoor[j];
        				ycoor[j]=ycoor[k];
        				ycoor[k]=temp;
        			}
        		}
        	}
        	
        	//find highest point 
        	for(int j=0;j<n;j++){
        		if(ycoor[j]>=ymax){
        			ymax=ycoor[j];
        			index=j;
        		}
        	}
        	
        	//for second highest point
        	int ySecondMax,secondIndex;
        	while(index!=n-1){
        		ySecondMax=ycoor[index+1];
        		secondIndex=index+1;
        		//find second highest point
        		for(int j=index+2;j<n;j++){
        			if(ycoor[j]>=ySecondMax){
        				ySecondMax=ycoor[j];
        				secondIndex=j;
        			}
        		}
        		//distance between highest point and second highest point
        		double wholeLength= Math.sqrt(Math.pow(xcoor[index]-xcoor[index+1],2)+Math.pow(ycoor[index]-ycoor[index+1],2));
        		//horizontal distance between highest point and second highest point 
        		double wholeHeight=ycoor[index]-ycoor[index+1];
        		//horizontal sunny distance between highest point and second highest point
        		double actualHeight=ycoor[index]-ycoor[secondIndex];
        		//actual sunny distance between highest point and second highest point
        		double actualLength=wholeLength*actualHeight/wholeHeight;
        		ans+=actualLength;
        		//repeat the process until the end
        		ymax=ycoor[secondIndex];
        		index=secondIndex;
        	}
        	System.out.println(df.format(ans));
        }
        sc.close();
    }
}

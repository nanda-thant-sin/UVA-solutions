import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++){
        	int n=sc.nextInt();
        	int degree=90;
        	double x=0.0;
        	double y=0.0;
        	for(int j=0;j<n;j++){
        		String cmd=sc.next();
        		int unit=sc.nextInt();
        		if(cmd.equals("fd")){
        			if(degree>=0 && degree<90){
        				x+=Math.cos(Math.toRadians(degree))*unit;
        				y+=Math.sin(Math.toRadians(degree))*unit;
        			}
        			else if(degree>=90 && degree<180){
        				x-=Math.sin(Math.toRadians(degree-90))*unit;
        				y+=Math.cos(Math.toRadians(degree-90))*unit;
        			}
        			else if(degree>=180 && degree<270){
        				x-=Math.cos(Math.toRadians(degree-180))*unit;
        				y-=Math.sin(Math.toRadians(degree-180))*unit;
        			}
        			else{
        				x+=Math.sin(Math.toRadians(degree-270))*unit;
        				y-=Math.cos(Math.toRadians(degree-270))*unit;
        			}
        		}
        		else if(cmd.equals("bk")){
        			int temp=degree+180;
        			if(temp>360)
        				temp-=360;
        			if(temp>=0 && temp<90){
        				x+=Math.cos(Math.toRadians(temp))*unit;
        				y+=Math.sin(Math.toRadians(temp))*unit;
        			}
        			else if(temp>=90 && temp<180){
        				x-=Math.sin(Math.toRadians(temp-90))*unit;
        				y+=Math.cos(Math.toRadians(temp-90))*unit;
        			}
        			else if(temp>=180 && temp<270){
        				x-=Math.cos(Math.toRadians(temp-180))*unit;
        				y-=Math.sin(Math.toRadians(temp-180))*unit;
        			}
        			else{
        				x+=Math.sin(Math.toRadians(temp-270))*unit;
        				y-=Math.cos(Math.toRadians(temp-270))*unit;
        			}
        		}
        		else if(cmd.equals("lt")){
        			degree+=unit;
        			if(degree>360)
        				degree-=360;
        		}
        		else{
        			degree-=unit;
        			if(degree<0)
        				degree=360+degree;
        		}
        	}
        	double distance=Math.sqrt(x*x + y*y);
        	System.out.println((int)Math.round(distance));
        }
        sc.close();
    }
}

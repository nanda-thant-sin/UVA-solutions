import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=1;
        double radianOf45Degree=Math.toRadians(45);
        DecimalFormat df=new DecimalFormat("0.000");
        while(true){
        	String s=sc.nextLine();
        	if(s.equals("END")){
        		break;
        	}
        	String[] commands=s.split(",");
        	double x=0,y=0;
        	for(int i=0;i<commands.length;i++){
        		String temp=commands[i];
        		int num=0;
        		String direction="";
        		for(int j=0;j<temp.length();j++){
        			char c=temp.charAt(j);
        			if(c>='0' && c<='9')
        				num=num*10+(int)(c-'0');
        			else if(c!='.'){
        				direction+=c;
        			}
        		}
        		if(direction.equals("N")){
        			y+=num;
        		}
        		else if(direction.equals("E")){
        			x+=num;
        		}
        		else if(direction.equals("S")){
        			y-=num;
        		}
        		else if(direction.equals("W")){
        			x-=num;
        		}
        		else if(direction.equals("NW")){
        			x-=Math.sin(radianOf45Degree)*num;
        			y+=Math.cos(radianOf45Degree)*num;
        		}
        		else if(direction.equals("NE")){
        			x+=Math.sin(radianOf45Degree)*num;
        			y+=Math.cos(radianOf45Degree)*num;
        		}
        		else if(direction.equals("SE")){
        			x+=Math.cos(radianOf45Degree)*num;
        			y-=Math.sin(radianOf45Degree)*num;
        		}
        		else{
        			x-=Math.cos(radianOf45Degree)*num;
        			y-=Math.sin(radianOf45Degree)*num;
        		}
        	}
        	double ans=Math.sqrt(x*x + y*y);
        	System.out.println("Map #"+testcase++);
        	System.out.println("The treasure is located at ("+df.format(x)+","+df.format(y)+").");
        	System.out.println("The distance to the treasure is "+df.format(ans)+".\n");
        }
        sc.close();
    }
}


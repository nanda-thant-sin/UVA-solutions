import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int xmax=sc.nextInt();
        int ymax=sc.nextInt();
        HashSet<String> scent=new HashSet<String>();
        String directions="NESW";
        while(sc.hasNext()){
        	boolean isOff=false;
        	int x=sc.nextInt();
        	int y=sc.nextInt();
        	char curr_direction=sc.next().charAt(0);
        	String command=sc.next();
        	for(int i=0;i<command.length();i++){
        		char curr_command=command.charAt(i);
        		if(curr_command=='L'){
        			int index=directions.indexOf(curr_direction);
        			if(index==0)
        				index=4;
        			curr_direction=directions.charAt(index-1);
        		}
        		else if(curr_command=='R'){
        			int index=directions.indexOf(curr_direction);
        			if(index==3)
        				index=-1;
        			curr_direction=directions.charAt(index+1);
        		}
        		else{
        			if(curr_direction=='N'){
        				if(y==ymax){
        					if(!scent.contains(x+" "+y)){
        						isOff=true;
        						scent.add(x+" "+y);
        						break;
        					}
        				}
        				else{
        					y+=1;
        				}
        			}
        			else if(curr_direction=='E'){
        				if(x==xmax){
        					if(!scent.contains(x+" "+y)){
        						isOff=true;
        						scent.add(x+" "+y);
        						break;
        					}
        				}
        				else{
        					x+=1;
        				}
        			}	
        			else if(curr_direction=='S'){
        				if(y==0){
        					if(!scent.contains(x+" "+y)){
        						isOff=true;
        						scent.add(x+" "+y);
        						break;
        					}
        				}
        				else{
        					y-=1;
        				}
        			}
        			else{
        				if(x==0){
        					if(!scent.contains(x+" "+y)){
        						isOff=true;
        						scent.add(x+" "+y);
        						break;
        					}
        				}
        				else{
        					x-=1;
        				}
        			}        			
        		}
        	}
        	System.out.println(x+" "+y+" "+curr_direction+((isOff)?" LOST":""));
        }
        sc.close();
    }
}

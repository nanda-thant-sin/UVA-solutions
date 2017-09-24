import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	int k = sc.nextInt();
        	if(k == 0){
        		break;
        	}
        	boolean flag=true;
        	int m= sc.nextInt();
        	boolean[] isTaken = new boolean[10000];
        	for(int i=0;i<k;i++){
        		isTaken[sc.nextInt()]=true;
        	}
        	for(int i=0;i<m;i++){
        		int c=sc.nextInt();
        		int r=sc.nextInt();
        		int takenCourses=0;
        		for(int j=0;j<c;j++){
        			if(isTaken[sc.nextInt()]){
        				takenCourses+=1;
        			}
        		}
        		if(takenCourses<r){
        			flag=false;
        		}
        	}
        	if(flag){
        		System.out.println("yes");
        	}
        	else{
        		System.out.println("no");
        	}
        }
        sc.close();
    }
}

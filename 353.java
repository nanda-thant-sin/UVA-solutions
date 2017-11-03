import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
        	String s=sc.nextLine();
        	HashSet<String> subString=new HashSet<String>();
        	for(int i=0;i<s.length();i++){
        		for(int j=i+1;j<=s.length();j++){
        			StringBuilder sb1=new StringBuilder(s.substring(i,j));
        			StringBuilder sb2=new StringBuilder(s.substring(i,j));
        			if(sb1.toString().equals(sb2.reverse().toString())){
        				subString.add(sb1.toString());
        			}
        		}
        	}
        	System.out.println("The string "+"\'"+s+"\' contains "+subString.size()+" palindromes.");
        }
        sc.close();
    }
}

import java.util.*;
public class Main
{
  static HashMap<String,Integer> hm = new HashMap<String,Integer>();
	static int num=1;
	public static void main(String[] args){
		addString("a",1);
		addString("ab",2);
		addString("abc",3);
		addString("abcd",4);
		addString("abcde",5);
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.next();
			if(hm.containsKey(s))
			System.out.println(hm.get(s));
			else 
			System.out.println(0);
		}
	}
  static void addString(String s,int length){
		while(true){
			hm.put(s,num);
			num++;
			for(int i=s.length()-1;i>=0;i--){
				if(s.charAt(i)<'z' && ('z'-s.charAt(i))>(s.length()-1-i)){
					char c=(char)(s.charAt(i)+1);
					s=s.substring(0,i)+c;
					while(s.length()<length){
						c=(char)(c+1);
						s+=c;
					}
					break;
				}
			}
			if(hm.containsKey(s))
				break;
		}
		
	}
}

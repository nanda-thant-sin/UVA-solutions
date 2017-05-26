import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] data={2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		while(sc.hasNextLine()){
			String s=sc.nextLine();
			StringBuilder res=new StringBuilder();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)>= 'A' && s.charAt(i)<= 'Z'){
					res.append(data[s.charAt(i)-'A']);
				}
				else res.append(s.charAt(i));
			}
			System.out.println(res.toString());
		}
	}
}

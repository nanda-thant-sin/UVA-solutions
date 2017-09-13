import java.util.Scanner;
/**
 * 
 * @author nanda
 *
 */
class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int caseNo=1;
		while(sc.hasNext()){
			int n=sc.nextInt();
			int count=0;
			for(int i=0;i<n;i++){
				boolean check[]=new boolean[31];
				String s=sc.next();
				int length=s.length();
				s=s.replaceAll(s.charAt(0)+"","");
				check[length-s.length()]=true;
				boolean flag=false;
				if(s.length()!=0){
				   while(s.length()!=0){
					    length=s.length();
						s=s.replaceAll(s.charAt(0)+"","");
						int co=length-s.length();
						if(!check[co]){
							check[length-s.length()]=true;
						}
						else{
							flag=true;
							break;
						}
				   }
				   if(!flag){
					   count++;
				   }
				}
			}
			System.out.println("Case "+(caseNo++)+": "+count);
		}
		sc.close();
	}
}

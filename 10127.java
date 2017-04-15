import java.util.*;
import java.math.*;
class Main
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int output;
		BigInteger curr,a;
	    while(sc.hasNextInt()){
			a=new BigInteger(sc.nextInt()+"");
			output=1;
			curr=new BigInteger("1");
			while(curr.mod(a).intValue()!=0){
				output+=1;
				curr=curr.multiply(BigInteger.valueOf(10));
				curr=curr.add(BigInteger.valueOf(1));
			}
			System.out.println(output);
		}
	}
}

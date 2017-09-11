import java.math.BigInteger;
import java.util.Scanner;
/**
 * 66 power 0 =1
   66 power 1 =66
   66 power 2 =56 <---|
   66 power 3 =96     |
   66 power 4 =36     |
   66 power 5 =76     |
   66 power 6 =16     |
   66 power 7 =56 ----|
 * @author nanda
 *
 */
class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int data[]=new int[5];
		data[0]=56;
		data[1]=96;
		data[2]=36;
		data[3]=76;
		data[4]=16;
		BigInteger ZERO=new BigInteger("0");
		BigInteger ONE=new BigInteger("1");
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++){
			BigInteger bi=new BigInteger(sc.next());
			if(bi.equals(ZERO)){
				System.out.println(1);
			}
			else if(bi.equals(ONE)){
				System.out.println(66);
			}
			else{
				bi=bi.subtract(new BigInteger("2"));
				bi=bi.mod(new BigInteger("5"));
				System.out.println(data[Integer.parseInt(bi.toString())]);
			}
		}
		sc.close();
	}
}

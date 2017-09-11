import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * 
 * @author nanda
 *
 */
class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		DecimalFormat df=new DecimalFormat("0.0000");
		int totalLength;
		int totalHeight;
		double total;
		double taken;
		int corner,n,k;
		String c;
		for(int i=0;i<testcase;i++){
			n=sc.nextInt();
			totalLength=0;
			totalHeight=0;
			total=0.0;
			taken=0.0;
			corner=0;
			for(int j=0;j<n;j++){
				c=sc.next();
				k=sc.nextInt();
				if(c.equals("C")){
					corner++;
					if(corner==2){
						totalLength+=k;
					}
					if(corner==3){
						totalHeight+=k;
					}
					taken+=k*k;
				}
				else if(c.equals("S")){
					taken+=k*k;
				}
				else{
					taken+=k*k*Math.sin(Math.toRadians(60.0))/2.0;
				}
				if(corner==1){
					totalLength+=k;
				}
				else if(corner==2){
					totalHeight+=k;
				}
			}
			total=totalLength * totalHeight;
			
			System.out.println(df.format(total-taken));
		}
		sc.close();
	}
}

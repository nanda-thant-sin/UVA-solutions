import java.io.*;
class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		while (num != -1) {
			if (num % 2 == 0) {
				System.out.println(num + " is not a Jimmy-number");
			} else if(!isPrime(num)){
				long c = shuffle(num);
				if (c == 1) {
					System.out.println(num + " is a Jimmy-number");
				} else {
					System.out.println(num + " is not a Jimmy-number");
				}
			}else{
				System.out.println(num + " is a Jimmy-number");
			}
			num = Long.parseLong(br.readLine());
		}
	}
	static boolean isPrime(long num){
	    if ( num > 2 && num%2 == 0 ) {
	        //System.out.println(num + " is not prime");
	        return false;
	    }
	    long top = (long)Math.sqrt(num)+1;
	    for(long i = 3; i < top; i+=2){
	        if(num % i == 0){
	            //System.out.println(num + " is not prime");
	            return false;
	        }
	    }
	    //System.out.println(num + " is prime");
	    return true; 
	}
	static long shuffle(long num) throws Exception{
		long mid = num / 2 + 1;
		long count = 1;
		long curr = 4;
		while (count!=num-1) {
			if(curr<mid){
				curr=num-(2*(mid-curr-1)+1);
			}else{
				curr=2*(curr-mid)+1;
			}
			count++;
		    if(curr==2){
		    	//System.out.print(count);
		    	return num%count;
		    }
		}
		return 1;
	}
}

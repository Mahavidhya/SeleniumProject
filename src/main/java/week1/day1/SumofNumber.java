package week1.day1;

public class SumofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=546938565,r,sum = 0 ;
		int temp = 0;
		sum=temp;
	
		while(num>0)
		{
			 r=num%10;  //getting remainder 
			 sum=(sum*0)+r; 
			 temp=sum+temp;
			 num=num/10; 
			 		}
		System.out.println(temp);

	}

}

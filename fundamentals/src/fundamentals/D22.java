package fundamentals;

public class D22 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

				int i=0,count=0,input=Integer.parseInt(args[0]);
				if(input!=0&&input!=1)
				{
					for(i=1;i<=input;i++)
					{
					
						if(input%i==0)
							count++;
					}
					
					if(count==2)
						System.out.println(input+" is prime number");
					else
						System.out.println(input+" is not prime number");
				}
				else
					System.out.println(input+" is neither prime nor composite");	
		}
	}

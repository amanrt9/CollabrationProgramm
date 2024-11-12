package vivek;

public class PrintPrimeNumber
{
 public static void main(String[] args)
 {
		        int num = 100;

		        // Loop through numbers from 2 to 100
		        for (int i = 2; i <= num; i++) {
		            boolean isPrime = true;

		            // Check if the number is prime
		            for (int j = 2; j < i; j++) {
		                if (i % j == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }

		            // If the number is prime, print it
		            if (isPrime) {
		                System.out.println(i);
		            }
		        }
		    }
		}



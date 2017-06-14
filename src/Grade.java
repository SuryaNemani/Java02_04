import java.util.Scanner;     // Importing scanner class
public class Grade {
public static void main(String[] args) {   //main
	int a,p,c,m,avg;                       //Initializing
	System.out.println("Enter a number");   
	Scanner Input=new Scanner(System.in);  //new scanner variable
	a=Input.nextInt();                     // Input as a 
   if(a==0){ 								// check weather a is equal to 0
	   System.out.println("The Entered input is equal to 0\n "+a);
   }
   else if(a>0){						// check weather a is greater than 0
	   System.out.println("The Enterd input is greater than 0 \n" +a ) ;
   }
   else						//If both cases are false a is less than 0
      System.out.println("The Entered input is less than 0 \n" +a);
   
   System.out.println("Enter marks in Physics");
   p=Input.nextInt(); 				// Input as p
   System.out.println("Enter marks in chemistry");
   c=Input.nextInt();				//Input as c
   System.out.println("Enter marks in Mathematics");
   m=Input.nextInt();					//Input is m
   avg=((p+c+m)/3) ;				// average of three subjects
   if(avg>70&&avg<100){			// average is greater than 70 and less than 100
	   System.out.println("A Grade");
   }
	   else if (avg>60){			//average is in between 61 and 70
		   System.out.println("B Grade");
	   }
		   else{					// average is less than 61
			   System.out.println("C Grade");
		   }
	   }
   
   
   
}


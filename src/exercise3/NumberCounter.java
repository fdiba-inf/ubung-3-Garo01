package exercise3; 
import java.util.Scanner ;
public class NumberCounter {
public static void main (String[]args){
  Scanner input = new Scanner(System.in); 
  int negative = 0;
  int positive = 0;
  float sum = 0; 
  int number = input.nextInt();
  while (number !=0) {
    if (number>0){positive++;}
    else {negative++;} 
    sum += number;
    number= input.nextInt();
    //sum= sum+number//
  }
  float average = sum/(positive + negative);

 System.out.println("positive");
 System.out.println("negative"+negative);
 System.out.println (sum);
 System.out.println (average);

}
    


  }

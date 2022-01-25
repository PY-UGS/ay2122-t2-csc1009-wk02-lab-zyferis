package lab02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2_wk2 {

  public static void main(String[] args){
      List<String> three_No = new ArrayList<>();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three numbers (x y z): ");
      do 
      {
        String user_input  = input.nextLine();
        String[] space_no = user_input.trim().split("\\s+");
        for(int i =0; i<space_no.length; i++)
        {
          three_No.add(space_no[i]);
        }
      } while (three_No.size() < 3);
      
      float avg = 0;

      for (int i = 0 ; i< 3; i++){
        avg += Float.parseFloat((String) three_No.toArray()[i]);
      }

      avg /= 3.0 ;
      input.close();
      System.out.printf("The average for %s %s %s is %f", three_No.toArray()[0],three_No.toArray()[1],three_No.toArray()[2], avg);
  }
}
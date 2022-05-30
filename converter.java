import java.util.Scanner;

public class converter {
    public static void main(String[]args)
    {
        double inches,feet,centimeter;
        System.out.println("METRIC CONVERTER");
        System.out.println("Enter 1 For Inches 2. For Inches 3. Centimeters");
        Scanner input=new Scanner(System.in);
        double Units;
        Units=input.nextDouble();
        if(Units==1)
        {
         System.out.println("Enter your height in inches");
         inches=input.nextDouble();
         centimeter=inches*2.54;
         System.out.println( centimeter +"Centimeters");
        } else if (Units==2) {
   System.out.println("Enter your height in feet");
           feet=input.nextDouble();
           centimeter=feet*30.48;
           System.out.println(centimeter +"centimeter");
        }
  else {

      System.out.println("Enter the appropriate unit");
        }

    }





}

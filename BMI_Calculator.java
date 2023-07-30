import java.util.Scanner;

public class BMI_Calculator{
    double height;
    double weight;
    public void BmiCalc(Double h, double w ){
        double bmi = w/(Math.pow(h, 2));
        System.out.printf("Bmi is: %.2f\n",bmi);
        if (bmi < 18.5) {
            System.out.println("Under Weight");
        }
        else if (bmi <= 24.9) {
            System.out.println("Healthy Weight");
        }
        else if (bmi <= 39.9) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Weight in Kg: ");
            double weight = sc.nextDouble();
            System.out.print("Enter Height in Meter: ");
            double height = sc.nextDouble();
            BMI_Calculator obj = new BMI_Calculator();
            obj.BmiCalc(height,weight);
        }
    }
}
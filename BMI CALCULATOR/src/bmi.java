import java.util.Scanner;


public class bmi {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    float weightInPounds;
    float weightInInches;
    float BMI;

    System.out.print("Enter the weightInPounds: ");
    weightInPounds = input.nextFloat();

    System.out.print("Enter the weightInInches: ");
    weightInInches = input.nextFloat();

    BMI = (weightInPounds * 703) / (weightInInches * weightInInches);
    System.out.printf("BMI is %f\n", BMI);

    if (BMI <= 18.5)
        System.out.printf("UNDERWEIGHT!");
    if (BMI >= 24.9)
        System.out.printf("NORMAL!");
    if (BMI >=29.9)
        System.out.printf("OVERWEIGHT!");
    if (BMI >= 30)
        System.out.printf("OBESITY!");
}
}

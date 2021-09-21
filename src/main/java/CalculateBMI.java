import java.util.Scanner;

public class CalculateBMI {


    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int weigh = 0, height = 0;
        try {
            System.out.println("Mời nhập số ký ");
            weigh = Integer.parseInt(sc.nextLine());
            System.out.println("Mời nhập chiều cao");
            height = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println(e);
            return;
        }

        try {
            double bmi = BMI.calculateBMI(weigh, height);
            System.out.println("BMI = " + bmi);
        } catch (Exception e) {
            System.out.println(e);
        }

    }


}

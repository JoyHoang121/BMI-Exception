import java.util.Scanner;

public class CalculateBMI {


    public static void main(String[] args) throws CheckException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số ký ");
        double weigh = sc.nextDouble();
        if (weigh <= 0)
            throw new CheckException("Số ký không hợp lệ");

        System.out.println("Mời nhập chiều cao");
        double height = sc.nextDouble();
        if (height <= 0)
            throw new CheckException("Chiều cao không hợp lệ");


        try {
            double bmi = calculateBMI(weigh, height);
            System.out.println("BMI = " + bmi);

            if (bmi < 18.5) {
                System.out.println("Gầy");
            } else if (bmi >= 18.5 && bmi < 24.9) {
                System.out.println("Bình thường");
            } else if (bmi >= 25 && bmi < 29.9) {
                System.out.println("Tăng cân");
            } else if (bmi >= 30 && bmi < 34.9) {
                System.out.println("Béo phì độ 1");
            } else if (bmi >= 35 && bmi < 49.9) {
                System.out.println("Béo phì độ 2");
            } else {
                System.out.println("Béo phì độ 3");
            }
        } catch (ArithmeticException e1) {
            System.out.println("/ 0");
        } catch (NumberFormatException e2) {
            System.out.println("invalid format");
        } catch (Exception e3) {
            e3.printStackTrace();
        }

    }

    public static double calculateBMI(double weigh, double height) {
        double bmi = 0;
        bmi = weigh / (height * height);
        return bmi;

    }
}

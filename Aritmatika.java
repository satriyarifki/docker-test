import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        //System.out.println("Hello docker. :)");
	
	System.out.println("Selamat Pagi Cekgu ");
	
    }

    static void operator(char operator, double val, double val2) {
        switch (operator) {
            case '*':
                double result = (val * val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            case '/':
                result = (val / val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            case '+':
                result = (val + val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            case '-':
                result = (val - val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            default:
                System.out.println("Check operator");
        }
    }
}

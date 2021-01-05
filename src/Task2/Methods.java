package Task2;
import java.util.Scanner;

public class Methods {

    void addition(double a, double b) {
        System.out.println(a+b);
    }

    void subtraction(double a, double b) {
        System.out.println(a-b);

    }

   void division(double a, double b) {
        System.out.println(a/b);
    }

    void multiplication(double a, double b) {
        System.out.println(a*b);
    }


    public static void main(String[] args) {
        Methods methods = new Methods();

        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        try{
            b = scanner.nextInt();
            a = scanner.nextInt();
            methods.addition(a,b);
            methods.subtraction(a,b);
            methods.division(a,b);
            methods.multiplication(a,b);

            if(a < 0 && b < 0)
            { throw new IllegalArgumentException();}
            if(a == 0 && b != 0)
            {throw new ArithmeticException();}
            if(a != 0 && b == 0)
            {throw new ArithmeticException();}
            if (a == 0 && b == 0)
            {throw new IllegalAccessException();}
            if(a > 0 && b > 0)
            {throw new MyException("a > 0 && b > 0");}


        }catch (IllegalAccessException e){
            System.out.println("a == 0 && b == 0 ");
        }
        catch (IllegalArgumentException e){
            System.out.println("a < 0 і b < 0");
        }
        catch (ArithmeticException e ){
            System.out.println("a == 0 && b != 0 або a != 0 && b == 0");
        } catch (MyException e) {
            e.getMessage();
        }

    }
}
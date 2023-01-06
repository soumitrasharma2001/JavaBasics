import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int d;
        //Division by Zero
//        int a;
//        a=sc.nextInt();
//        try{
//            System.out.println(100/a);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Not Defined");
//        }
//        Array Index Exception
//        int []marks=new int[3];
//        marks[0]=7;
//        marks[1]=8;
//        marks[2]=9;
//        a=sc.nextInt();
//        d=sc.nextInt();
//        try{
//            System.out.println(marks[a]/d);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Please Increase the size of an array");
//        }
//        catch(ArithmeticException e){
//            System.out.println("Not defined");
//        }
        int marks[]=new int[3];
        marks[0]=1;
        marks[1]=2;
        marks[2]=3;
            try {
                a = sc.nextInt();
                d = sc.nextInt();
                try {
                    System.out.println(marks[a] / d);
                } catch (ArithmeticException e) {
                    System.out.println("Not Defined!");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Please Increase the size of an Array");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Please enter the numerical value");
            }
    }
}

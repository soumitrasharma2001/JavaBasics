class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can't be negative";
    }
    @Override
    public String getMessage(){
        return "Radius can't be negative value";
    }
}
public class Throws{
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static int divide() throws ArithmeticException{
        try{
            int a=5/0;
            return a;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.exit(0);
        }
        finally{
            System.out.println("This is the end of this program");
        }
        return -1;
    }
    public static void main(String args[]){
//        try{
//            double c=area(-5);
//            System.out.println(c);
//        }
//        catch(NegativeRadiusException e){
//            System.out.println(e);
//        }
        //System.out.println(divide());
        //Note finally will be executed no matter you put break statement.
//        int a=10,b=10;
//        while(true){
//            try{
//                System.out.println(a/b);
//            }
//            catch(ArithmeticException e){
//                System.out.println(e);
//                break;
//            }
//            finally {
//                System.out.println("Cleaning the resources");
//            }
//            b--;
//        }

    }
}

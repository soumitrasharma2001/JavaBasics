interface test{
    void meth1();
    void meth2();
}
@FunctionalInterface
interface test2{
    void method();
}
public class lambdaExp {
    public static void main(String[] args) {
       test obj=new test() {
           @Override
           public void meth1() {
               System.out.println("I am meth1");
           }

           @Override
           public void meth2() {
               System.out.println("I am meth2");
           }
       };
       obj.meth1();
       obj.meth2();
       test2 obj1=()->{
           System.out.println("I am method");
       };
       obj1.method();
    }
}

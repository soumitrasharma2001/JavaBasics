class MyThread3 extends Thread{
    public void run(){
        while(true) {
            System.out.println("Welcome to Intellij idea " + this.getName());
        }
    }
}
class MyThread4 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome to Java");
            try{
                Thread.sleep(455);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        MyThread3 t1=new MyThread3();
        MyThread4 t2=new MyThread4();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}

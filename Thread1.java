class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("My Thread1 is Running");
            System.out.println("OK!");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("My Thread2 is running");
            System.out.println("Everythings good");
            i++;
        }
    }
}
public class Thread1{

    public static void main(String args[]){
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}

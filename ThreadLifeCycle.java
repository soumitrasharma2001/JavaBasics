class Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }
    public void run(){
        while(true) {
            System.out.println("Welcome to Intellij idea " + this.getName());
        }
    }
}
public class ThreadLifeCycle {
    public static void main(String[] args) {
         Mythread t1=new Mythread("t1");
         Mythread t2=new Mythread("t2");
         Mythread t3=new Mythread("t3");
         Mythread t4=new Mythread("t4");
         Mythread t5=new Mythread("t5 (most IMP thread)");
         t5.setPriority(Thread.MAX_PRIORITY);
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();

    }
}

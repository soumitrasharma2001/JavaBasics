import java.util.Date;

public class dateAndTime {
    public static void main(String[] args) {
       //Date in Java is stored in the form of a long number.
//        System.out.println(System.currentTimeMillis());//Counting starts from 1 Jan 1970
//        System.out.println(Long.MAX_VALUE);
//          long a=System.currentTimeMillis()/1000/86400/365;
//          long b=Long.MAX_VALUE;
//        System.out.println(b/a);
        Date d=new Date();
        for(int i=0;i<6;i++){
            System.out.println(d.getTime());
        }


    }
}

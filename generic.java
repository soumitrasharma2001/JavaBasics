class Temp<T1,T2>{
    public T1 getVar1() {
        return var1;
    }

    private T1 var1;

    public T2 getVar2() {
        return var2;
    }

    private T2 var2;
    Temp(T1 v1,T2 v2){
        var1=v1;
        var2=v2;
    }
    void printData(){
        System.out.println(var1);
        System.out.println(var2);
    }
}
public class generic {
    public static void main(String[] args) {
        Temp<String,Integer> obj=new Temp("a",8);
        String int1=obj.getVar1();
        Integer int2=obj.getVar2();
        System.out.println(int1+int2);
    }
}

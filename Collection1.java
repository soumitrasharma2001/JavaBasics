import java.util.*;
public class Collection1 {
    public static void main(String[] args) {
//        ArrayList<Integer> l1=new ArrayList<>();
//        ArrayList<Integer> l2=new ArrayList<>();
//        //insertion in array list
//        l2.add(15);
//        l2.add(16);
//        l2.add(17);
//        l1.add(6);
//        l1.add(7);
//        l1.add(8);
//        l1.add(9);
//        l1.add(10);
//        //Insertion at particular index
//        l1.add(0,3);
//        l1.add(0,2);
//        //adding l2 in l1
//        l1.addAll(l2);
//        //printing array list
////        for(int i=0;i<l1.size();i++){
////            System.out.println(l1.get(i));
////        }
//        //Deletion of elements in list
//        //l1.clear();
//        //Finding whether elements exists or not
//        //System.out.println(l1.contains(7));
//        System.out.println(l1.listIterator());

      //ArrayDequeue
        //boolean t=true;
        //Hashing
        //HashSet
        //HashMap
        //HashTable
        //Linked HashMap

//        HashSet<Integer> myHashSet=new HashSet<>();
//        myHashSet.add(1);
//        myHashSet.add(2);
//        myHashSet.add(3);
//        myHashSet.add(4);
//        myHashSet.add(5);
//        myHashSet.remove(4);
//        System.out.println(myHashSet);
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i=0;i<5;i++){
            int marks;
            marks=sc.nextInt();
            ar.add(marks);
        }
        System.out.println("Printing the marks....");
        for (int marks:ar) {
            System.out.println(marks);
        }
    }

}

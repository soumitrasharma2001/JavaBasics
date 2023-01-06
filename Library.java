

 //@author Soumitra
 //@since 2002
 //@version 1.9

import java.util.*;
class Books{
    HashMap<String,String> book=new HashMap<>();
    HashMap<String,String> issuedBook=new HashMap<>();
    String name;
    String author;
    Books(){

    }
    Books(String name,String author){
        book.put(name,author);
    }
    public void issue(String bookname){
        String check=book.getOrDefault(bookname,"nil");
        if(check=="nil"){
            System.out.println("Not available");
        }
        else{
            issuedBook.put(bookname,book.get(bookname));
            book.remove(bookname);
            Calendar c=Calendar.getInstance();
            System.out.println("Date of issuing");
            System.out.println(c.get(Calendar.DATE));
        }
    }
    public void returnBook(String bookname){
        book.put(bookname,issuedBook.get(bookname));
        issuedBook.remove(bookname);
    }
}
public class Library {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Books b1=new Books();
        int choice;
        boolean flag=true;
        while(flag){
            System.out.println("Press ");
            System.out.println("1 for adding a book");
            System.out.println("2.for issuing a book");
            System.out.println("3 for returning a book");
            System.out.println("4 for to exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    String bookname,authorname;
                    System.out.println("Enter book name and author name");
                    bookname=sc.nextLine();
                    sc.nextLine();
                    authorname=sc.nextLine();
                    Books b=new Books(bookname,authorname);
                    break;
                case 2:
                    String name;
                    System.out.println("Enter the name of the book to be issue");
                    name=sc.nextLine();
                    b1.issue(name);
                    break;
                case 3:
                    String name1;
                    System.out.println("Enter the name of the book to be return");
                    name1=sc.nextLine();
                    b1.returnBook(name1);
                    break;
                case 4:
                    flag=false;
                    break;
            }
        }

    }
}

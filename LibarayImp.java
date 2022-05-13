import java.util.Scanner;
import java.util.ArrayList;

public class LibarayImp {
    ArrayList<Book> bookList = new ArrayList<Book>();
    ArrayList<Students> stuList = new ArrayList<Students>();

    int[] arr = new int[5];

    public void addbooks()
    {
        Book b1 = new Book();

        System.out.println("Enter the name of the book pls: ");
        Scanner s1 = new Scanner(System.in);
        String name = s1.nextLine();
        b1.setBookName(name);


        System.out.println("Enter the id of the book pls: ");
        int id = s1.nextInt();
        b1.setBookId(id);

        System.out.println("Enter author pls: ");
        String author = s1.next();
        b1.setAuthor(author);

        System.out.println("Enter the number of the copies pls: ");
        int copies = s1.nextInt();
        b1.setNocopies(copies);

        bookList.add(b1);
    }
    public void addstudent(){

        Students s1 = new Students();

        System.out.println("Enter the student name pls: ");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();
        s1.setSname(name);

        System.out.println("Enter the id of the student pls: ");
        int id = sc1.nextInt();
        s1.setSid(id);


        System.out.println("Enter the number of the copies pls: ");
        int copies = sc1.nextInt();
        s1.setNoc(copies);

        stuList.add(s1);
    }

    public void isuedbooks(){
        System.out.println("Enter Book id pls: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        for (Book b:bookList){
            if (b.getBookId() == id){
                if (b.getNocopies() ==0){
                    System.out.println("sorry. book not available!");
                }else{
                    checkstud(b);
                }
            }
        }
    }
    public void checkstud(Book obj){
        System.out.println("Enter student id pls: ");
        Scanner sc = new Scanner(System.in);
        int sid =sc.nextInt();
        for (Students stud:stuList){
            if (stud.getSid()==sid){
                if (stud.getNoc()<5){
                    System.out.println("Book issued");
                    stud.setNoc(stud.getNoc()+1);
                    obj.setNocopies(obj.getNocopies()-1);
                }else{
                    System.out.println("only 5 books are permitted!");
                }
            }
        }
    }
    public void returnbooks(){
        System.out.println("Enter the book id pls: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        for (Book b:bookList){
            if (b.getBookId()==id){
                b.setNocopies(b.getNocopies()+1);
                Callstud();
            }
        }
    }
    public void Callstud(){
        System.out.println("Enter student id pls: ");
        Scanner sc = new Scanner(System.in);
        int sid =sc.nextInt();

        for (Students stud:stuList){
            if (stud.getSid()==sid){
                System.out.println("Book returned");
                stud.setNoc(stud.getNoc()-1);
            }else{
                System.out.println("invalid student");
            }
        }
    }
    public void searchbooks(){
        System.out.println("Enter the book name pls: ");
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        for (Book b:bookList){
            if (b.getBookName().equalsIgnoreCase(name)){
                System.out.println("the details of the book are: "+b.getBookName() +" " + b.getAuthor()+" " + b.getNocopies());
            }
        }
}}

package Day2.Day4.Day5.Day6.Day7.Day8.Day9;
class Book
{
    String title;
    String author;
    double price;
    Book(String title,String author,double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display()
    {
        System.out.println("Title "+title);
        System.out.println("Author "+author);
        System.out.println("Price "+price);

    }
}
public class BookClassConstructor {
    public static void main(String[] args) {
        Book b1=new Book("Java Programming","James gosling",500);
        Book b2=new Book("Clean code","Robert martin",300);
        Book b3=new Book("Effective java","Joshua bloch",400);
        b1.display();
        b2.display();
        b3.display();
    }
}


    


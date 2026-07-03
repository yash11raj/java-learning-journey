package Day2.Day4.Day5.Day6.Day7.Day8.Day9;

class Movie
{
    String title;
    String hero;
    double rating;
    Movie(String title,String hero,double rating)
    {
        this.title=title;
        this.hero=hero;
        this.rating=rating;
    }
    void display()
    {
        System.out.println("Title is "+title);
        System.out.println("Hero is "+hero);
        System.out.println("Rating is "+rating);
    }
    boolean isHit()
    {
         if(rating>8&rating<=10)
        {
            System.out.println("Movie is a hit");
            return true;
        }
        else
        {
            System.out.println("Movie is average");
            return false;
        }
    }
}
  public class MovieClass
  {
    public static void main(String[] args)
    {
        Movie m1=new Movie("Bahubali","Prabhas",9.5);
        Movie m2=new Movie("Radhe","Salman khan",3.5);
          m1.display();
          m1.isHit();
          m2.display();
            m2.isHit();
    }
  }
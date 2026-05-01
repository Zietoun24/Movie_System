import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        int Option;
        Movie_System M=new Movie_System();
        do{
            System.out.println("1. Add Movie");
            System.out.println("2. Show All Movies");
            System.out.println("3. Search Movie");
            System.out.println("4. Show High Rated (>7)" );
            System.out.println("5. Show Average Rating");
            System.out.println("6. Delete Movie");
            System.out.println("7. Exit");
            Option=Input.nextInt();
            switch(Option){
                case 1 : M.Add_Movie(); break;
                case 2 : M.Movie_List(); break;
                case 3 : M.Search_Movie(); break;
                case 4 : M.High_Rated(); break;
                case 5 : M.Show_Average(); break;
                case 6 : M.Delete_Movie(); break;
            }
        }while(Option!=7);
    }
}
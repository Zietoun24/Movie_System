import java.util.Scanner;
public class Movie_System {
    private Movie_Data[] movies=new Movie_Data[100];
    private int count=0;
    public void Add_Movie(){
        Scanner input = new Scanner(System.in);
        if(count == 100){
            System.out.println("Storage Full");
            return;
        }
        String Name; int Year; double Rating;
        System.out.print("Enter Movie Name: ");
        Name= input.nextLine();
        System.out.print("Enter Movie Year: ");
        Year= input.nextInt();
        System.out.print("Enter Movie Rating: ");
        Rating= input.nextDouble();
        if(Rating>=0 && Rating<=10 && Year>=1900 && Year<= 2026){
    movies[count]=new Movie_Data(Name,Year,Rating);
    count++;
            System.out.println("Movie Added! ");
        }
        else{
            System.out.println("Wrong Data");
        }
    }
    public void Movie_List(){
        for(int i=0; i<count; i++){
            System.out.print((i+1)+" . ");
            movies[i].display();
        }
    }
    public void Search_Movie(){
        Scanner input = new Scanner(System.in);
        boolean Found=false;
        System.out.print("Enter Movie Name: ");
        String search= input.nextLine();
        for(int i=0; i<count; i++){
            if(movies[i].GetName().equalsIgnoreCase(search)){
            movies[i].display();
            Found =true;
            break;
            }
            }
        if(!Found){
            System.out.println("Movie not Found!");
        }
    }
    public void High_Rated(){
        boolean Found=false;
        for(int i=0; i<count; i++){
if(movies[i].getRating()>7){
    Found=true;
    movies[i].display();
}
        }
        if(!Found){
            System.out.println("No Movie Found");
        }
    }
    public void Show_Average(){
        if(count == 0){
            System.out.println("No Movies! ");
            return;
        }
double sum=0;
for(int i=0; i<count; i++){
    sum+=movies[i].getRating();
}
        System.out.println("The Average Rating Is : "+sum/count);
    }
    public void Delete_Movie(){
        Scanner input=new Scanner(System.in);
        boolean Found=false;
        System.out.print("Enter Movie Name: ");
        String search=input.nextLine();
        for(int i=0; i<count; i++){
            if(movies[i].GetName().equalsIgnoreCase(search)){
                Found=true;

                for(int j = i; j < count - 1; j++){
                    movies[j] = movies[j + 1];
                }

                movies[count - 1] = null;
                count--;
                System.out.println("Done!");
                break;
            }
        }
        if(!Found){
            System.out.println("No Movie Found! ");
        }
    }
}

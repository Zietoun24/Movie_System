public class Movie_Data {
    private String Name;
    private int Year;
    private double Rating;
    Movie_Data(String Name, int Year,double Rating){
this.Name=Name;
this.Rating=Rating;
this.Year=Year;
    }
    public void display(){
        System.out.println("Movie Name: "+this.Name+"|| Movie Year: "+this.Year+"|| Movie Rating: "+this.Rating);
    }
public String GetName(){
        return Name;
}
public double getRating(){
        return Rating;
}
}

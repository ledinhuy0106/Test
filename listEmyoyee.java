import java.util.ArrayList;
import java.util.Scanner;

public class listEmyoyee {
  static ArrayList<Emyoyee> Ds = new ArrayList<>();
  public void inputs (){
      String Choice = "y";
      Scanner Sc = new Scanner(System.in);
      do{
        Emyoyee a = new Emyoyee();
        a.input();
        Ds.add(a);
          System.out.println("Tiếp tục ?");
          Choice = Sc.next();
      }while (Choice.equalsIgnoreCase("y"));
  }
  public void outputs (){
      for (Emyoyee aa : Ds){
          aa.output();
      }
  }
}

import java.util.Scanner;

public class Emyoyee {
    private int id ;
    private String name ;
    private int age;
    public Emyoyee(){}
    public Emyoyee( int id , String name , int age){
        this.name = name;
        this.id = id;
        this.age =age;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name; }
    public int getAge() {return age; }
    public void setAge(int age) {this.age = age;}
    public void input(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("id :");
        setId(Sc.nextInt());
        System.out.println("name :");
        setName(Sc.nextLine());
        System.out.println("age :");
        setAge(Sc.nextInt()); 
    }
    public void output(){
        System.out.println("=> " + getId() + "-" + getName()+ "-"+getAge());
    }
}

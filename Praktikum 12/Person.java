public class Person {
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i,String n){
        id = 1;
        name = n;
    }
    
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

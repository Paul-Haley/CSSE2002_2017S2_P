package week02;

public class Person {
    private String name;
    private boolean gender;
    private int height;
    private int age;
    private int weight;
    
    public Person(String name, boolean gender, int height, int age) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.age = age;
        this.weight = 50;
    }
    
    public String getName() {
        return name;
    }
    
    public void isHeavy() {
        String heavy = weight > 40 ? "HEAVY" : "small";
        System.out.println(heavy);
    }
}

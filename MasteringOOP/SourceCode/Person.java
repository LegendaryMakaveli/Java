public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if(age < 0) throw new IllegalArgumentException("Age cannot be negative");
        if(age > 120) throw new IllegalArgumentException("Age cannot be greater than 120");
        if(age < 18) throw new IllegalArgumentException("Age must be at least 18");
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}

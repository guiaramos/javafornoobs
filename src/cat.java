public class cat extends Animal{

    public cat(String name, int age){
        super(name,age);
    }

    @Override
    public String toString() {
        return "My name is " + getName() + ", my age is " + getAge() + " and my type is cat";
    }
}

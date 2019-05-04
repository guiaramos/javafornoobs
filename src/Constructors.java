public class Constructors {


    public static void main(String[] args) {

        Animal animal = new Animal("Guilherme",25);
        dog dog= new dog("Gui", 80);
        cat cat= new cat("honey", 31);

        animal.setAge(27);

        System.out.println();
        System.out.println ();

        Animal[] animals = new Animal[3];

        animals[0] = animal;
        animals[1] = dog;
        animals[2] = cat;

        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
        }


    }
}

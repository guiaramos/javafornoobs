public class SwitchStatement {

    public static void main(String[] args) {
        String animal;

        animal = "pig";

        switch (animal){
            default:
                System.out.println("I don't know this animal");
                break;
            case "cat":
                System.out.println("Meow");
                break;
            case "dog":
                System.out.println("Bark");

        }
    }
}

public class Methods {

    public static void main(String[] args) {
        int yourAge = 21;
        int nextAge = 22;
        String firstName = "Guilherme";
        String lastName = "Ramos";


        int leftYears = countAge(yourAge, nextAge);

        String Name = fullName(firstName,lastName);

        String finalResult = Name + " has " + leftYears + " year left to go to Canada";

        System.out.println(finalResult);

    }

    public static int countAge(int current, int next){
        return next - current;
    }

    public static String fullName(String givenName, String familyName){
        return givenName + " " + familyName;
    }

}

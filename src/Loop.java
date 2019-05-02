public class Loop {

    public static void main(String[] args) {

        //Pre/Post Increment Decrement
        int x = 5;
        x++;
        x--;
        ++x;
        --x;
        System.out.println(x);

        //for loop
        for (int i = 0; i < 10;i++){
            System.out.println(i);
        }

        //while loop
        int i = 0;
        while (i<10){
            System.out.println(i);
            ++i;
        }

        //do while
        do{
            System.out.println(x);
            x++;
        }while (x < 10);
    }

}

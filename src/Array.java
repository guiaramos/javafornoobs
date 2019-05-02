public class Array {

    public static void main(String[] args) {
        //Simple array
        int a = 50;
        int b = 60;
        int c = 70;
        int d = 80;

        int[] x = {a,b,c,d};

        for (int i = 0; i < x.length;i++){
            System.out.println(x[i]);
        }

        //2D Array

        int [][] p = {{50,60,70},{10,20,30},{90,100,110}};

        for (int i = 0; i < 3; i++){
            for(int j =0; j < 3; j++){
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
    }
}

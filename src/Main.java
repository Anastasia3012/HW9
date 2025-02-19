import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Задача1.1
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
//        1.2
        double[] two = {1.57, 7.654, 9.986};
//        1.3
        int[] three = {8, 15, 44, 30, 97};

//        Задача2

        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (i != 2) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int w = 0; w < two.length; w++) {
            System.out.print(two[w]);
            if (w != 2) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int z = 0; z < three.length; z++) {
            System.out.print(three[z]);
            if (z != 4) {
                System.out.print(",");
            }
        }
        System.out.println();
//        Задача3
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }

        System.out.println();
        for (int w = two.length - 1; w >= 0; w--) {
            System.out.print(two[w]);
            if (w != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int z = three.length - 1; z >= 0; z--) {
            System.out.print(three[z]);
            if (z != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

//        Задача4
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i]+=1;
                System.out.println(Arrays.toString(one));
            }
        }
    }
}

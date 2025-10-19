//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задание 1.1
        System.out.println("(1) ---------");
        int[] arraysNew = new int[3];
        arraysNew[0] = 1;
        arraysNew[1] = 2;
        arraysNew[2] = 3;
        System.out.println(arraysNew[0] + "; " + arraysNew[1] + "; " + arraysNew[2]);

        //Задание 1.2
        double[] arraysValues = {1.57, 7.654, 9.986};
        System.out.println(arraysValues[0] + "; " + arraysValues[1] + "; " + arraysValues[2]);

        //Задание 1.3
        int[] dz = new int[]{1, 2, 9, 4};
        for (int i = 0; i < dz.length; i++) {
            System.out.println("Элемент " + i + ": " + dz[i]);
        }
        System.out.println("(2) ---------");

        //Задание 2
        int[] zd = new int[]{1, 2, 3};
        for (int i = 0; i < zd.length; i++) {
            if (i == zd.length - 1) {
                System.out.print(zd[i]);
            } else {
                System.out.print(zd[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("(3) ---------");

        //Задание 3.1
        int[] arraysReverse = new int[3];
        arraysReverse[0] = 3;
        arraysReverse[1] = 2;
        arraysReverse[2] = 1;
        System.out.println(arraysReverse[0] + "; " + arraysReverse[1] + "; " + arraysReverse[2]);

        //Задание 3.2
        double[] arraysValuesReverse = {1.57, 7.654, 9.986};
        System.out.println(arraysValuesReverse[2] + "; " + arraysValuesReverse[1] + "; " + arraysValuesReverse[0]);

        //Задание 3.3
        int[] dzReverse = new int[]{1, 2, 9, 4};
        for (int i = dzReverse.length-1; i >= 0; i--) {
            System.out.print("Элемент " + i + ": " + dzReverse[i]);
            if (i>0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("(4) ---------");

        //Задание 4
        int[] arraysEvenNumbers = new int[3];
        arraysEvenNumbers[0] = 1;
        arraysEvenNumbers[1] = 2;
        arraysEvenNumbers[2] = 3;
        for (int i = 0; i < arraysEvenNumbers.length; i += 1) {
            if (arraysEvenNumbers[i] % 2 != 0) {
                arraysEvenNumbers[i]+=1;
            }
        }
        System.out.println(arraysEvenNumbers[0] + "; " + arraysEvenNumbers[1] + "; " + arraysEvenNumbers[2]);
        System.out.println("---------");
    }
}

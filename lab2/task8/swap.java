package task8;

public class swap {
    public static void main(String[] args){

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        int temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}

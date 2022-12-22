package task9;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {

        int cardsPerPlayer = 5;
        int countPlayers = 0 ;
        String[] suits = {"Пики", "Бубна", "Чирва", "Крести"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        int n = suits.length * rank.length; // общее кол-во карт


        for(;;){

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");

            if(sc.hasNextInt()){

                countPlayers = sc.nextInt();
                if (cardsPerPlayer * countPlayers <= n){
                    break;
                }
                else {
                    if (countPlayers < 0){
                        System.out.println("Число игроков не может быть меньше 0");
                    }
                    else {
                        System.out.println("Слишком много игроков!");
                    }
                }

            }
            else {
                System.out.println("Вы ввели не число, или ваше число слишком большое!");
            }
        }


        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = rank[i] + " " + suits[j];
            }
        }


        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }


        for (int i = 0; i < countPlayers * cardsPerPlayer; i++) {
            if (i % cardsPerPlayer == 0) {
                System.out.println("Игрок №" + (i / cardsPerPlayer + 1));
            }

            System.out.println(deck[i]);

            if (i % cardsPerPlayer == cardsPerPlayer - 1) {
                System.out.println();
            }
        }
    }
}

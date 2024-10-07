import java.util.Arrays;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {

    System.out.println("  Задача 1");

    int[] costWeek = {120, 150, 100, 160, 170};
    int summ = 0;
    for (int i = 0; i < costWeek.length; i++) {
      summ += costWeek[i];
    }

    System.out.println("Сумма трат за месяц составила : " + summ + " рублей : ");

    System.out.println("  Задача 2");

    int[] cost = new int[5];
    cost[0] = 120;
    cost[1] = 140;
    cost[2] = 150;
    cost[3] = 180;
    cost[4] = 110;
    int maxCost = 0;
    for (int i = 0; i < cost.length - 1; i++) {
      if (maxCost < cost[i]) {
        maxCost = cost[i];
      }
    }

    int minCost = maxCost;
    for (int i = 0; i < cost.length; i++) {
      if (minCost > cost[i]) {
        minCost = cost[i];
      }
    }
    System.out.println("Минимальная сумма трат за неделю составила: " + minCost + " рублей.");
    System.out.println("Максимальная сумма трат за неделю составила: " + maxCost + " рублей.");

    System.out.println("  Задача 3");

    float[] weekCost = new float[]{110, 120, 130, 140, 150};
    float summ3 = 0;
    for (float v : weekCost) {
      summ3 += v;
    }
    System.out.println("Средняя сумма трат за месяц составила : " + summ3 / 31 + " рублей");

    System.out.println("  Задача 4");

    char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

    for (int i = reverseFullName.length - 1; i >= 0; i--) {
             System.out.print(reverseFullName[i]);
      }



  }
 }

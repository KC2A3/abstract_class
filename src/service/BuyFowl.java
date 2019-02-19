package service;

import model.Chick;
import model.Cock;
import model.Fowl;
import model.Hen;

public class BuyFowl {
  private static Cock cock = new Cock();
  private static Hen hen = new Hen();
  private static Chick chick = new Chick();

  public static void buyFowl(double price, int total) {
    double maxOfCocks = price / 5;
    double maxOfHen = price / 3;
    for (int numberOfCocks = 1; numberOfCocks < maxOfCocks; numberOfCocks++) {
      for (int numberOfHen = 1; numberOfHen < maxOfHen; numberOfHen++) {
        int numberOfChick = total - numberOfCocks - numberOfHen;
        boolean multipleOfThree = numberOfChick % 3 == 0;
        boolean totalPrice =
            numberOfCocks * cock.getPrice() + numberOfHen * hen.price + numberOfChick / 3 == price;
        if (multipleOfThree && totalPrice) {
          System.out.println(
              "买公鸡" + numberOfCocks + "只,买母鸡" + numberOfHen + "只，买小鸡" + numberOfChick + "只");
          System.out.println("----------------------------------------------");
        }
      }
    }
  }
}

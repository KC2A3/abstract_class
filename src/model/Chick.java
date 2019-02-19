package model;

public class Chick extends Fowl {
  public Chick() {
    setPrice();
  }

  @Override
  public void setPrice() {
    this.price = 1 / 3;
  }
}

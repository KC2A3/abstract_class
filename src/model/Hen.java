package model;

public class Hen extends Fowl {
  public Hen() {
    setPrice();
  }

  @Override
  public void setPrice() {
    this.price = 3;
  }
}

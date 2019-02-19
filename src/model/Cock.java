package model;

public class Cock extends Fowl {
  public Cock() {
    setPrice();
  }

  @Override
  public void setPrice() {
    this.price = 5;
  }
}

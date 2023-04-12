package TA2.Cover.CoverDecorator;

import TA2.Cover.Cover;

public class Holder extends CoverDecorator {
  Cover cover;

  public Holder(Cover cover) {
    this.cover = cover;
  }

  public double cost() {
    return 100 + cover.cost();
  }

  @Override
  public String getDescription() {

    return cover.getDescription() + ", Holder";
  }

}

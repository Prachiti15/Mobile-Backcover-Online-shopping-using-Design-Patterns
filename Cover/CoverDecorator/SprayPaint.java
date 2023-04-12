package TA2.Cover.CoverDecorator;

import TA2.Cover.Cover;

public class SprayPaint extends CoverDecorator {
  Cover cover;

  public SprayPaint(Cover cover) {
    this.cover = cover;
  }

  public double cost() {
    return 80 + cover.cost();
  }

  @Override
  public String getDescription() {

    return cover.getDescription() + ", Spray Paint";
  }
}
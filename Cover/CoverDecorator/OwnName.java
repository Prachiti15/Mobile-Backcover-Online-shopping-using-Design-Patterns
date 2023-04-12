package TA2.Cover.CoverDecorator;

import TA2.Cover.Cover;

public class OwnName extends CoverDecorator {
  Cover cover;

  public OwnName(Cover cover) {
    this.cover = cover;
  }

  public double cost() {
    return 140 + cover.cost();
  }

  @Override
  public String getDescription() {

    return cover.getDescription() + ", Own Name";
  }
}
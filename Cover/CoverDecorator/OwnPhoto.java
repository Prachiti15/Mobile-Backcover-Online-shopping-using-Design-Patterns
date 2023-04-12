package TA2.Cover.CoverDecorator;

import TA2.Cover.Cover;

public class OwnPhoto extends CoverDecorator {
  Cover cover;

  public OwnPhoto(Cover cover) {
    this.cover = cover;
  }

  public double cost() {
    return 200 + cover.cost();
  }

  @Override
  public String getDescription() {

    return cover.getDescription() + ", Own Photo";
  }
}
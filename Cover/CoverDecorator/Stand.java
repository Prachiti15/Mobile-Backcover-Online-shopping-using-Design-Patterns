package TA2.Cover.CoverDecorator;

import TA2.Cover.Cover;

public class Stand extends CoverDecorator {
  Cover cover;

  public Stand(Cover cover) {
    this.cover = cover;
  }

  public double cost() {
    return 90 + cover.cost();
  }

  @Override
  public String getDescription() {

    return cover.getDescription() + ", Stand";
  }
}
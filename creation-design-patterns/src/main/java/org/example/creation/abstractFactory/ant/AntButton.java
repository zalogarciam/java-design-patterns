package org.example.creation.abstractFactory.ant;

import org.example.creation.abstractFactory.Button;

public class AntButton implements Button {
  @Override
  public void render() {
    System.out.println("Ant Button");
  }
}

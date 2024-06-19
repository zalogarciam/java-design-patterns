package org.example.creation.abstractFactory.ant;

import org.example.creation.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
  @Override
  public void render() {
    System.out.println("Ant TextBox");
  }
}

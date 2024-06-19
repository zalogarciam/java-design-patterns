package org.example.creation.abstractFactory.material;

import org.example.creation.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
  @Override
  public void render() {
    System.out.println("Material TextBox");
  }
}

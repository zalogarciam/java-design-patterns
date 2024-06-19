package org.example.creation.abstractFactory.material;

import org.example.creation.abstractFactory.Button;

public class MaterialButton implements Button {
  @Override
  public void render() {
    System.out.println("Material Button");
  }
}

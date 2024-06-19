package org.example.creation.abstractFactory.material;

import org.example.creation.abstractFactory.Button;
import org.example.creation.abstractFactory.TextBox;
import org.example.creation.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
  @Override
  public Button createButton() {
    return new MaterialButton();
  }

  @Override
  public TextBox createTextBox() {
    return new MaterialTextBox();
  }
}

package org.example.creation.abstractFactory.ant;

import org.example.creation.abstractFactory.Button;
import org.example.creation.abstractFactory.TextBox;
import org.example.creation.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
  @Override
  public Button createButton() {
    return new AntButton();
  }

  @Override
  public TextBox createTextBox() {
    return new AntTextBox();
  }
}

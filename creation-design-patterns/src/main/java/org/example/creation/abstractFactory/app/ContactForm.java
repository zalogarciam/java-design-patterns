package org.example.creation.abstractFactory.app;

import org.example.creation.abstractFactory.WidgetFactory;
public class ContactForm {
  public void render(WidgetFactory factory) {
    factory.createTextBox().render();
    factory.createButton().render();
  }
}

package org.example.creation.factory.sharp;

import org.example.creation.factory.matcha.Controller;
import org.example.creation.factory.matcha.ViewEngine;

public class SharpController extends Controller {
  @Override
  protected ViewEngine createViewEngine() {
    return new SharpViewEngine();
  }
}

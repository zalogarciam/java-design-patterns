package org.example.creation.factory.matcha;

import java.util.Map;

public interface ViewEngine {
  String render(String viewName, Map<String, Object> context);
}

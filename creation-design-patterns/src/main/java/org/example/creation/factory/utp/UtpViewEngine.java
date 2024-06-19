package org.example.creation.factory.utp;

import org.example.creation.factory.matcha.ViewEngine;

import java.util.Map;

public class UtpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by UTP";
    }
}
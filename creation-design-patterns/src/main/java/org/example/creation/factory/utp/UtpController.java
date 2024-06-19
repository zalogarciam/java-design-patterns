package org.example.creation.factory.utp;

import org.example.creation.factory.matcha.Controller;
import org.example.creation.factory.matcha.ViewEngine;
import org.example.creation.factory.sharp.SharpViewEngine;

public class UtpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new UtpViewEngine();
    }
}

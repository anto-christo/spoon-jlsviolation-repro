package org.example;

import spoon.Launcher;
import spoon.reflect.CtModel;

import java.net.URL;

public class App {
    public static void main(String[] args) {
        String resourcePath = getResourcePath("/sample.java");
        CtModel model = buildModel(resourcePath);
        System.out.println(model.toString());
    }

    private static String getResourcePath(String resource) {
        URL resourceUrl = App.class.getResource(resource);
        if (resourceUrl == null) {
            throw new IllegalArgumentException("Resource not found: " + resource);
        }
        return resourceUrl.getPath();
    }

    private static CtModel buildModel(String resourcePath) {
        Launcher launcher = new Launcher();
        launcher.addInputResource(resourcePath);
        launcher.getEnvironment().setComplianceLevel(17);
        launcher.buildModel();
        return launcher.getModel();
    }
}

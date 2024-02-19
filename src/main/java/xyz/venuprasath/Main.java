package xyz.venuprasath;

import xyz.venuprasath.factory.Dialog;
import xyz.venuprasath.factory.impl.LinuxDialog;
import xyz.venuprasath.factory.impl.WindowDialog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Pattern!");
        System.out.println("Read more here `https://refactoring.guru/design-patterns/factory-method`");
        String os = "windows";
        if(os.equals("linux")) {
            Dialog dialog = new LinuxDialog();
            dialog.createButton();
            dialog.render();
        } else if(os.equals("windows")) {
            Dialog dialog = new WindowDialog();
            dialog.createButton();
            dialog.render();
        }

        System.out.println("Abstract Factory Pattern");

    }
}
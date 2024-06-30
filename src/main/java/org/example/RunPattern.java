package org.example;

public class RunPattern {
    public static void main(String[] args) {
        System.out.println("Example showing use of Observer Pattern");
        System.out.println("---- ---- ---- ---- ----");
        ObserverGui application = new ObserverGui();
        application.createGui();
        System.out.println("---- ---- ---- ---- ----");
    }
}
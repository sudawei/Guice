package org.demo.helloworlddemo;

import org.demo.MyApplet;

/**
 * Created by Administrator on 2017/10/11/011.
 */
public class HelloWorldPrinter implements MyApplet {
    private void printHelloWorld(){
        System.out.println("Hello World!");
    }

    public void run() {
        printHelloWorld();
    }
}

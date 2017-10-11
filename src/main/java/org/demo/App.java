package org.demo;

public class App {
    /**
     * bootstrap:
     * parse command line
     * set up environment
     * kick off main logic
     */
    public static void main(String[] args) {
        MyApplet mainApplet = Configuration.getMainApplet();
        mainApplet.run();
    }


}

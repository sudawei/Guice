package org.demo;

import org.demo.helloworlddemo.HelloWorldPrinter;

/**
 * Created by Administrator on 2017/10/11/011.
 */
public class Configuration {
    public static MyApplet getMainApplet(){
        return new HelloWorldPrinter();
    }

}

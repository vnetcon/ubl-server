
package com.vnetcon;

import javax.jws.WebService;

@WebService(endpointInterface = "com.vnetcon.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}


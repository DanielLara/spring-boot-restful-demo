package edu.daniellara;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Class description
 *
 * @author Daniel Lara Diezma
 * created on 06/10/2016
 */

@RestController
public class GreetingController {

    @Value("${name}")
    private String name;

    private static final String template = "Hello! %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting(){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

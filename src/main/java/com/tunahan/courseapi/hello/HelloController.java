package com.tunahan.courseapi.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Wenn eine Anfrage gemacht wird, antwortet der RestController
 */
@RestController
public class HelloController {

    /**
     * Wenn eine Anfrage an /hello gemacht wird, wird "Hi" ausgegeben
     * nur für GET!
     * @return
     */
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
}

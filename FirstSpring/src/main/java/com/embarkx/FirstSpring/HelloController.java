package com.embarkx.FirstSpring;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public HeloResponse helloPram(@PathVariable String name) {
        return new HeloResponse("Hello, " + name);
    }

    @GetMapping("/hello")
    public HeloResponse hello() {
        return new HeloResponse("Hello World!");
    }
    @PostMapping("/hello")
    public HeloResponse helloPost(@RequestBody String name){
        return new HeloResponse("Hello " + name + "!");
    }

}

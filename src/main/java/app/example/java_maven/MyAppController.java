package app.example.java_maven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyAppController {

    @GetMapping("/myapp")
    public String hello() {
        return "myapp"; // Spring looks for templates/myapp.html
    }
}



// package app.example.java_maven;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class MyAppController {

//     @GetMapping("/myapp")
//     public String hello() {
//         return "Hello from /myapp!";
//     }
// }

//package com.example.cry;
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import java.util.List;
//import java.util.Map;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class FileController {
//
//    @GetMapping("/")
//    public String home(Model model) {
//        System.out.println("home page accessed");
//        model.addAttribute("title", "Dashboard");
//        model.addAttribute("cards", List.of(
//            Map.of("title", "Card 1", "details", "Details about Card 1"),
//            Map.of("title", "Card 2", "details", "Details about Card 2"),
//            Map.of("title", "Card 3", "details", "Details about Card 3")
//        ));
//        return "home";
//    }
//
//
//
//    @GetMapping("/about")
//    public String data() {
//        System.out.println("data page accessed");
//        return "about";
//    }
//    @GetMapping("/data2")
//    public String homePage2() {
//        System.out.println("home page accessed via /home");
//        return "error_page";
//    }
//}

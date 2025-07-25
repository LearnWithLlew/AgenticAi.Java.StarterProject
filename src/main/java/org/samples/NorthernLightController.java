package org.samples;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class NorthernLightController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam("city") String city, Model model) {
        // Mock event list for demonstration
        List<String> events = Arrays.asList(
                "2025-08-01: Northern Lights visible in " + city,
                "2025-08-15: Possible aurora activity near " + city
        );
        model.addAttribute("events", events);
        return "index";
    }
}

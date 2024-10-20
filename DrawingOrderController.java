package com.example.drawings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DrawingOrderController {

    @Autowired
    private DrawingOrderService service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/submit-order")
    public String submitOrder(@RequestParam("name") String name,
                              @RequestParam("email") String email,
                              @RequestParam("drawing_type") String drawingType,
                              @RequestParam("description") String description,
                              Model model) {
        DrawingOrder order = new DrawingOrder();
        order.setName(name);
        order.setEmail(email);
        order.setDrawingType(drawingType);
        order.setDescription(description);

        service.saveOrder(order);

        model.addAttribute("message", "Order submitted successfully!");
        return "index";
    }
}

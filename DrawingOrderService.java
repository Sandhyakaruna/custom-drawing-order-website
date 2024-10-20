package com.example.drawings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrawingOrderService {
    @Autowired
    private DrawingOrderRepository repository;

    public DrawingOrder saveOrder(DrawingOrder order) {
        return repository.save(order);
    }
}

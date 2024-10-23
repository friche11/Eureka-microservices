package com.example.notification_service;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private List<Notification> notifications = new ArrayList<>();

    @GetMapping("/")
    public List<Notification> getNotifications() {
        return notifications;
    }

    @GetMapping("/{id}")
    public Notification getNotification(@PathVariable int id) {
        return notifications.stream()
                .filter(notification -> notification.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping("/")
    public Notification createNotification(@RequestBody Notification notification) {
        notifications.add(notification);
        return notification;
    }
}

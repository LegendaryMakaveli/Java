package com.example.CarTracker.Controller;

import com.example.cartracker.Model.Location;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    @GetMapping("/test")
    public String test() {
        return "Car Tracker API is working 🚗💨";
    }

    @PostMapping
    public Location receiveLocation(@RequestBody Location location) {
        location.setTimestamp(LocalDateTime.now());
        System.out.println("Received: " + location.getVehicleId() + " @ " + location.getLatitude() + "," + location.getLongitude());
        return location;
    }
}

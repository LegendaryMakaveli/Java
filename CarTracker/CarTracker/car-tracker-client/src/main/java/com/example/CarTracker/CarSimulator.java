package com.example.CarTracker;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStream;
import java.util.Random;

public class CarSimulator {

    // Your Spring Boot backend address
    private static final String BASE_URL = "http://localhost:8080/api";
    private static final String VEHICLE_ENDPOINT = BASE_URL + "/vehicles";
    private static final String LOCATION_ENDPOINT = BASE_URL + "/locations";

    private static final ObjectMapper mapper = new ObjectMapper();
    private static final Random random = new Random();

    public static void main(String[] args) {
        try {
            // 1️⃣ Vehicle setup
            Vehicle vehicle = new Vehicle("ABC123", "Toyota Camry", "Sedan", "Mary Johnson");

            // 2️⃣ Register the vehicle
            registerVehicle(vehicle);

            // 3️⃣ Send 5 simulated location updates
            double latitude = 6.5244;  // Lagos coordinates
            double longitude = 3.3795;

            for (int i = 1; i <= 5; i++) {
                double speed = 30 + random.nextDouble() * 70; // speed between 30–100 km/h
                Location location = new Location(latitude, longitude, speed, vehicle);

                sendLocation(location, i);

                // simulate small movement
                longitude += 0.0003;
                Thread.sleep(3000); // wait 3 seconds before next update
            }

            System.out.println("✅ Simulation completed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void registerVehicle(Vehicle vehicle) {
        try {
            String json = mapper.writeValueAsString(vehicle);
            HttpURLConnection conn = (HttpURLConnection) new URL(VEHICLE_ENDPOINT).openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            try (OutputStream os = conn.getOutputStream()) {
                os.write(json.getBytes());
            }

            int responseCode = conn.getResponseCode();
            System.out.println("🚘 Vehicle registration response: " + responseCode);

            conn.disconnect();
        } catch (Exception e) {
            System.out.println("❌ Error registering vehicle: " + e.getMessage());
        }
    }

    private static void sendLocation(Location location, int count) {
        try {
            String json = mapper.writeValueAsString(location);
            HttpURLConnection conn = (HttpURLConnection) new URL(LOCATION_ENDPOINT).openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            try (OutputStream os = conn.getOutputStream()) {
                os.write(json.getBytes());
            }

            int responseCode = conn.getResponseCode();
            System.out.println("📍 [" + count + "] Sent location -> Response: " + responseCode);

            conn.disconnect();
        } catch (Exception e) {
            System.out.println("⚠️ Failed to send location: " + e.getMessage());
        }
    }

    // Simple inner class to match your backend Vehicle
    static class Vehicle {
        public String licensePlate;
        public String model;
        public String type;
        public String ownerName;

        public Vehicle(String licensePlate, String model, String type, String ownerName) {
            this.licensePlate = licensePlate;
            this.model = model;
            this.type = type;
            this.ownerName = ownerName;
        }
    }

    // Simple inner class to match your backend Location
    static class Location {
        public double latitude;
        public double longitude;
        public double speed;
        public Vehicle vehicle;

        public Location(double latitude, double longitude, double speed, Vehicle vehicle) {
            this.latitude = latitude;
            this.longitude = longitude;
            this.speed = speed;
            this.vehicle = vehicle;
        }
    }
}

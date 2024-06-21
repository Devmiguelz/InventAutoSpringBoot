package api.inventauto.controllers;

import api.inventauto.model.Vehicle;
import api.inventauto.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    
    @Autowired
    private VehicleService _vehicleService;

    @GetMapping("/list")
    public List<Vehicle> getAllVehicles() {
        return _vehicleService.getAllVehicles();
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable UUID id) {
        Vehicle vehicle = _vehicleService.getVehicleById(id);
        return vehicle != null ? ResponseEntity.ok(vehicle) : ResponseEntity.notFound().build();
    }

    @PostMapping("/save")
    public Vehicle createVehicle(@Validated @RequestBody Vehicle vehicle) {
        return _vehicleService.createVehicle(vehicle);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Vehicle> updateVehicle(@PathVariable UUID id, @Validated @RequestBody Vehicle vehicleDetails) {
        Vehicle updatedVehicle = _vehicleService.updateVehicle(id, vehicleDetails);
        return updatedVehicle != null ? ResponseEntity.ok(updatedVehicle) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable UUID id) {
        _vehicleService.deleteVehicle(id);
        return ResponseEntity.noContent().build();
    }
}

package api.inventauto.service;

import api.inventauto.model.Vehicle;
import api.inventauto.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository _vehicleRepository;

    public List<Vehicle> getAllVehicles() {
        return _vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(UUID id) {
        return _vehicleRepository.findById(id).orElse(null);
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        vehicle.setCreatedAt(new Date());
        return _vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(UUID id, Vehicle vehicleDetails) {
        Vehicle vehicle = getVehicleById(id);
        if (vehicle != null) {
            vehicle.setBrand(vehicleDetails.getBrand());
            vehicle.setPlate(vehicleDetails.getPlate());
            vehicle.setModel(vehicleDetails.getModel());
            vehicle.setColor(vehicleDetails.getColor());
            vehicle.setLine(vehicleDetails.getLine());
            vehicle.setMileage(vehicleDetails.getMileage());
            vehicle.setPhase(vehicleDetails.getPhase());
            vehicle.setPrice(vehicleDetails.getPrice());
            vehicle.setObservation(vehicleDetails.getObservation());
            vehicle.setUpdatedAt(new Date());
            vehicle.setStatus(vehicleDetails.isStatus());
            return _vehicleRepository.save(vehicle);
        }
        return null;
    }

    public void deleteVehicle(UUID id) {
        _vehicleRepository.deleteById(id);
    }
}

package api.inventauto.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Vehicle")
@Data
@Getter
@Setter
public class Vehicle {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "brandId", nullable = false, foreignKey = @ForeignKey(name = "FK_VEHICLE_BRAND"))
    private Brand brand;

    private String plate;
    private int model;
    private String color;
    private String line;
    private int mileage;

    @ManyToOne
    @JoinColumn(name = "phaseId", nullable = false, foreignKey = @ForeignKey(name = "FK_VEHICLE_PHASE"))
    private Phase phase;

    private double price;
    private String observation;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    private boolean status;
}

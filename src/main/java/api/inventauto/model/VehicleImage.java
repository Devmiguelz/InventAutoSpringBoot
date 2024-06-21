package api.inventauto.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Entity
@Table(name = "VehicleImage")
@Data
@Getter
@Setter
public class VehicleImage {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "vehicleId", nullable = false, foreignKey = @ForeignKey(name = "FK_VEHICLE_IMAGE") )
    private Vehicle vehicle;

    private String fileName;
    private String url;
}

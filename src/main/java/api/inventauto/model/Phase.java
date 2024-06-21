package api.inventauto.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Entity
@Table(name = "Phase")
@Data
@Getter
@Setter
public class Phase {
    @Id
    @GeneratedValue
    private UUID id;

    private String description;
    private boolean allowEdit;
    private int order;
    private boolean status;
}

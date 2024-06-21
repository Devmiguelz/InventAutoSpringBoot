package api.inventauto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "Brand")
@Data
@Getter
@Setter
public class Brand {
    @Id
    @GeneratedValue
    private UUID id;
    private String description;
    private boolean status;
}
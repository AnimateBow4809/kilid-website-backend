package Main.classes;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("2")
public class PropertyForMortgage extends Property{

    @Column(name = "mortgage_cost")
    private Integer mortgageCost;

    public PropertyForMortgage() {
    }
}

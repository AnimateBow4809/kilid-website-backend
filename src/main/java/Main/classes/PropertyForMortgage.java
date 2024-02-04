package Main.classes;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;

@Data
@Entity
@DiscriminatorValue("2")
public class PropertyForMortgage extends Property{

    @Column(name = "mortgage_cost")
    private BigInteger mortgageCost;

    public PropertyForMortgage() {
    }
}

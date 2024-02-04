package Main.classes;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Data
@DiscriminatorValue("3")
public class PropertyForRent extends Property{
    @Column(name = "pre_cost")
    private BigInteger preCost;

    @Column(name = "monthly_rent")
    private BigInteger monthlyRent;

    public PropertyForRent() {
    }
}

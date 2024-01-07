package Main.classes;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "real_estate_agency")
@Data
public class RealStateAgency {
    @Id
    @GeneratedValue
    @Column(name = "agency_id")
    private Long id;

    @Column(name = "Aname")
    private String aName;

    @Column(name = "Aphone")
    private String aPhone;

    @Column(name = "Acity")
    private String aCity;

    @Column(name = "emp_count")
    private Integer empCount;

    @Column(name = "Mname")
    private String mName;

    @Column(name = "mFamily")
    private String mFamily;

    @Column(name = "Mphone")
    private String mPhone;

    @Column(name = "Password")
    private String password;



}

package InheritanceHW.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",updatable = false,nullable = false)
    private Long id;
    @Column
    private String age;
    @Column
    private String name;

}

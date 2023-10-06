package InheritanceHW.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="bot")
@PrimaryKeyJoinColumn(name = "Player_id")
public class Bot extends Player{

    private int Medal;

}

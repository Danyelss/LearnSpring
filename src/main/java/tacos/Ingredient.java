package tacos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;

@Data
//@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force = true)
public class Ingredient implements Persistable<String> {

    @Id
    private final String id;

    private final String name;

    private final Type type;

    @Override
    public boolean isNew() {
        return false;
    }

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }


}

package kg.megacom.greeting.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "departments")
public class Department {
//    Long id;
//    String name;
//    boolean active;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    Long id;

    @Column(unique = true, nullable = false, name = "department_name", length = 100)
    String name;

    boolean active;
}

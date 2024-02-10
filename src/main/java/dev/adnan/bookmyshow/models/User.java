package dev.adnan.bookmyshow.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "bms_users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseModel {
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
}

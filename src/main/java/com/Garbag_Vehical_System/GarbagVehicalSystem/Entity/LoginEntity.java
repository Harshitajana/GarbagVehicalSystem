package com.Garbag_Vehical_System.GarbagVehicalSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class LoginEntity {
    @Id
    @PrimaryKeyJoinColumn
    private String email;
    private String name;
    private String password;
}

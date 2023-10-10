package com.Garbag_Vehical_System.GarbagVehicalSystem.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class LoginEntity {
    @Id
    private String email;
    private String name;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Address address;
}

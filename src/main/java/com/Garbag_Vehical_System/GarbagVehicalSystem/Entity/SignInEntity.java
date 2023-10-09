package com.Garbag_Vehical_System.GarbagVehicalSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SignInEntity {
    @Id
    private String email;
    private String password;
}

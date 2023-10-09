package com.Garbag_Vehical_System.GarbagVehicalSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String house_no;
    private String society_Add;
    private int mobile_no;
    private String name;
    private String password;
}

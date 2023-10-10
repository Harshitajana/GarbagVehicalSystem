package com.Garbag_Vehical_System.GarbagVehicalSystem.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
//  @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addID;
    private int pincode;
    private String society_name;
    private String house_no;
    private String mobile_no;
    @OneToOne(mappedBy = "address")
    @JsonBackReference
    private LoginEntity loginEntity;
}

package com.Garbag_Vehical_System.GarbagVehicalSystem.Services;

import com.Garbag_Vehical_System.GarbagVehicalSystem.Entity.LoginEntity;
import com.Garbag_Vehical_System.GarbagVehicalSystem.Entity.SignInEntity;
import com.Garbag_Vehical_System.GarbagVehicalSystem.Repositry.Repositry;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repositry repositry;
    public List<LoginEntity> loginSave(List<LoginEntity> loginEntities) {
        return repositry.saveAll(loginEntities);
    }

    public String signdata(SignInEntity list) {
        List<LoginEntity> loginEntities = repositry.findAll();
        String s1 = list.getEmail();
        String i1 = list.getPassword();

        for (LoginEntity loginEntity : loginEntities){
            String s2 = loginEntity.getEmail();
            String i2 = loginEntity.getPassword();
            if (s1.equals(s2) && i1.equals(i2)){
                return "True";
            }
        }
        return "False";
    }
}

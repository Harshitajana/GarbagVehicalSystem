package com.Garbag_Vehical_System.GarbagVehicalSystem.Services;

import com.Garbag_Vehical_System.GarbagVehicalSystem.Entity.LoginEntity;
import com.Garbag_Vehical_System.GarbagVehicalSystem.Repositry.Repositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repositry repositry;
    public List<LoginEntity> loginSave(List<LoginEntity> loginEntities) {
        return repositry.saveAll(loginEntities);
    }

    public String signdata(LoginEntity list) {
        boolean con = false;
        List<LoginEntity> loginEntities = repositry.findAll();
        String s1 = list.getEmail();
        String i1 = list.getPassword();

        for (LoginEntity loginEntity : loginEntities) {
            String s2 = loginEntity.getEmail();
            String i2 = loginEntity.getPassword();
            if (s1.equals(s2) && i1.equals(i2)) {
                con = true;
            }
        }
        if (con == false) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "you enter password is worg plase enter right passowrd anther to forget password click for like http://localhost:8080/updatepass");
        }
        return String.valueOf(con);
    }

    public LoginEntity updatepass(LoginEntity loginEntity) {
        LoginEntity loginEntity1 = repositry.findById(loginEntity.getEmail()).get();
        loginEntity1.setPassword(loginEntity.getPassword());
         repositry.save(loginEntity1);
        return loginEntity1;
      }

}

package com.Garbag_Vehical_System.GarbagVehicalSystem.Services;

import com.Garbag_Vehical_System.GarbagVehicalSystem.Entity.LoginEntity;
import com.Garbag_Vehical_System.GarbagVehicalSystem.Repositry.Repositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repositry repositry;
    public LoginEntity loginSave(LoginEntity loginEntities) {
        List<LoginEntity> list=repositry.findAll();
        if (list.size()==0){
            repositry.save(loginEntities);
            return loginEntities;
        }
        for (LoginEntity entity:list){
            if (!loginEntities.getEmail().equals(entity.getEmail())){
                repositry.save(loginEntities);
                return loginEntities;
            }
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"your account alredy login plase singin ");
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
<<<<<<< HEAD
        if (con == false) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "you enter password is worg plase enter right passowrd anther to forget password click for like http://localhost:8080/updatepass");
        }
        return String.valueOf(con);
=======
        if (con==false){
             throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "you enter password is worg plase enter right passowrd anther to forget password click for link http://localhost:8080/updatepass");
          }
         return String.valueOf(con);
>>>>>>> f25d6d3619c581aa50a348669bae8ccd0b0a2671
    }

    public LoginEntity updatepass(LoginEntity loginEntity) {
        LoginEntity loginEntity1 = repositry.findById(loginEntity.getEmail()).get();
        loginEntity1.setPassword(loginEntity.getPassword());
         repositry.save(loginEntity1);
        return loginEntity1;
    }

}

package com.Garbag_Vehical_System.GarbagVehicalSystem.Services;

import com.Garbag_Vehical_System.GarbagVehicalSystem.Entity.Address;
import com.Garbag_Vehical_System.GarbagVehicalSystem.Entity.LoginEntity;
import com.Garbag_Vehical_System.GarbagVehicalSystem.Repositry.AddressRepositry;
import com.Garbag_Vehical_System.GarbagVehicalSystem.Repositry.Repositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repositry repositry;
    @Autowired
    private AddressRepositry addressRepositry ;
    public LoginEntity loginSave(LoginEntity loginEntities) {
        List<LoginEntity> list=repositry.findAll();
        if (list.size()==0){
            repositry.save(loginEntities);
            return loginEntities;
        }
        for (LoginEntity existingEntity : list) {
            if (existingEntity.getEmail().equals(loginEntities.getEmail())) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Your account is already logged in. Please sign in.");
            }
        }
        repositry.save(loginEntities);
        return loginEntities;
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

    public Address AddresSave(Address loginEntity) {
        return addressRepositry.save(loginEntity);
    }


//    public LoginEntity addpin(String email, int pin) {
//        LoginEntity loginEntity=repositry.findById(email).get();
//        loginEntity.setPincode(pin);
//        repositry.save(loginEntity);
//        return loginEntity;
//    }
}

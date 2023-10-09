package com.Garbag_Vehical_System.GarbagVehicalSystem.MyControllor;

import com.Garbag_Vehical_System.GarbagVehicalSystem.Entity.LoginEntity;
import com.Garbag_Vehical_System.GarbagVehicalSystem.Services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controllor {
    @Autowired
    private Service service;

    @PostMapping("login")
    public List<LoginEntity> le(@RequestBody List<LoginEntity> loginEntities){
        return service.loginSave(loginEntities);
    }
    @GetMapping("signin")
    public String singchack(@RequestBody LoginEntity list){
        return service.signdata(list);
    }
    @PutMapping("updatepass")
    public LoginEntity SignUpdate(@RequestBody LoginEntity signupdate){
        return service.updatepass(signupdate);
    }

}

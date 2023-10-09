package com.Garbag_Vehical_System.GarbagVehicalSystem.MyControllor;

import com.Garbag_Vehical_System.GarbagVehicalSystem.Entity.LoginEntity;
import com.Garbag_Vehical_System.GarbagVehicalSystem.Entity.SignInEntity;
import com.Garbag_Vehical_System.GarbagVehicalSystem.Services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public String singchack(@RequestBody SignInEntity list){
        return service.signdata(list);
    }
    @GetMapping("loginw")
    public void setService(){

    }
}

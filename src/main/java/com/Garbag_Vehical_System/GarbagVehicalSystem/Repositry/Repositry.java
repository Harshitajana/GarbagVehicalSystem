package com.Garbag_Vehical_System.GarbagVehicalSystem.Repositry;

import com.Garbag_Vehical_System.GarbagVehicalSystem.Entity.LoginEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositry  extends JpaRepository<LoginEntity, Integer>{
}

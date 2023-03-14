package com.esprit.OumaimaOuni.Repositories;

import com.esprit.OumaimaOuni.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

   // @Query("SELECT a,b,c FROM Assurance a join a.benificiaire b join b.contract c ");

   //exécuter la méthode   toutes les 60 secondes
//@Scheduled(fixedRate = 60000)
//public void fixedRateMethod() {
//log.info("Method with fixed Rate");
//}


    //Les tâches sont déclenchées  avec un  retard de 60 secondes.
//@Scheduled(fixedDelay = 60000)
//public void fixedDelayMethod() {
//log.info("Method with fixed delay");
//}


    //CRON
    //@Scheduled(cron = "*/60 * * * * *" )
    //public void cronMethod() {
    //log.info("Method with cron expression");
    //}

}

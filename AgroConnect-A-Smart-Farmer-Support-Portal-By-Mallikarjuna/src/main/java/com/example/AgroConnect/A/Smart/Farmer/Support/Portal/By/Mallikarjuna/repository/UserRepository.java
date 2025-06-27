package com.example.AgroConnect.A.Smart.Farmer.Support.Portal.By.Mallikarjuna.repository;




import com.example.AgroConnect.A.Smart.Farmer.Support.Portal.By.Mallikarjuna.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // Optional: Add custom methods if needed
    User findByUsername(String username);

    boolean existsByUsername(String username);
}



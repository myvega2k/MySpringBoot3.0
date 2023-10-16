package com.basic.myspringboot.repository;

import com.basic.myspringboot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    //select * from accounts where username = ‘spring’
    Optional<Account> findByUsername(String username);
}

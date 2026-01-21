package com.rbtms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository {
    public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

    
}

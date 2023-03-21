package com.devsuperior.userdept.repositories;

import com.devsuperior.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorie extends JpaRepository<User, Long> {
}

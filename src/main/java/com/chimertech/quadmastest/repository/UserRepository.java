package com.chimertech.quadmastest.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.chimertech.quadmastest.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // Additional custom queries can be added here if needed
}

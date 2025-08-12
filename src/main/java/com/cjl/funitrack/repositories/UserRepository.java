package com.cjl.funitrack.repositories;

import com.cjl.funitrack.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

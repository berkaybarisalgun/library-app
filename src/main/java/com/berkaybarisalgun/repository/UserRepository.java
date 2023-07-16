package com.berkaybarisalgun.repository;

import com.berkaybarisalgun.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

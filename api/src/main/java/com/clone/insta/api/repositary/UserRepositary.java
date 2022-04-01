package com.clone.insta.api.repositary;

import com.clone.insta.api.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositary extends JpaRepository<UserEntity, Long> {
}

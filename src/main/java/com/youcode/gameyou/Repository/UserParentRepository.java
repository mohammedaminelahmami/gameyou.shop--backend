package com.youcode.gameyou.Repository;

import com.youcode.gameyou.Entity.UserParent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserParentRepository extends JpaRepository<UserParent, Long> {
    Optional<UserParent> findByEmail(String email);
}
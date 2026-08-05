package com.aadil.jobtracker.UserRepository;

import com.aadil.jobtracker.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    boolean existsByName (String name);
    boolean existsByEmail(String email);

    Optional<UserEntity> findByEmail (String email);

    List<UserEntity> findByEmailsIn (List<String> email);

    Page<UserEntity> findNameContainingIgnoreCaseAndEmailContainingIgnoreCase (String name, String email, Pageable pageable);
}
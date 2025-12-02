package com.fitness.userservice.repository;

import com.fitness.userservice.Model.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    boolean existsByEmail(@NotBlank(message = "email is required") @Email(message = "Invalid Email Format") String email);
}
//Spring Data JPA automatically provides the actual class (implementation) at runtime.
// by making an interface we are basically defining that we want this operations, not their implementations
// springjpa handle that for us
// we also do not need to tag service class, spring jpa handles that automatically
// adding repository annotations is optional here. as obvious spring jpa handles that for us


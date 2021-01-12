/**
 * 
 */
package com.example.jpa.jpa_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.jpa_demo.entity.User;

/**
 * @author Shantanoo
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

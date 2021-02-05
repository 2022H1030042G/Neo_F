package com.example.Neo_Finance.repository;

import com.example.Neo_Finance.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

package com.codeclan.example.UserFolderFileService.repositories;

import com.codeclan.example.UserFolderFileService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

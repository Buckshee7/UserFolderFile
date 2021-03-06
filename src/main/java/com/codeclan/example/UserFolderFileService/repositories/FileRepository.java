package com.codeclan.example.UserFolderFileService.repositories;

import com.codeclan.example.UserFolderFileService.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}

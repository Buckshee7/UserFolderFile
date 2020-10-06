package com.codeclan.example.UserFolderFileService.repositories;

import com.codeclan.example.UserFolderFileService.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}

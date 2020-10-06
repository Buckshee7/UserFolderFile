package com.codeclan.example.UserFolderFileService.components;

import com.codeclan.example.UserFolderFileService.models.File;
import com.codeclan.example.UserFolderFileService.models.Folder;
import com.codeclan.example.UserFolderFileService.models.User;
import com.codeclan.example.UserFolderFileService.repositories.FileRepository;
import com.codeclan.example.UserFolderFileService.repositories.FolderRepository;
import com.codeclan.example.UserFolderFileService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User user = new User("admin");
        userRepository.save(user);

        Folder folder1 = new Folder("Pictures");
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Documents");
        folderRepository.save(folder2);
        Folder folder3 = new Folder("Music");
        folderRepository.save(folder3);

        File file1 = new File("Holiday", ".jpg", 3050);
        fileRepository.save(file1);
        File file2 = new File("Pet", ".jpg", 4025);
        fileRepository.save(file2);
        File file3 = new File("CV", ".docx", 1060);
        fileRepository.save(file3);
        File file4 = new File("Expenses", ".xlsx", 824);
        fileRepository.save(file4);
        File file5 = new File("BabyShark", ".mp3", 5266);
        fileRepository.save(file5);
        File file6 = new File("CaptainPugwash", ".mp3", 3050);
        fileRepository.save(file6);

        user.addFolder(folder1);
        user.addFolder(folder2);
        user.addFolder(folder3);
        userRepository.save(user);

        folder1.addFile(file1);
        folder1.addFile(file2);
        folderRepository.save(folder1);

        folder2.addFile(file3);
        folder2.addFile(file4);
        folderRepository.save(folder2);

        folder3.addFile(file5);
        folder3.addFile(file6);
        folderRepository.save(folder2);
    }

}

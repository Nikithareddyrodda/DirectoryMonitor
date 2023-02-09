package com.assignment.directorymonitor.component;

import com.assignment.directorymonitor.model.DirectoryContent;
import com.assignment.directorymonitor.repo.DirectoryContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
public class DirectoryMonitorService {

    @Autowired
    private DirectoryContentRepository repository;

    private static  String PATH ;

    public DirectoryMonitorService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path: ");
        PATH = scanner.nextLine();
    }
    @Scheduled(fixedRate = 300000)
    public DirectoryContent monitorDirectory() {


        File directory=new File(PATH);

        File[] subdirectories = directory.listFiles(File::isDirectory);

        List<String> subdirectoriesList = Arrays.stream(subdirectories)
                .map(File::getName)
                .collect(Collectors.toList());
        File[] files = directory.listFiles(File::isFile);
        List<String> filesList = Arrays.stream(files)
                .map(File::getName)
                .collect(Collectors.toList());
        System.out.println(filesList);
        DirectoryContent directoryContent = new DirectoryContent();
        directoryContent.setDirectoryName(directory.getName());
        directoryContent.setSubdirectories(subdirectoriesList);
        directoryContent.setFiles(filesList);
        directoryContent.setLastUpdated(LocalDateTime.now());
        directoryContent.setPath(PATH);
        repository.save(directoryContent);
        System.out.println(directoryContent);
        return directoryContent;

    }



}

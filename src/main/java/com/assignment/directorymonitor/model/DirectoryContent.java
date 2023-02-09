package com.assignment.directorymonitor.model;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "MonitoringRecords")
public class DirectoryContent {
    @Id
    private String id;
    private String directoryName;
    private List<String> subdirectories;
    private List<String> files;
    private LocalDateTime lastUpdated;
    private String path;

    @Override
    public String toString() {
        return "DirectoryContent{" +
                "id='" + id + '\'' +
                ", directoryName='" + directoryName + '\'' +
                ", subdirectories=" + subdirectories +
                ", files=" + files +
                ", lastUpdated=" + lastUpdated +
                ", path='" + path + '\'' +
                '}';
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public List<String> getSubdirectories() {
        return subdirectories;
    }

    public void setSubdirectories(List<String> subdirectories) {
        this.subdirectories = subdirectories;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
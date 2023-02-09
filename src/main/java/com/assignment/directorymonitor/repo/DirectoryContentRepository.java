package com.assignment.directorymonitor.repo;

import com.assignment.directorymonitor.model.DirectoryContent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectoryContentRepository extends MongoRepository<DirectoryContent, String> {
}

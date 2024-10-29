package com.ust.AuthorManagement.Repository;


import com.ust.AuthorManagement.Model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends MongoRepository<Author, Integer> {
}

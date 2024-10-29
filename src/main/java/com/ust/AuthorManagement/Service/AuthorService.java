package com.ust.AuthorManagement.Service;

import com.ust.AuthorManagement.Model.Author;
import com.ust.AuthorManagement.Repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    public Author saveAuthor(Author author) {
        return authorRepo.save(author);
    }

    public Author getAuthorById(Integer id) {
        return authorRepo.findById(id).get();
    }

    public void deleteAuthorById(Integer id) {
        authorRepo.deleteById(id);
    }

    public Author updateAuthor(Author author) {
        return authorRepo.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }
}

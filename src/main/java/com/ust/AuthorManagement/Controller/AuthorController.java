package com.ust.AuthorManagement.Controller;

import com.ust.AuthorManagement.Model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import com.ust.AuthorManagement.Service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/add")
    public Author addAuthor(@RequestBody Author author){
        return authorService.saveAuthor(author);
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Integer id){
        return authorService.getAuthorById(id);
    }

    @PutMapping("/update")
    public Author updateAuthor(@RequestBody Author author){
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("/{id}")
    public String deleteAuthorById(@PathVariable Integer id){
        authorService.deleteAuthorById(id);
        return "Deleted";
    }
    @GetMapping("/all")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }
}

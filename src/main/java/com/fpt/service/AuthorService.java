package com.fpt.service;

import com.fpt.entity.Author;
import com.fpt.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public List<Author> authors() {
        authorRepository.findAll(PageRequest.of(1,3));
        return authorRepository.findActiveAuthor(1);
    }

        public Page<Author> authorPage(int page, int limit) {
        return authorRepository.findAll(PageRequest.of(page - 1, limit));
    }

    public Author getbyId(long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public Author create(Author author) {

        author.setStatus(1);
<<<<<<< HEAD
        author.setDeletedAt(Calendar.getInstance().getTimeInMillis());
=======
        author.setCreatedAt(Calendar.getInstance().getTimeInMillis());
>>>>>>> 7099d85cc537bd94fb2b5f2347474f2cb7ab7055
        author.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        return authorRepository.save(author);
    }

    public Author update(Author author) {
        author.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        return authorRepository.save(author);
    }

    public boolean delete(Author author) {
        author.setDeletedAt(Calendar.getInstance().getTimeInMillis());
        author.setStatus(-1);
        authorRepository.save(author);
        return  true;
    }


}

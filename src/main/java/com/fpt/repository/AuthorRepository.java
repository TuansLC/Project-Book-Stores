package com.fpt.repository;

import com.fpt.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query("select h from Author as h where h.status = :status")
    List<Author> findActiveAuthor(@Param("status") int status);
}

package com.blog.blog.repository;

import com.blog.blog.model.TableA;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.UUID;

@Repository
public interface TableARepository extends JpaRepository<TableA, UUID> {

    @Query(value= "SELECT a, b, c FROM TableA a, TableB b, TableC c " +
            "WHERE a.id = b.id and c.id = a.secondaryId and " +
            "a.title = :title and a.date BETWEEN :fromDate AND :endDate")
    Page<Object> getResultSet(String title, Date fromDate, Date endDate, Pageable pageable);
}

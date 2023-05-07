package com.blog.blog.repository;

import com.blog.blog.model.TableB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TableBRepository extends JpaRepository<TableB, UUID> {

}

package com.blog.blog.repository;

import com.blog.blog.model.TableC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TableCRepository extends JpaRepository<TableC, UUID> {

}

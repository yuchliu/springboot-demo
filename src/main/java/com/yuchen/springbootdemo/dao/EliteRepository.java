package com.yuchen.springbootdemo.dao;

import com.yuchen.springbootdemo.entity.Elite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "fancies")
public interface EliteRepository extends JpaRepository<Elite, Integer> {
}

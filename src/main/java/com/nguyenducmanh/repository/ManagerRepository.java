package com.nguyenducmanh.repository;

import com.nguyenducmanh.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
    Manager findManagerByUserId(long id);
}

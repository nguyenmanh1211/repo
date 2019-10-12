package com.nguyenducmanh.repository;

import com.nguyenducmanh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.userName = :userName AND u.password = :password")
    User findUserByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);

    User findUserByUserName(String userName);

    @Query("SELECT u.userName as userName, u.fullName as fullName, u.createdDate as createdDate FROM User u WHERE u.id = :id")
    User findUserNameById(@Param("id") Long id);

//    @Query("select u from user u , permission p where u.id = p.user_id and p.role_id= 2")
//    List<User> findManagerUser();

}

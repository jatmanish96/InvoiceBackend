package com.bill.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bill.invoice.model.Login;

@Repository
public interface IAuthRepository extends JpaRepository<Login, Long>{

}

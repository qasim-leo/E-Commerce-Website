package com.practice.project.repository;

import com.practice.project.modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository <Product, Long>{
    List<Product> findAllByCategory_Id(int id);
}

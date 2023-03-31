package com.youcode.gameyou.Repository;

import com.youcode.gameyou.Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findAll(Pageable pageable);
    Page<Product> findAllByStoreId(Pageable pageable, Long idStore);
    Page<Product> findAllByCategoryId(Pageable pageable, Long idCategory);
}
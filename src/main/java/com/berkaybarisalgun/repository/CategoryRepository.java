package com.berkaybarisalgun.repository;

import com.berkaybarisalgun.library.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public class CategoryRepository extends JpaRepository<Category,Long>, JpaSpecificationExecutor <Category>{

}

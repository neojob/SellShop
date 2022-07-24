package com.kerob.buysell.repositories;

import com.kerob.buysell.models.Image;
import com.kerob.buysell.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {

}

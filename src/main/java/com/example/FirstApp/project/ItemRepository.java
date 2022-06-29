package com.example.FirstApp.project;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.FirstApp.project.DemoItem;

public interface ItemRepository extends JpaRepository<DemoItem, String>{

}

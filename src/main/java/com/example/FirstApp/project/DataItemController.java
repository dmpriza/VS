package com.example.FirstApp.project;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstApp.project.DemoItem;
import com.example.FirstApp.project.ItemRepository;

import io.swagger.v3.oas.annotations.Operation;

import java.util.ArrayList;

@Controller
@RequestMapping("/DemoItems")
public class DataItemController {

    @Autowired 
    ItemRepository itemRepository;
    List<DemoItem> items = new ArrayList<>();
    
    @GetMapping("/item")
	@ResponseBody
	public DemoItem getItem(@RequestParam(value = "name", defaultValue = "default") String name) {
		return new DemoItem(name);
	}

	@GetMapping("/items/{name}")
	public DemoItem getItemByName(@PathVariable String name){
		return new DemoItem(name);
	}

	@GetMapping("/items")
	public List<DemoItem> getAllItems() {
		return items;
	}

	@PostMapping("/items/{name}")
	public DemoItem setName(@PathVariable String name) {
		DemoItem tempItem = new DemoItem(name);
		items.add(tempItem);
		return tempItem;
	}

    public DemoItem createDemoItem(@RequestBody DemoItem item){
        itemRepository.save(item);
        return item;
    }


    @Operation(summary = "Returns a list of shopping items")
    List<DemoItem> getAllDemoItems(){
        return itemRepository.findAll();
    }




}

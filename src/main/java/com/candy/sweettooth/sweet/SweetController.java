package com.candy.sweettooth.sweet;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api")
public class SweetController {

    List<Sweet> sweets = new ArrayList<>();

    //Create
    //Post
    @PostMapping
    public void postSweet(@RequestBody Sweet sweet) {
        this.sweets.add(sweet);
    }

    //Read
    //Get
    @GetMapping
    public List getSweets() {
        return this.sweets;
    }

    //Update
    //Put/Patch
    @PutMapping(path = "/{index}")
    public void updateSweet(@PathVariable int index, @RequestBody Sweet sweet) {
        this.sweets.set(index, sweet);
    }

    //Delete
    //Delete
    @DeleteMapping(path = "/{index}")
    public void deleteSweet(@PathVariable int index) {
        this.sweets.remove(index);
    }

}

package com.womencancode.projetofinal.controller;

import com.womencancode.projetofinal.model.User;
import com.womencancode.projetofinal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;
import javax.validation.constraints.Max;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping (path = "/user")

public class UserController {
  @Autowired
    private UserService userService;

  @PostMapping
  public ResponseEntity<User> insertUser(@RequestBody User user) {
      return ResponseEntity.ok (userService.insertuser(user));
  }
@PutMapping ("/{id}")
  public ResponseEntity<User> updateUser (@RequestBody User user, @PathVariable String id){
      user.setId(id);
      return ResponseEntity.ok (userService.update(user));
}

@GetMapping
    public ResponseEntity<List<User>> findAll (){
      return ResponseEntity.ok(userService.findAll());
}

@GetMapping ("/{id}")
    public ResponseEntity<User> findById (@PathVariable String id){
      return ResponseEntity.ok(userService.findById(id));
}

@DeleteMapping
    public ResponseEntity<Void> delete (@PathVariable String id){
      userService.delete(id);
      return ResponseEntity.noContent().build();
}
}

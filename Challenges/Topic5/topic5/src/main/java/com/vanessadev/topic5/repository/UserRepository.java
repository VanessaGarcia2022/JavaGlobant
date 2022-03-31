package com.vanessadev.topic5.repository;

import com.vanessadev.topic5.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long>{

}

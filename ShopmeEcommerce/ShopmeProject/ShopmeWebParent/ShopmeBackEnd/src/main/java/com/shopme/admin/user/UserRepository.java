package com.shopme.admin.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shopme.common.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

//	User getUserByEmail(String email);
//
//	Long countById(Integer id);
//
//	void updateEnabledStatus(Integer id, boolean b);
//
//	Page<User> findAll(Pageable pageable);
//
//	Page<User> findAll(String keyword, Pageable pageable);

}

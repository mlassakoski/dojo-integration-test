package com.mlassakoski.dojointegrationtest.entity.repository;


import com.mlassakoski.dojointegrationtest.entity.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}

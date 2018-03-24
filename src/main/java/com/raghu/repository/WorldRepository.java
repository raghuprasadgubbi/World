package com.raghu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.raghu.eo.Country;

@Repository
public interface WorldRepository extends CrudRepository<Country, String>{

}

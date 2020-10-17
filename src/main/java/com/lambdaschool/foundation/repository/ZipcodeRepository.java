package com.lambdaschool.foundation.repository;

import com.lambdaschool.foundation.models.Zipcode;
import org.springframework.data.repository.CrudRepository;

public interface ZipcodeRepository extends CrudRepository<Zipcode, Long>
{
}

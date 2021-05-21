package com.luv2shop.luv2shopbackend.dao;

import com.luv2shop.luv2shopbackend.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
public interface CountryRepository extends JpaRepository<Country,Integer> {

}

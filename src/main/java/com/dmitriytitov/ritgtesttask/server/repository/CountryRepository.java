package com.dmitriytitov.ritgtesttask.server.repository;

import com.dmitriytitov.ritgtesttask.server.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dmitriy Titov on 17.06.2017.
 */
public interface CountryRepository extends JpaRepository<Country, Long> {

}

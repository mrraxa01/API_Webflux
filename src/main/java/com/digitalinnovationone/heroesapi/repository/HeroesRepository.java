package com.digitalinnovationone.heroesapi.repository;


import com.digitalinnovationone.heroesapi.document.Heroes;
import org.springframework.data.repository.CrudRepository;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String> {


}

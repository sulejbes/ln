package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.springboot.entities.Beruf;

public interface BerufRepository extends JpaRepository<Beruf, Long> {



	
}

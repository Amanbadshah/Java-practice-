package com.demo.Electronics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ElecRepo extends JpaRepository<Electronicitem, Integer> {

}

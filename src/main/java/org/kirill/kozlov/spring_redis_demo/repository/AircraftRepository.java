package org.kirill.kozlov.spring_redis_demo.repository;

import org.kirill.kozlov.spring_redis_demo.entity.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}

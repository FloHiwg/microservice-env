package com.heiwig.dfabackendapi.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource


@RepositoryRestResource(collectionResourceRel = "plants", path = "plants")
interface PlantRepository : CrudRepository<ParkRunner, Long> {
}
package com.americanexpress.synapse.local.synapsedatajdbc.repository;

import com.americanexpress.synapse.local.synapsedatajdbc.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}

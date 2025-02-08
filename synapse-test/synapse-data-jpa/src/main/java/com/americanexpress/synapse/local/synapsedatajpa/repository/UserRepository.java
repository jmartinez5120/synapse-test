package com.americanexpress.synapse.local.synapsedatajpa.repository;

import com.americanexpress.synapse.local.synapsedatajpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

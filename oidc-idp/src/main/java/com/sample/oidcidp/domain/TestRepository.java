package com.sample.oidcidp.domain;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface TestRepository extends Repository<Test, Long> {

    Test save(Test test);

    Optional<Test> findById(long id);
}

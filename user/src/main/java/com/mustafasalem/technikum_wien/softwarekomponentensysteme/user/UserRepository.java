package com.mustafasalem.technikum_wien.softwarekomponentensysteme.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

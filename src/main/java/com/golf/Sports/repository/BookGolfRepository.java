package com.golf.Sports.repository;

import com.golf.Sports.entity.BookGolf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookGolfRepository extends JpaRepository<BookGolf, Long> {
}

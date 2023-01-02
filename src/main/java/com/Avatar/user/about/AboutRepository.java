package com.Avatar.user.about;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<About, Integer> {

    public About findByTitle(String title);


}

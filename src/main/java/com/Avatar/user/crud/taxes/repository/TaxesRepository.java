package com.Avatar.user.crud.taxes.repository;
import com.Avatar.user.crud.taxes.entity.Taxes;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface TaxesRepository extends CrudRepository<Taxes, Integer> {
}

package com.example.items.repository;


import com.example.items.model.Items;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ItemsRepository extends CrudRepository<Items,Long> {

    Items findByName(String name);

    @Modifying
    @Query("update Items i set i.stock =:stock where i.name = :name")
    void updateStock(@Param(value = "stock") int stock, @Param(value = "name") String name);
}

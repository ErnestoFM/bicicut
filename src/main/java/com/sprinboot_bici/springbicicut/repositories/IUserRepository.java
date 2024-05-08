package com.sprinboot_bici.springbicicut.repositories;

import com.sprinboot_bici.springbicicut.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IUserRepository extends JpaRepository<UserModel, Long> {
}

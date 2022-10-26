package com.example.springauthmodule.repositories;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springauthmodule.models.SelectRole;
import com.example.springauthmodule.models.Roles;

public interface SelectRoleRepository extends JpaRepository<SelectRole, Long> {

    Optional<SelectRole> findByName(Roles name);

}

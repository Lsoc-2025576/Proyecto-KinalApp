package com.luistun.kinalapp.repository;

import com.luistun.kinalapp.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,String> {


}

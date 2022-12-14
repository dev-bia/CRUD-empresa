package org.soulcodeacademy.empresa.reporsitories;

import org.soulcodeacademy.empresa.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}

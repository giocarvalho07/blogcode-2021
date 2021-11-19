package com.blogcode.blogcode.repository;

import com.blogcode.blogcode.model.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensagemRepository extends JpaRepository< Mensagem, Long>{

}

package com.associacaodeherois.RegistroDeHerois.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.associacaodeherois.RegistroDeHerois.entity.Heroi;

public interface HeroiRepository extends JpaRepository<Heroi, Long> {
    
    Heroi findByNomeDeHeroi(String name);
    List<Heroi> findByPoder();
}

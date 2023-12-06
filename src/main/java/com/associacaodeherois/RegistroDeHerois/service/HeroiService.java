package com.associacaodeherois.RegistroDeHerois.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.associacaodeherois.RegistroDeHerois.entity.Heroi;
import com.associacaodeherois.RegistroDeHerois.repository.HeroiRepository;

@Service
public class HeroiService {

    private HeroiRepository heroiRepository;

    public HeroiService(HeroiRepository heroiRepository) {
        this.heroiRepository = heroiRepository;
    }

    // METHODS 

    public Heroi create(Heroi heroi) {
        return heroiRepository.save(heroi);
    }

    public List<Heroi> findAll() {
        return heroiRepository.findAll();
    }

    public Heroi findById(Long id) {
        return heroiRepository.findById(id).orElse(null);
    }

    public Heroi findByHeroName(String name) {
        return heroiRepository.findByNomeDeHeroi(name);
    }

    public List<Heroi> findByPowerType(String powerType) {
        return heroiRepository.findByPoder();
    }

    public Heroi updateHero(Heroi hero) {
        return heroiRepository.save(hero);
    }

    public void deleteHero(Long id) {
        heroiRepository.deleteById(id);
    }
}

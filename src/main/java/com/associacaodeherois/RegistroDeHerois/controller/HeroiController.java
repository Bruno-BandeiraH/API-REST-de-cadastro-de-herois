package com.associacaodeherois.RegistroDeHerois.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.associacaodeherois.RegistroDeHerois.entity.Heroi;
import com.associacaodeherois.RegistroDeHerois.service.HeroiService;
import com.associacaodeherois.RegistroDeHerois.util.TipoDePoder;

@RestController
@RequestMapping("herois")
public class HeroiController {
    
    private HeroiService heroiService;

    public HeroiController(HeroiService heroiService) {
        this.heroiService = heroiService;
    }
    
    //METHODS 

    @PostMapping
    public Heroi create(@RequestBody Heroi heroi) {
        return heroiService.create(heroi);
    }

    @GetMapping
    public List<Heroi> findAll() {
        return heroiService.findAll();
    }

    @GetMapping("/{id}")
    public Heroi findById(@PathVariable Long id) {
        return heroiService.findById(id);
    }

    @GetMapping("/nome/{NomeDeHeroi}")
    public Heroi findByHeroName(@PathVariable String NomeDeHeroi) {
        return heroiService.findByHeroName(NomeDeHeroi);
    }

    @GetMapping("/tipo/{powerType}")
    public List<Heroi> findByPowerType(@PathVariable TipoDePoder powerType) {
        return heroiService.findByPowerType(powerType);
    }

    @PutMapping
    public Heroi updateHeroi(@RequestBody Heroi hero) {
        return heroiService.updateHero(hero);
    }

    @DeleteMapping("/{id}")
    public void deleteHero(@PathVariable Long id) {
        heroiService.deleteHero(id);
    }
}

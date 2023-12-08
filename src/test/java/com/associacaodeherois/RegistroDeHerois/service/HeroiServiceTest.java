package com.associacaodeherois.RegistroDeHerois.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.associacaodeherois.RegistroDeHerois.entity.Heroi;
import com.associacaodeherois.RegistroDeHerois.util.TipoDePoder;

@SpringBootTest
@ActiveProfiles("test") // uses only the arquives in the test package
public class HeroiServiceTest {

    @Autowired
    private HeroiService heroiService;

    // Method that returns a Heroi obj
    private Heroi createHeroi() {
        Long id = Long.valueOf(1);
        Long number = Long.valueOf(988112244);
        Heroi hero = new Heroi();
        hero.setId(id);
        hero.setNomeCompleto("Bruno Bandeira");
        hero.setNomeDeHeroi("Programador Sinistro");
        hero.setCelular(number);
        hero.setEmail("email@valido.com");
        hero.setPoder(TipoDePoder.TECNOLOGICO);
        hero.setDescricaoDoPoder("Seus códigos sempre passam de primeira nos testes unitários.");
        hero.setAtuaComoHeroi(true);
        return hero;
    }

    @Test
    @DisplayName("Should succeed to create a Heroi")
    void testCreateSuccess() {
        Heroi hero = createHeroi();
        Heroi heroCreated = heroiService.create(hero);

        assertEquals(hero, heroCreated);
    }

    @Test
    @DisplayName("Should fail to create a Heroi")
    void testCreateFail() {
        Long id = Long.valueOf(1);
        Heroi hero = new Heroi();
        hero.setId(id);
        hero.setEmail("email@valido.com");
        hero.setPoder(TipoDePoder.TECNOLOGICO);
        hero.setDescricaoDoPoder("Seus códigos sempre passam de primeira nos testes unitários.");
        hero.setAtuaComoHeroi(true);

        assertThrows(Exception.class, () -> heroiService.create(hero));
    }

    @Test
    @DisplayName("Should succeed to find a Heroi by heroName")
    void testFindByHeroNameSuccess() {
        Heroi hero = createHeroi();
        heroiService.create(hero);
        Heroi heroiFinded = heroiService.findByHeroName("Programador Sinistro");      
        
        assertEquals(hero, heroiFinded);
    }

    @Test
    @DisplayName("Should succeed to update a Heroi obj")
    void testUpdateHeroSuccess() {
        Heroi hero = createHeroi();
        heroiService.create(hero);
        hero.setPoder(TipoDePoder.SOBRENATURAL);
        heroiService.updateHero(hero);

        assertNotEquals(TipoDePoder.TECNOLOGICO, hero.getPoder());
    }
}

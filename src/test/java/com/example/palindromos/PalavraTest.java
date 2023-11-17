package com.example.palindromos;

import com.example.palindromos.adapter.dto.PalavraDTO;
import com.example.palindromos.adapter.entities.Palavra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalavraTest {
    @Test
    public void testConstrutorComDescricao() {
        String descricao = "Teste";
        Palavra palavra = new Palavra(descricao);

        assertEquals(descricao, palavra.getDescricao());
        assertEquals(null, palavra.getId()); // O ID deve ser inicializado como null
    }

    @Test
    public void testSetGetId() {
        Long id = 1L;
        Palavra palavra = new Palavra();
        palavra.setId(id);

        assertEquals(id, palavra.getId());
    }

    @Test
    public void testSetGetDescricao() {
        String descricao = "Teste";
        Palavra palavra = new Palavra();
        palavra.setDescricao(descricao);

        assertEquals(descricao, palavra.getDescricao());
    }

    @Test
    public void testToDTO() {
        String descricao = "Teste";
        Palavra palavra = new Palavra(descricao);

        PalavraDTO palavraDTO = palavra.toDTO();

        assertEquals(descricao, palavraDTO.getDescricao());
    }

    @Test
    public void testToString() {
        String descricao = "Teste";
        Palavra palavra = new Palavra(descricao);

        String expected = "Palavra [descricao=" + descricao + "]";
        assertEquals(expected, palavra.toString());
    }
}

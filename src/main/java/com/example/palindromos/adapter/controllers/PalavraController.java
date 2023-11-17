package com.example.palindromos.adapter.controllers;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.palindromos.adapter.dto.MatrizDTO;
import com.example.palindromos.adapter.dto.PalavraDTO;
import com.example.palindromos.domain.services.PalavraService;

@RestController
@Tag(name="Palindromos-api")
@RequestMapping("/api")
public class PalavraController implements PalavraControllerInterface{
	private final PalavraService palavraService;
	public PalavraController(PalavraService palavraService) {
		this.palavraService = palavraService;
	}
	@PostMapping("palindromos")
	public  ResponseEntity<List<PalavraDTO>> encontrarPalindromos(@RequestBody MatrizDTO entityMatriz) {
		List<PalavraDTO> encontradosPalindromos = palavraService.encontrarPalindromos(entityMatriz);
		palavraService.saveAll(encontradosPalindromos);
		return ResponseEntity.ok(encontradosPalindromos);
	}
	@Operation(summary = "Busca todos os palindromos", method = "GET")
	@ApiResponses( value = {
			@ApiResponse(responseCode = "200", description = "Retorna os Palindromos"),
			@ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
			@ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
	})
	@GetMapping("todos")
	public List<PalavraDTO> findAllPalavra() {
		return palavraService.findAllPalavra();
	}
}
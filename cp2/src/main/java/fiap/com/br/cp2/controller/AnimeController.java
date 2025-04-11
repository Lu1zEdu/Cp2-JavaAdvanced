package fiap.com.br.cp2.controller;


import fiap.com.br.cp2.dto.AnimeRequest;
import fiap.com.br.cp2.dto.AnimeResponse;
import fiap.com.br.cp2.models.Anime;
import fiap.com.br.cp2.models.Rank;
import fiap.com.br.cp2.service.AnimeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/animes")
@Tag(name = "api-anime")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @Operation(summary = "Cria um novo anime")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Anime cadastrado com sucesso",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = AnimeResponse.class))}),
            @ApiResponse(responseCode = "400", description = "Atributos informados são inválidos",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    public ResponseEntity<AnimeResponse> createAnime(@Valid @RequestBody AnimeRequest animeRequest) {
        AnimeResponse response = animeService.saveAnime(animeRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @Operation(summary = "Retorna uma lista de animes")
    @GetMapping
    public ResponseEntity<Page<AnimeResponse>> readAnimes(@RequestParam(defaultValue = "0") Integer page) {
        Pageable pageable = PageRequest.of(page, 2, Sort.by("titulo").ascending());
        Page<AnimeResponse> responsePage = animeService.findAll(pageable);
        return ResponseEntity.ok(responsePage);
    }


    @Operation(summary = "Retorna um anime por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Anime encontrado com sucesso",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = AnimeResponse.class))}),
            @ApiResponse(responseCode = "404", description = "Anime não encontrado",
                    content = @Content(schema = @Schema()))
    })
    @GetMapping("/{id}")
    public ResponseEntity<AnimeResponse> readAnimeById(@PathVariable Long id) {
        Optional<Anime> anime = animeService.findById(id);
        return anime
                .map(a -> ResponseEntity.ok(animeService.entityToResponse(a)))
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Atualiza um Anime existente")
    @PutMapping("/{id}")
    public ResponseEntity<Anime> updateAnime(@PathVariable Long id, @Valid @RequestBody Anime animeAtualizado) {
        try {
            Anime updateAnime = animeService.updateAnime(id, animeAtualizado);
            return ResponseEntity.ok(updateAnime);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Deleta um Rank por ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnime(@PathVariable Long id) {
        animeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

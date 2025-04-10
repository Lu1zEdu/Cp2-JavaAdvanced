package fiap.com.br.cp2.controller;

import fiap.com.br.cp2.models.Rank;
import fiap.com.br.cp2.service.RankService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ranks")
@Tag(name = "api-rank")
public class RankController {

    @Autowired
    private RankService rankService;

    @Operation(summary = "Cria um novo Rank")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Rank criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro de validação")
    })
    @PostMapping
    public ResponseEntity<Rank> createRank(@Valid @RequestBody Rank rank) {
        Rank savedRank = rankService.saveRank(rank);
        return new ResponseEntity<>(savedRank, HttpStatus.CREATED);
    }

    @Operation(summary = "Retorna todos os Ranks com paginação")
    @GetMapping
    public ResponseEntity<Page<Rank>> getAllRanks(@RequestParam(defaultValue = "0") int page,
                                                  @RequestParam(defaultValue = "5") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Rank> rankPage = rankService.findAll(pageable);
        return ResponseEntity.ok(rankPage);
    }

    @Operation(summary = "Busca um Rank pelo ID")
    @GetMapping("/{id}")
    public ResponseEntity<Rank> getRankById(@PathVariable Long id) {
        Optional<Rank> rank = rankService.findById(id);
        return rank.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Atualiza um Rank existente")
    @PutMapping("/{id}")
    public ResponseEntity<Rank> updateRank(@PathVariable Long id, @Valid @RequestBody Rank rankAtualizado) {
        try {
            Rank updatedRank = rankService.updateRank(id, rankAtualizado);
            return ResponseEntity.ok(updatedRank);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Deleta um Rank por ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRank(@PathVariable Long id) {
        rankService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

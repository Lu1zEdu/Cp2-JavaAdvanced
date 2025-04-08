package cp2.fiap.com.br.Cp2_JavaAdvanced.controller;

import cp2.fiap.com.br.Cp2_JavaAdvanced.models.Anime;
import cp2.fiap.com.br.Cp2_JavaAdvanced.service.AnimeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Anime")
@Tag(name = "api-anime")
public class AnimeController {
    @Autowired
    AnimeController animeController;

    @Autowired
    AnimeService animeService;


}

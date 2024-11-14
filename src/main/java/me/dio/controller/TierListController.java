// AnimeController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animes")
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @GetMapping
    public List<Anime> getAnimes() {
        return animeService.getAllAnimes();
    }

    @PostMapping
    public Anime addAnime(@RequestBody Anime anime) {
        return animeService.addAnime(anime);
    }

    @DeleteMapping("/{id}")
    public void deleteAnime(@PathVariable Long id) {
        animeService.deleteAnime(id);
    }
}

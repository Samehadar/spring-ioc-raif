package ru.raiffeisen.springservicesdemo.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.raiffeisen.springservicesdemo.service.MusicService;

@Controller
public class MusicController {

    private MusicService musicService;

    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping("/play")
    public String play(
            @RequestParam("title") String title,
            @RequestParam("author") String author,
            Model model) {



        model.addAttribute("title", title);
        model.addAttribute("author", author);

        return "play";
    }

    @GetMapping("/whatIsPlayNow")
    public ResponseEntity<String> whatIsPlayNow() {
        return new ResponseEntity<>(musicService.play(), HttpStatus.OK);
    }

}

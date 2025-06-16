package httpprotocolo.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {

    @GetMapping
    public String getMensagem() {
        return "GET recebido com sucesso!";
    }

    @PostMapping
    public String postMensagem(@RequestBody String corpo) {
        return "POST recebido com corpo: " + corpo;
    }
}

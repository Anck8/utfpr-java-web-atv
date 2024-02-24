package local.utfpr.javaweb.cidades.crudcidades.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Set;

@Controller
public class CidadeController {

    @GetMapping("/")
    public String list(Model memoria) {
        var cidades = Set.of(
                new Cidade("Curitiba", "PR"),
                new Cidade("Ponta Grossa", "PR"),
                new Cidade("Itapema", "SC")
        );
        memoria.addAttribute("listaCidades", cidades);
        return "/crud";
    }
}

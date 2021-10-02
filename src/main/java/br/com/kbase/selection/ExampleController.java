package br.com.kbase.selection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.Produces;
import java.util.List;

@RestController
@CrossOrigin
@Slf4j
public class ExampleController {
    @Autowired
    ExampleRepository exampleRepository;

    @GetMapping(value = "/example", produces = "application/json")
    @ResponseBody
    @CrossOrigin
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public List<Example> productReinstate() throws Exception {
        return exampleRepository.findAll();
    }
}

package kg.megacom.greeting.controllers;

import kg.megacom.greeting.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController {

    @GetMapping("/all")
    public List<Position> findAll(){
        return Arrays.asList(new Position(1l, "Manager", true),
                            new Position(2l, "Ceo", true),
                            new Position(3l, "Middle", true),
                            new Position(4l, "Junior", true));
    }

    @GetMapping("/{id}")
    public Position getById(@PathVariable Long id){
        return new Position(id, "Ceo", true);
    }

    @PostMapping("/save")
    public Position save(@RequestBody Position position){
        position.setId(100l);
        return position;
    }

    @PutMapping
    public Position update(@RequestBody Position position){
        position.setName("New Name");
        return position;
    }

    @DeleteMapping
    public Position remove(@PathVariable Long id){
        return new Position(id, "Head", true);
    }
}

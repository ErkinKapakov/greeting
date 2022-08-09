package kg.megacom.greeting.controllers;

import kg.megacom.greeting.controllers.base.CrudMethods;
import kg.megacom.greeting.models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController implements CrudMethods<Position> {

    @Override
    public List<Position> findAll(){
        return Arrays.asList(new Position(1L, "Manager", true),
                            new Position(2L, "Ceo", true),
                            new Position(3L, "Middle", true),
                            new Position(4L, "Junior", true));
    }

    @Override
    public Position getById(@PathVariable Long id){
        return new Position(id, "Ceo", true);
    }

    @Override
    public Position save(@RequestBody Position position){
        position.setId(100L);
        return position;
    }

    @Override
    public Position update(@RequestBody Position position){
        position.setName("New position");
        return position;
    }

    @Override
    public Position remove(@PathVariable Long id){
        return new Position(id, "Head", true);
    }
}

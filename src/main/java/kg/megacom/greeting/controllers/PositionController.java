package kg.megacom.greeting.controllers;

import kg.megacom.greeting.controllers.base.CrudMethods;
import kg.megacom.greeting.models.Position;
import kg.megacom.greeting.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController implements CrudMethods<Position> {

    @Autowired
    private PositionService positionService;

    @Override
    public List<Position> findAll(){
        return positionService.findAll();
    }

    @Override
    public Position getById(@PathVariable Long id){
        return new Position(id, "Ceo", true);
    }

    @Override
    public Position save(@RequestBody Position position){
        return positionService.save(position);
    }

    @Override
    public Position update(@RequestBody Position position){
        return positionService.update(position);
    }

    @Override
    public Position remove(@PathVariable Long id){
        return new Position(id, "Head", true);
    }
}

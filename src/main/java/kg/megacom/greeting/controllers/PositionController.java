package kg.megacom.greeting.controllers;

import kg.megacom.greeting.controllers.base.CrudMethods;
import kg.megacom.greeting.models.Position;
import kg.megacom.greeting.services.impl.PositionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/position")
public class PositionController implements CrudMethods<Position> {

    @Autowired
    private PositionServiceImpl positionService;

    @Override
    public List<Position> findAll(){
        return positionService.findAll();
    }

    @Override
    public Optional<Position> getById(@PathVariable Long id){
        return positionService.findById(id);
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
    public void deleteById(@PathVariable Long id){
        positionService.deleteById(id);
    }
}

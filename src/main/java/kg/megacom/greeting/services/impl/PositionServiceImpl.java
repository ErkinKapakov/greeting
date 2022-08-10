package kg.megacom.greeting.services.impl;

import kg.megacom.greeting.dao.PositionRepository;
import kg.megacom.greeting.models.Position;
import kg.megacom.greeting.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionServiceImpl implements CrudService<Position> {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public Position save(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public Position update(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public void deleteById(Long id) {
        positionRepository.deleteById(id);
    }

    @Override
    public Optional<Position> findById(Long id) {
        return positionRepository.findById(id);
    }

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}

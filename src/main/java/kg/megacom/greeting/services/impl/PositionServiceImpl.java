package kg.megacom.greeting.services.impl;

import kg.megacom.greeting.dao.PositionRepository;
import kg.megacom.greeting.models.Position;
import kg.megacom.greeting.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

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
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}

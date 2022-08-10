package kg.megacom.greeting.services;

import kg.megacom.greeting.models.Position;

import java.util.List;

public interface PositionService {
    Position save(Position position);
    Position update(Position position);
    List<Position> findAll();
}

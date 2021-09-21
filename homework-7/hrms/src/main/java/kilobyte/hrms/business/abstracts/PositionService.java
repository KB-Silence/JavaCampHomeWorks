package kilobyte.hrms.business.abstracts;

import java.util.List;

import kilobyte.hrms.entities.concretes.Position;

public interface PositionService {
	List<Position> getAll();
}

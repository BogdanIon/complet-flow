package ch.aurachain.engine.repository;
import ch.aurachain.engine.repository.entity.AuditEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRepository extends JpaRepository<AuditEntity, Integer> {


}

package ch.aurachain.engine.service;

import ch.aurachain.engine.repository.AuditRepository;
import ch.aurachain.engine.repository.entity.AuditEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineService {

    private AuditRepository auditRepository;

    @Autowired
    public EngineService(AuditRepository auditRepository){
        this.auditRepository = auditRepository;
    }

    public List<AuditEntity> getAll(){
        return auditRepository.findAll();
    }

    public void insert(Integer number){
        AuditEntity auditEntity = new AuditEntity();
        auditEntity.setNumber(number);
        auditRepository.save(auditEntity);
    }

}

package ch.aurachain.engine.service;

import ch.aurachain.engine.client.WorkerClient;
import ch.aurachain.engine.repository.AuditRepository;
import ch.aurachain.engine.repository.entity.AuditEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EngineService {

    private AuditRepository auditRepository;

    private WorkerClient workerClient;

    @Autowired
    public EngineService(AuditRepository auditRepository, WorkerClient workerClient){
        this.auditRepository = auditRepository;
        this.workerClient = workerClient;
    }

    public List<Integer> getAll(){
        return auditRepository.findAll().stream().map(a->a.getNumber()).collect(Collectors.toList());
    }

    public Integer insert(Integer number){
        AuditEntity auditEntity = new AuditEntity();
        auditEntity.setNumber(number);
        auditRepository.save(auditEntity);
        return workerClient.fib(number);
    }

}

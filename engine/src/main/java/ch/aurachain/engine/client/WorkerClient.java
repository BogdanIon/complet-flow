package ch.aurachain.engine.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "worker-service")
public interface WorkerClient {

    @GetMapping("/api/value/{index}")
    Integer fib(@PathVariable("index") Integer index);
}

package ch.aurachain.engine.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RibbonClient(name = "worker")
public interface WorkerClient {

    @GetMapping("/worker/api/value/{index}")
    Integer fib(@PathVariable("index") Integer index);
}

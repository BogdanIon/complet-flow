package ch.aurachain.worker.service;

import org.springframework.stereotype.Service;

@Service
public class WorkerService {

    public int fib(int index) {
        if (index < 2) return 1;
        return fib(index - 1) + fib(index - 2);
    }
}

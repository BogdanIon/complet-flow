package ch.aurachain.worker;

import ch.aurachain.worker.service.WorkerService;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class WorkerApplicationTests {

	@Mock
	WorkerService workerService;

	@Test
	void contextLoads() {
	}

	@Test
	void fib(){
		workerService = new WorkerService();
		Assertions.assertEquals(workerService.fib(4) ,5);
	}

}

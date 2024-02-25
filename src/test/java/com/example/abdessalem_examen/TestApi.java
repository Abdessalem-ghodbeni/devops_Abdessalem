package com.example.abdessalem_examen;

import com.example.abdessalem_examen.Entites.Washing_Service;
import com.example.abdessalem_examen.Entites.Worker;
import com.example.abdessalem_examen.Repository.Washing_ServiceRepository;
import com.example.abdessalem_examen.Services.IExamenServiceImp;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TestApi {
@Autowired
    private IExamenServiceImp examenServiceImp;

@Test
    public  void TestaddWashingService() {
    Worker worker = new Worker();
    worker.setName("Abdessalem");
    Worker savedWorker = examenServiceImp.addWorker(worker);
    assertNotNull(savedWorker);

}
}

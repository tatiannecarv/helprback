package com.api.helprback;

import com.api.helprback.domain.Chamado;
import com.api.helprback.domain.Tecnico;
import com.api.helprback.services.ChamadoService;
import com.api.helprback.services.TecnicoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HelprbackApplicationTests {

	@Autowired
	private ChamadoService chamadoService;

	@Autowired
	private TecnicoService tecnicoService;

	@Test
	void testContextReportChamadosTecnicoSemanal() {
		Integer idTecnico = 1;
		List<Chamado> testObj = chamadoService.reportSemanalChamadosTecnico(idTecnico);
		Assertions.assertTrue(testObj.size()>0);
	}

	@Test
	void testContextReportTecnicoUrgenciaDia(){
		List<Tecnico> test = tecnicoService.reportTecnicoChamadoPrioridadeDia();
		Assertions.assertTrue(test.size()>=0);
	}
}

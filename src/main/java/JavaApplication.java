import com.demo.entities.resp.DadosCliente;
import com.demo.entities.resp.Fatura;
import com.demo.entities.resp.Total;
import com.demo.entities.resp.Transacoes;
import com.demo.payloads.RequestDAO;
import com.demo.payloads.ResponseDAO;
import com.demo.services.TransacaoService;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;

public class JavaApplication {

	public static void main(String[] args) {

		Fatura fatura;
		DadosCliente dadosCliente;
		Transacoes transacoes;
		TransacaoService transacaoService = new TransacaoService();
		Total total;

		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());

		try {
			RequestDAO req = mapper.readValue(new File("src/main/resources/request.json"), RequestDAO.class);

			dadosCliente = new DadosCliente(req.getConta().getNomeCliente(), req.getTransacoes());

			transacoes = new Transacoes(
					transacaoService.getListaInternacional(req.getTransacoes()),
					transacaoService.getListaNacional(req.getTransacoes()));

			total = new Total(dadosCliente.getTotalFatura(), dadosCliente.getSaldoAnterior());

			fatura = new Fatura(dadosCliente, transacoes, total);
			mapper.writeValue(new File("src/main/resources/response.json"), new ResponseDAO(fatura));
			String json = mapper.writeValueAsString(new ResponseDAO(fatura));

			System.out.println(json);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

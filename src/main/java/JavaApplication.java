import com.demo.entities.resp.DadosCliente;
import com.demo.entities.resp.Fatura;
import com.demo.entities.resp.Total;
import com.demo.entities.resp.Transacoes;
import com.demo.payloads.RequestDAO;
import com.demo.payloads.ResponseDAO;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;
public class JavaApplication {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		try {
			RequestDAO req = mapper.readValue(new File("src/main/resources/request.json"), RequestDAO.class);

			DadosCliente dadosCliente = new DadosCliente(req.getConta().getNomeCliente(), req.getTransacoes());
			Total total = new Total(dadosCliente.getTotalFatura(), dadosCliente.getSaldoAnterior());
			Fatura fatura = new Fatura(dadosCliente, new Transacoes(req.getTransacoes()), total);

			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(new File("src/main/resources/response.json"), new ResponseDAO(fatura));

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

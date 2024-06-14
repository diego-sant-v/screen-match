package br.diego.screenmatch;

import br.diego.screenmatch.model.DadosSerie;
import br.diego.screenmatch.service.ConsumoAPI;
import br.diego.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String apiKey = "eeaf352e";
		var consumoAPI = new ConsumoAPI();
		String json = consumoAPI.obterDados("https://www.omdbapi.com/?apikey=" + apiKey +"&t=breaking+bad&plot=full");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
	}
}

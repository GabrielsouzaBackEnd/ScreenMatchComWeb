//package br.com.alura.screenmatch.service;
//
//import br.com.alura.screenmatch.principal.Principal;
//import br.com.alura.screenmatch.repository.SerieRepository;
//import org.springframework.boot.CommandLineRunner;
//
//public class ScreenmatchApplication implements CommandLineRunner {
//
//    private SerieRepository repository;
//
//    public ScreenmatchApplication(SerieRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Principal principal = new Principal(repository);
//
//        principal.exibeMenu();
//    }
//}

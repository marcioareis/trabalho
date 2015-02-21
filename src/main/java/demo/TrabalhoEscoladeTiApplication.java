package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ResquestMapping(value="/teste")
public class TrabalhoEscoladeTiApplication {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(){
		return "hello word";
	}
	
	@RequestMapping(value="/alunos/{ra}",method=RequestMethod.GET)
	public Aluno getAluno(@PathVariable Integer ra){
		Aluno novo = new Aluno("Aluno Jr. " + System.currentTimeMillis(), ra); 
		return novo;
	}

    public static void main(String[] args) {
        SpringApplication.run(TrabalhoEscoladeTiApplication.class, args);
    }
}

package unitec.org.elementos;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosApplication implements CommandLineRunner{
    
@Autowired RepositorioMensajitos repoMensa; //inyectar dependencias de entidad autoenlaza

	public static void main(String[] args) {
		SpringApplication.run(ElementosApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        //guardar
       //Mensajitos m=new Mensajitos("kanchi", "aaalol");
        //repoMensa.save(m);
        
        
        //buscar todos
       //ArrayList<Mensajitos> mensajitos= 
         //      (ArrayList<Mensajitos>) repoMensa.findAll();
       //for (Mensajitos mensa: mensajitos){
         //  System.out.println(mensa.getTitulo());
        //}
        
        //probaremos buscar por id
        
        //Mensajitos ml = repoMensa.findOne(3);
        //System.out.println(ml.getTitulo());
                
        //update actualizacion
        
        //repoMensa.save(new Mensajitos(1,"si se pudo","lol "));
        //borrar
        //repoMensa.delete(1);
    }
}

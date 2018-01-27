/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.org.elementos;

import javax.persistence.Entity;//sirve para mapear
import javax.persistence.GeneratedValue;
import javax.persistence.Id;//se pone por que id es primary key

@Entity
//las entidades todas las vamos a mapear con jpa por que es el estandar, es jaxvax.persistans

public class Mensajitos { //ESTAS CLASES TIPO ENTIDAD SE LE CONOCEN COMO POJO'S
     @Id //se tiene que poner por que es primary key
     //@Column(name="nombre del campo de la tabla")***** si quiero utilizar otro nombre para el campo de aqui(opcional)
     @GeneratedValue //para autoincremento
    private Integer id; //se tienen que llamar igual a las columnas de la tabla
    private String titulo;
    private String cuerpo;

    public Mensajitos(Integer id) { //constructor de id lo inicializa, ayuda a borrar datos. para la operacion, select where id, y delete
        this.id = id;
    }

    public Mensajitos(String titulo, String cuerpo) {//inicializa los campos, es para la operacion insert excepto id, 
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public Mensajitos(Integer id, String titulo, String cuerpo) {//constructor que inicializa todos los campos, es para update
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public Mensajitos() {//constructor de defecto es para laa operacion select
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
}

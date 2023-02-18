package br.unitins.resource;
import java.util.List;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.unitins.model.Biblioteca;

@Path("/Biblioteca")
public class ControleBiblioteca {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Biblioteca test(){
        Biblioteca teste = new Biblioteca();
        teste.setIdLivro(1);
        teste.setDataCompra(null);
        teste.setQuantidade(null);
        teste.setDescricao(null);
        teste.setLocaLestante(0);
        return teste;       
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Biblioteca> getAll(){
       //retorna todas as pessoas da tabela
        return Biblioteca.findAll().list();
    }

    @POST
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    @Transactional
    public Biblioteca insert(Biblioteca biblioteca){
        biblioteca.persist();
        return biblioteca;
    }
}

package br.unitins.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.unitins.model.Pessoa;

@Path("/pessoa")
public class PessoaResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    
    public Pessoa test(){
        Pessoa p = new Pessoa();
        p.setNome("Carlos Henrique");
        p.setIdade(40);

        return p;

    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pessoa> getAll(){
       //retorna todas as pessoas da tabela
        return Pessoa.findAll().list();
    }

    @POST
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    @Transactional
    public Pessoa insert(Pessoa pessoa){
        pessoa.persist();
        return pessoa;
    }
}

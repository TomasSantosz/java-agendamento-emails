package br.com.alura.controller;

import br.com.alura.entidade.AgendamentoEmail;
import br.com.alura.servico.AgendamentoEmailServico;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("emails")
public class AgendamentoEmailController {

    @Inject
    private AgendamentoEmailServico agendamentoEmailServico;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response listar(){
        return Response.ok(agendamentoEmailServico.listar()).build();
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response inserir(AgendamentoEmail agendamentoEmail){
        agendamentoEmailServico.inserir(agendamentoEmail);
        return Response.status(201).build();
    }
}

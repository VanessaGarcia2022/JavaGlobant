package com.vanessadev.emailProject.util;

import com.vanessadev.emailProject.controllers.SessionController;

import com.vanessadev.emailProject.dto.MailResponseDTO;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import java.security.Principal;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class MailResponseModelAssembler implements RepresentationModelAssembler<MailResponseDTO, EntityModel<MailResponseDTO>> {

    private Principal principal;
    @Override
    public EntityModel<MailResponseDTO> toModel(MailResponseDTO entity) {
        return EntityModel.of(entity, linkTo(methodOn(SessionController.class).sent(principal)).withSelfRel());
    }
}

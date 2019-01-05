/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.knowledge.rest;

import io.github.evolutionThroughCraft.common.arch.contracts.Contract;
import io.github.evolutionThroughCraft.common.service.main.utils.ResourceUtility;
import org.springframework.stereotype.Component;
import io.github.evolutionThroughCraft.knowledge.models.KnowledgeForm;

/**
 *
 * @author dwin
 */
@Component
public class CreateContract implements Contract<KnowledgeForm> {
    
    @Override
    public void validate(KnowledgeForm form) {
        ResourceUtility.ensureResource(form, "KnowledgeForm Missing");
        ResourceUtility.ensureResource(form.getAccountId(), "Account Id");
        ResourceUtility.ensureResource(form.getTriviaId(), "Trivia Id");    
        ResourceUtility.ensureResource(form.getCreateUser(), "CreateUser Missing");
        ResourceUtility.ensureResource(form.getUpdateUser(), "UpdateUser Missing");
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.knowledge.rest;

import io.github.evolutionThroughCraft.common.arch.orchestrators.SimpleOperation;
import io.github.evolutionThroughCraft.knowledge.models.KnowledgeForm;
import io.github.evolutionThroughCraft.knowledge.repo.KnowledgeRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dwin
 */
@Component
@Getter
public class FindOperation extends SimpleOperation<Long, List<KnowledgeForm>>{
    
    @Autowired
    private KnowledgeRepository knowledgeRepo;

    @Override
    public List<KnowledgeForm> perform(Long accountId) {
        return getKnowledgeRepo()
                        .findByAccountId(accountId)
                        .stream()
                        .map(entity -> new KnowledgeForm(entity))
                        .collect(Collectors.toList());
    }
}

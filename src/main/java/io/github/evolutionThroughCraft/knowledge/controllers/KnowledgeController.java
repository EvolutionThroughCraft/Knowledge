/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.knowledge.controllers;

import io.github.evolutionThroughCraft.common.service.main.routes.KnowledgeRoutes;
import io.github.evolutionThroughCraft.knowledge.models.KnowledgeForm;
import io.github.evolutionThroughCraft.knowledge.repo.KnowledgeRepository;
import io.github.evolutionThroughCraft.knowledge.rest.CreateOperation;
import java.util.List;
import javax.validation.Valid;
import lombok.Getter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dwin
 */
@RestController
@RequestMapping
@Getter
public class KnowledgeController implements KnowledgeRoutes {
    
    private static final Logger scribe = Logger.getLogger(KnowledgeController.class);

    @Autowired
    private KnowledgeRepository knowledgeRepo;
    
    @Autowired
    private CreateOperation createOperation;
    
//    @Autowired
//    private CheckUniqueOperation checkUniqueOperation;
    
//    @Autowired
//    private AddAnswerOperation addAnswerOperation;
    
    @GetMapping(GET_KNOWLEDGE_PATH)
    public List<KnowledgeForm> findMatching(@Valid @RequestBody KnowledgeForm form) {
        return null;
    }
    
    @PostMapping(POST_KNOWLEDGE_PATH)
    @ResponseStatus(HttpStatus.CREATED)
    public KnowledgeForm createKnowledge(@Valid @RequestBody KnowledgeForm form) {
        return getCreateOperation().run(form);
    }
    
    @PutMapping(PUT_KNOWLEDGE_PATH)
    @ResponseStatus(HttpStatus.OK)
    public KnowledgeForm updateKnowledge(
                                @PathVariable(KNOWLEDGE_ID_VAR) Long id,
                                @Valid @RequestBody KnowledgeForm form
    ) {
        return null;
    }
}

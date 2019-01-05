/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.evolutionThroughCraft.knowledge.models;

import io.github.evolutionThroughCraft.common.service.main.api.Knowledge;
import io.github.evolutionThroughCraft.common.service.main.api.Trivia;
import io.github.evolutionThroughCraft.common.service.main.models.Stamps;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author dwin
 */
@Entity
@Table(name = "knowledges")
@Getter @Setter
@NoArgsConstructor
public class KnowledgeEntity extends Stamps<String> implements Knowledge {
    
    @Id @GeneratedValue(generator = "knowledge_generator")
    @SequenceGenerator(
            name = "knowledge_generator",
            sequenceName = "knowledge_sequence",
            initialValue = 1000
    )
    private Long knowledgeId;
    
    @NotBlank
    private Long triviaId;
    @NotBlank
    private Long accountId;
    
    ////  
    public KnowledgeEntity(KnowledgeForm form) {
        super();
        setKnowledgeId(form.getKnowledgeId());
        setAccountId(form.getAccountId());
        setTriviaId(form.getTriviaId());
        setCreateUser(form.getCreateUser());
        setCreateTime(form.getCreateTime());
        setUpdateUser(form.getUpdateUser());
        setUpdateTime(form.getUpdateTime());
    }
}

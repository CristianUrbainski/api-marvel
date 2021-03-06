package br.com.urbainski.api.marvel.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import br.com.urbainski.api.marvel.domain.Characters;
import br.com.urbainski.api.marvel.domain.Stories;

@Repository
public interface IStoriesRepository extends IDefaultRepository<Stories, Long> {

    Page<Stories> findByCharacters(Characters characters, Pageable pageable);

}
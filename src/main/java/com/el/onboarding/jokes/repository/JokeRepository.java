package com.el.onboarding.jokes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.el.onboarding.jokes.entity.Joke;

public interface JokeRepository extends JpaRepository<Joke, Integer> {

}

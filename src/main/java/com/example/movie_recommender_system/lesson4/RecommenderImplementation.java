package com.example.movie_recommender_system.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    @Qualifier("CF")
    private Filter contentBasedFilter;

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + contentBasedFilter + "\n");
        String[] results = contentBasedFilter.getRecommendations("Finding Dory");
        return results;
    }
}
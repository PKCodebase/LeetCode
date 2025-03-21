package com.leetcode;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;


public class FindAllPossibleRecipes {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, List<String>> graph = new HashMap<>(); // Adjacency list
        Map<String, Integer> inDegree = new HashMap<>(); // In-degree count

        Set<String> available = new HashSet<>(Arrays.asList(supplies)); // Initial available supplies

        // Initialize in-degree and graph for each recipe
        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            inDegree.put(recipe, ingredients.get(i).size()); // Set in-degree as number of required ingredients

            for (String ingredient : ingredients.get(i)) {
                graph.computeIfAbsent(ingredient, k -> new ArrayList<>()).add(recipe);
            }
        }

        // BFS using Queue (start with available supplies)
        Queue<String> queue = new LinkedList<>(available);
        List<String> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            String current = queue.poll();

            // If current is a recipe and its in-degree is 0, it can be prepared
            if (inDegree.containsKey(current) && inDegree.get(current) == 0) {
                result.add(current);
            }

            // Reduce in-degree of recipes that depend on this ingredient
            if (graph.containsKey(current)) {
                for (String dependentRecipe : graph.get(current)) {
                    inDegree.put(dependentRecipe, inDegree.get(dependentRecipe) - 1);
                    if (inDegree.get(dependentRecipe) == 0) {
                        queue.offer(dependentRecipe);
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String[] recipes = {"bread"};
        List<List<String>> ingredients = Arrays.asList(Arrays.asList("yeast", "flour"));
        String[] supplies = {"yeast", "flour", "corn"};
        FindAllPossibleRecipes findAllPossibleRecipes = new FindAllPossibleRecipes();
        List<String> result = findAllPossibleRecipes.findAllRecipes(recipes, ingredients, supplies);
        System.out.println(result);
    }

}

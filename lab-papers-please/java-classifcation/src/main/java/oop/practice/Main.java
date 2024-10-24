package oop.practice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    File inputFile = new File("lab-papers-please/java-classifcation/src/main/resources/input.json");
    JsonNode data = mapper.readTree(inputFile).get("data");

    Universe starWars = new Universe("starWars", new ArrayList<>());
    Universe hitchhikers = new Universe("hitchHiker", new ArrayList<>());
    Universe marvel = new Universe("marvel", new ArrayList<>());
    Universe rings = new Universe("rings", new ArrayList<>());

    List<Individual> individualsList = mapper.readValue(data.toString(), new TypeReference<>() {
    });

    for (Individual individual : individualsList) {

      switch (Classification.getClassification(individual)) {
        case 1:
          starWars.individuals().add(individual);
          break;
        case 2:
          marvel.individuals().add(individual);
          break;
        case 3:
          hitchhikers.individuals().add(individual);
          break;
        case 4:
          rings.individuals().add(individual);
          break;
        default:
          System.out.println("Something went wrong for id: " + individual.getId());
      }
    }


    mapper.writeValue(new File("/Users/cristianbulat/IdeaProjects/oop-laboratory1/lab-papers-please/java-classifcation/src/main/resources/output/starwars.json"), starWars);
    mapper.writeValue(new File("/Users/cristianbulat/IdeaProjects/oop-laboratory1/lab-papers-please/java-classifcation/src/main/resources/output/hitchhiker.json"), hitchhikers);
    mapper.writeValue(new File("/Users/cristianbulat/IdeaProjects/oop-laboratory1/lab-papers-please/java-classifcation/src/main/resources/output/rings.json"), rings);
    mapper.writeValue(new File("/Users/cristianbulat/IdeaProjects/oop-laboratory1/lab-papers-please/java-classifcation/src/main/resources/output/marvel.json"), marvel);

    System.out.println("\n");
    ViewOutput.showStarWars();
    System.out.println("\n");
    ViewOutput.showHitchhiker();
    System.out.println("\n");
    ViewOutput.showMarvel();
    System.out.println("\n");
    ViewOutput.showRings();
  }
}

record Universe(
        String name,
        List<Individual> individuals
) { }
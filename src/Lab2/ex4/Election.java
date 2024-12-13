package Lab2.ex4;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Election {
    private final LocalDate dateOfElection;
    private final Map<Candidacy, Integer> results;

    public Election(LocalDate dateOfElection) {
        this.dateOfElection = dateOfElection;
        this.results = new HashMap<>();
    }

    public void addResult(Candidacy candidacy, int votes) {
        if (!this.results.containsKey(candidacy)) {

            this.results.put(candidacy, votes);
        } else {

            this.results.put(candidacy,
                    this.results.get(candidacy) + votes);
        }
    }

    public void printOrderedByCandidacy() {
        for (Candidacy candidacy :
                this.results
                        .keySet()
                        .stream()
                        .sorted(Comparator.comparingDouble(Candidacy::getCandidacyId))
                        .toList()) {
            System.out.println(candidacy + " -> " + this.results.get(candidacy));
        }
    }

    public void printOrderedByVotes() {

        this.results
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Candidacy, Integer>comparingByValue().reversed())
                .forEach(a -> System.out.printf("%s -> %d%n", a.getKey(), a.getValue()));
    }

    public int getVotesByPerson(Person person) {

        for (Candidacy candidacy :
                this.results.keySet()) {
            if (candidacy.getCandidatePresident() == person) {
                return this.results.get(candidacy);
            }
        }
        return 0;
    }

    public Set<Candidacy> getUnsupportedCandidacies(){
        return this.results
                .keySet()
                .stream()
                .filter(a -> a.getParty() == Party.NONE)
                .collect(Collectors.toSet());
    }

    public void calculateElectionResults(){
        Candidacy winners = this.results
                .entrySet()
                .stream().max(Map.Entry.<Candidacy, Integer>comparingByValue())
                .get().getKey();

        if(winners != null){

            int sum = this.results
                    .values()
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum() - this.results.get(winners);

            if(this.results.get(winners) / sum * 100 > 50){
                System.out.printf("Winners : %s%n", winners);
            } else {
                System.out.println("Next time!");
            }
        }
    }
}
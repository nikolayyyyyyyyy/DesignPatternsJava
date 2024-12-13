package Lab2.ex4;

import java.util.Objects;

public class Candidacy {
    private final int candidacyId;
    private final Person candidatePresident;
    private final Person candidateVicePresident;
    private final Party party;

    public Candidacy(int candidacyId, Person candidatePresident, Person candidateVicePresident, Party party) {
        this.candidacyId = candidacyId;
        this.candidatePresident = candidatePresident;
        this.candidateVicePresident = candidateVicePresident;
        this.party = party;
    }

    public int getCandidacyId() {
        return candidacyId;
    }

    public Person getCandidatePresident() {
        return candidatePresident;
    }

    public Person getCandidateVicePresident() {
        return candidateVicePresident;
    }

    public Party getParty() {
        return party;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidacy candidacy = (Candidacy) o;
        return candidacyId == candidacy.candidacyId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(candidacyId);
    }

    @Override
    public String toString() {
        return "Candidacy: " +
                "candidacyId=" + candidacyId +
                ", candidatePresident=" + candidatePresident +
                ", candidateVicePresident=" + candidateVicePresident +
                ", party=" + party;
    }
}

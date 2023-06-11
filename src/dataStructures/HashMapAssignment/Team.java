package dataStructures.HashMapAssignment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Builder
@AllArgsConstructor
@Data
    public class Team {
    @Override
    public String toString() {
        return "Team{" +
                "projectName='" + projectName + '\'' +
                ", features='" + features + '\'' +
                ", stackholders='" + stackholders + '\'' +
                ", budget=" + budget +
                ", deadline=" + deadline +
                '}';
    }

    String projectName;
    String features;
    String stackholders;
    double budget;
    Date deadline;

}

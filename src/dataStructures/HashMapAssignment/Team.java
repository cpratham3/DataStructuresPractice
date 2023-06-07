package dataStructures.HashMapAssignment;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.Date;
@Builder
@AllArgsConstructor
    public class Team {
    String projectName;
    String features;
    String stackholders;
    double budget;
    Date deadline;

}

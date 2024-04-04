package org.example.testreactive.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Course {

    double datetime;
    double open;
    double high;
    double low;
    double clos;
    long volume;
}

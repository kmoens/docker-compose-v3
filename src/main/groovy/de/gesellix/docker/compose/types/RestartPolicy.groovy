package de.gesellix.docker.compose.types

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
@ToString
class RestartPolicy {

    String condition

//    Duration Delay
    String delay

    // `mapstructure:"max_attempts"`
    int maxAttempts

//    Duration Window
    String window
}

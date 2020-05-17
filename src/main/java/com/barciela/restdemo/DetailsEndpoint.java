package com.barciela.restdemo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * A skeleton custom actuator endpoint for demo purposes.
 */
@Component
@Endpoint(id = "details")
public class DetailsEndpoint {

    /**
     * @return Custom information about the application at run time.
     */
    @ReadOperation
    public String details() {
        return "My App Details";
    }
}
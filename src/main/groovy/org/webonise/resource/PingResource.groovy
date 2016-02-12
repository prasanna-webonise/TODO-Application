package org.webonise.resource

import groovy.transform.Canonical
import groovy.util.logging.Slf4j
import org.restlet.resource.Get
import org.restlet.resource.ServerResource

@Slf4j
class PingResource extends ServerResource {
    @Get
    Pong getPing() {
        return new Pong(true, "Prasanna", "Patil", 23)
    }

    @Canonical
    class Pong {
        Boolean pong;
        String name;
        String surname;
        Integer age;
    }
}

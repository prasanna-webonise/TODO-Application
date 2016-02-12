package org.webonise.resource

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.restlet.resource.Get
import org.restlet.resource.ServerResource

@Slf4j
@CompileStatic
class PingPongResource extends ServerResource {
    @Get
    String SendPingResponse() {
        return "Pong"
    }
}

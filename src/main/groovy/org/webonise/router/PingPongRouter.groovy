package org.webonise.router

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.webonise.resource.PingPongResource
import restling.restlet.RestlingRouter

@Slf4j
@CompileStatic
class PingPongRouter extends RestlingRouter{
    @Override
    void init() throws Exception {
        attach("/ping", PingPongResource)
    }
}

package org.webonise.router

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import restling.restlet.RestlingRouter

@Slf4j
@CompileStatic
class RootRouter extends RestlingRouter {

    @Override
    void init() throws Exception {
        attachSubRouter("/pingpong", PingPongRouter)
    }
}

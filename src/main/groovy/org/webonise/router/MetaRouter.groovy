package org.webonise.router

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.webonise.resource.PingResource
import restling.restlet.RestlingRouter

@Slf4j
@CompileStatic
class MetaRouter extends RestlingRouter {
    @Override
    void init() throws Exception {
        attach("/ping", PingResource)
    }
}

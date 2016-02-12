package org.webonise.resource

import spock.lang.Specification

class PingPongResourceTest extends Specification {
    def "when PingPongResource get method is called"() {
        setup:
        PingResource pingPongResource = new PingResource()
        pingPongResource.ping
        when:
        def result = pingPongResource.getPing()
        then:
        result.equals(pingPongResource.ping)
    }
}

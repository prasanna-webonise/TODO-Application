package org.webonise.resource

import spock.lang.Specification

class PingPongResourceTest extends Specification {
    def "when PingPongResource get method is called"() {
        setup:
        PingPongResource pingPongResource = new PingPongResource()
        when:
        def result = pingPongResource.SendPingResponse()
        then:
        result.equalsIgnoreCase("pong")
    }
}

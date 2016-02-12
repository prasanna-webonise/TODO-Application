package org.webonise

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.webonise.router.RootRouter
import restling.guice.modules.RestlingApplicationModule

@Slf4j
@CompileStatic
class ApplicationModule extends RestlingApplicationModule {

    @Override
    void configureCustomBindings() {

    }

    Class<RootRouter> routerClass = RootRouter
}

package helloworld

//import org.apache.commons.logging.LogFactory

class HelloController {
//    private static final log = LogFactory.getLog(this)

    def index() {
    log.info "!!!!!!!!!! -> HELLO"
        render "Hello World!"
    }
}

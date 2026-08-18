import com.sap.it.api.ITApiFactory

def processData(message) {

    def msgLogClass = Class.forName("com.sap.it.api.logging.MessageLog")
    def log = ITApiFactory.getApi(msgLogClass, message)

    if (log) {
        log.addCustomHeaderProperty("TEST_INFO", "Groovy script executed")
    }

    return message
}
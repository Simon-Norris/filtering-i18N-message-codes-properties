import com.ig.demoApp.ExtendedPluginAwareResourceBundleMessageSource

// Place your Spring DSL code here
beans = {
    messageSource(ExtendedPluginAwareResourceBundleMessageSource)  {
        basenames = "WEB-INF/grails-app/i18n/messages"
    }
}

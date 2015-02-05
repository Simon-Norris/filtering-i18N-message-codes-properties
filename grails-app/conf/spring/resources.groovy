import com.ig.demoApp.CustomisedPluginAwareResourceBundleMessageSource

// Place your Spring DSL code here
beans = {
    messageSource(CustomisedPluginAwareResourceBundleMessageSource)  {
        basenames = "WEB-INF/grails-app/i18n/messages"
    }
}

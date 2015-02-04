package com.ig.demoApp

/**
 * Created by nehagupta on 4/2/15.
 */
import org.codehaus.groovy.grails.context.support.PluginAwareResourceBundleMessageSource

class ExtendedPluginAwareResourceBundleMessageSource extends PluginAwareResourceBundleMessageSource {
    List listMessageCodes(Locale locale, String lookupMessageCode) {
        Properties properties = getMergedProperties(locale).properties
        List listOfCodes = []
        properties.each {
            if (it.key.toString().matches(/^[\w.]*${lookupMessageCode}[.\w]*$/))
                listOfCodes.add(it.key)
        }
        return listOfCodes
    }
}
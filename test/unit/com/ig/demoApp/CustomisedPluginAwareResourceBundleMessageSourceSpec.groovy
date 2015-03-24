package com.ig.demoApp

import spock.lang.Specification
import spock.util.mop.ConfineMetaClassChanges

@ConfineMetaClassChanges(CustomisedPluginAwareResourceBundleMessageSource)
class CustomisedPluginAwareResourceBundleMessageSourceSpec extends Specification {
    CustomisedPluginAwareResourceBundleMessageSource messageSource

    void setup() {
        messageSource = new CustomisedPluginAwareResourceBundleMessageSource()
    }

    void "canary test"() {
        expect:
        true
    }

    void "test listMessageCodes"() {
        setup:
        Locale locale = new Locale('en', 'US')
        String lookupMessageCode = 'black'
        messageSource.metaClass.getMergedProperties = { final Locale tempLocale ->
            Properties properties = new Properties()
            properties.setProperty('square.black.label', 'Black Square')
            properties.setProperty('circle.violet.label', 'Violet Circle')
            properties.setProperty('fruit.black.label', 'Black Grape')

            CustomProperties customProperties = new CustomProperties()
            customProperties.properties = properties
            return customProperties
        }

        when:
        List list = messageSource.listMessageCodes(locale, lookupMessageCode)

        then:
        list.get(0).toString().contains('black')
    }
}

class CustomProperties {
    Properties properties
}
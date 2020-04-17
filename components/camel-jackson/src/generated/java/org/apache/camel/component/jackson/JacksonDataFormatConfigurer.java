/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jackson;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JacksonDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        JacksonDataFormat dataformat = (JacksonDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "objectmapper":
        case "objectMapper": dataformat.setObjectMapper(property(camelContext, com.fasterxml.jackson.databind.ObjectMapper.class, value)); return true;
        case "usedefaultobjectmapper":
        case "useDefaultObjectMapper": dataformat.setUseDefaultObjectMapper(property(camelContext, boolean.class, value)); return true;
        case "collectiontypename":
        case "collectionTypeName": dataformat.setCollectionTypeName(property(camelContext, java.lang.String.class, value)); return true;
        case "moduleclassnames":
        case "moduleClassNames": dataformat.setModuleClassNames(property(camelContext, java.lang.String.class, value)); return true;
        case "modulerefs":
        case "moduleRefs": dataformat.setModuleRefs(property(camelContext, java.lang.String.class, value)); return true;
        case "unmarshaltypename":
        case "unmarshalTypeName": dataformat.setUnmarshalTypeName(property(camelContext, java.lang.String.class, value)); return true;
        case "jsonview":
        case "jsonView": dataformat.setJsonView(property(camelContext, java.lang.Class.class, value)); return true;
        case "include": dataformat.setInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "prettyprint":
        case "prettyPrint": dataformat.setPrettyPrint(property(camelContext, boolean.class, value)); return true;
        case "allowjmstype":
        case "allowJmsType": dataformat.setAllowJmsType(property(camelContext, boolean.class, value)); return true;
        case "uselist":
        case "useList": dataformat.setUseList(property(camelContext, boolean.class, value)); return true;
        case "enablefeatures":
        case "enableFeatures": dataformat.setEnableFeatures(property(camelContext, java.lang.String.class, value)); return true;
        case "disablefeatures":
        case "disableFeatures": dataformat.setDisableFeatures(property(camelContext, java.lang.String.class, value)); return true;
        case "allowunmarshalltype":
        case "allowUnmarshallType": dataformat.setAllowUnmarshallType(property(camelContext, boolean.class, value)); return true;
        case "contenttypeheader":
        case "contentTypeHeader": dataformat.setContentTypeHeader(property(camelContext, boolean.class, value)); return true;
        case "timezone": dataformat.setTimezone(property(camelContext, java.util.TimeZone.class, value)); return true;
        case "autodiscoverobjectmapper":
        case "autoDiscoverObjectMapper": dataformat.setAutoDiscoverObjectMapper(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}


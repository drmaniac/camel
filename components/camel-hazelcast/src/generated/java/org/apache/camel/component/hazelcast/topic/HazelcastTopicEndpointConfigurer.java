/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hazelcast.topic;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HazelcastTopicEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        HazelcastTopicEndpoint target = (HazelcastTopicEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "defaultoperation":
        case "defaultOperation": target.setDefaultOperation(property(camelContext, org.apache.camel.component.hazelcast.HazelcastOperation.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "hazelcastconfiguri":
        case "hazelcastConfigUri": target.setHazelcastConfigUri(property(camelContext, java.lang.String.class, value)); return true;
        case "hazelcastinstance":
        case "hazelcastInstance": target.setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastinstancename":
        case "hazelcastInstanceName": target.setHazelcastInstanceName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "reliable": target.getConfiguration().setReliable(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "defaultoperation":
        case "defaultOperation": return org.apache.camel.component.hazelcast.HazelcastOperation.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "hazelcastconfiguri":
        case "hazelcastConfigUri": return java.lang.String.class;
        case "hazelcastinstance":
        case "hazelcastInstance": return com.hazelcast.core.HazelcastInstance.class;
        case "hazelcastinstancename":
        case "hazelcastInstanceName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "reliable": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        HazelcastTopicEndpoint target = (HazelcastTopicEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "defaultoperation":
        case "defaultOperation": return target.getDefaultOperation();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "hazelcastconfiguri":
        case "hazelcastConfigUri": return target.getHazelcastConfigUri();
        case "hazelcastinstance":
        case "hazelcastInstance": return target.getHazelcastInstance();
        case "hazelcastinstancename":
        case "hazelcastInstanceName": return target.getHazelcastInstanceName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "reliable": return target.getConfiguration().isReliable();
        default: return null;
        }
    }
}


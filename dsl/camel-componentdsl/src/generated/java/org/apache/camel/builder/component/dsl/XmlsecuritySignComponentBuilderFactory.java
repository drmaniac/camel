/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.xmlsecurity.XmlSignerComponent;

/**
 * Sign XML payloads using the XML signature specification.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface XmlsecuritySignComponentBuilderFactory {

    /**
     * XML Security Sign (camel-xmlsecurity)
     * Sign XML payloads using the XML signature specification.
     * 
     * Category: security,transformation
     * Since: 2.12
     * Maven coordinates: org.apache.camel:camel-xmlsecurity
     * 
     * @return the dsl builder
     */
    static XmlsecuritySignComponentBuilder xmlsecuritySign() {
        return new XmlsecuritySignComponentBuilderImpl();
    }

    /**
     * Builder for the XML Security Sign component.
     */
    interface XmlsecuritySignComponentBuilder
            extends
                ComponentBuilder<XmlSignerComponent> {
        /**
         * In order to protect the KeyInfo element from tampering you can add a
         * reference to the signed info element so that it is protected via the
         * signature value. The default value is true. Only relevant when a
         * KeyInfo is returned by KeyAccessor. and KeyInfo#getId() is not null.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param addKeyInfoReference the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder addKeyInfoReference(
                java.lang.Boolean addKeyInfoReference) {
            doSetProperty("addKeyInfoReference", addKeyInfoReference);
            return this;
        }
        /**
         * You can set a base URI which is used in the URI dereferencing.
         * Relative URIs are then concatenated with the base URI.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param baseUri the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder baseUri(java.lang.String baseUri) {
            doSetProperty("baseUri", baseUri);
            return this;
        }
        /**
         * Canonicalization method used to canonicalize the SignedInfo element
         * before the digest is calculated. You can use the helper methods
         * XmlSignatureHelper.getCanonicalizationMethod(String algorithm) or
         * getCanonicalizationMethod(String algorithm, List
         * inclusiveNamespacePrefixes) to create a canonicalization method.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.crypto.AlgorithmMethod&lt;/code&gt; type.
         * 
         * Default: http://www.w3.org/TR/2001/REC-xml-c14n-20010315
         * Group: producer
         * 
         * @param canonicalizationMethod the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder canonicalizationMethod(
                javax.xml.crypto.AlgorithmMethod canonicalizationMethod) {
            doSetProperty("canonicalizationMethod", canonicalizationMethod);
            return this;
        }
        /**
         * Determines if the XML signature specific headers be cleared after
         * signing and verification. Defaults to true.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param clearHeaders the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder clearHeaders(
                java.lang.Boolean clearHeaders) {
            doSetProperty("clearHeaders", clearHeaders);
            return this;
        }
        /**
         * Sets the content object Id attribute value. By default a UUID is
         * generated. If you set the null value, then a new UUID will be
         * generated. Only used in the enveloping case.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param contentObjectId the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder contentObjectId(
                java.lang.String contentObjectId) {
            doSetProperty("contentObjectId", contentObjectId);
            return this;
        }
        /**
         * Type of the content reference. The default value is null. This value
         * can be overwritten by the header
         * XmlSignatureConstants#HEADER_CONTENT_REFERENCE_TYPE.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param contentReferenceType the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder contentReferenceType(
                java.lang.String contentReferenceType) {
            doSetProperty("contentReferenceType", contentReferenceType);
            return this;
        }
        /**
         * Reference URI for the content to be signed. Only used in the
         * enveloped case. If the reference URI contains an ID attribute value,
         * then the resource schema URI ( setSchemaResourceUri(String)) must
         * also be set because the schema validator will then find out which
         * attributes are ID attributes. Will be ignored in the enveloping or
         * detached case.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param contentReferenceUri the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder contentReferenceUri(
                java.lang.String contentReferenceUri) {
            doSetProperty("contentReferenceUri", contentReferenceUri);
            return this;
        }
        /**
         * Sets the crypto context properties. See {link
         * XMLCryptoContext#setProperty(String, Object)}. Possible properties
         * are defined in XMLSignContext an XMLValidateContext (see Supported
         * Properties). The following properties are set by default to the value
         * Boolean#TRUE for the XML validation. If you want to switch these
         * features off you must set the property value to Boolean#FALSE.
         * org.jcp.xml.dsig.validateManifests
         * javax.xml.crypto.dsig.cacheReference.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param cryptoContextProperties the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder cryptoContextProperties(
                java.util.Map<java.lang.String, java.lang.Object> cryptoContextProperties) {
            doSetProperty("cryptoContextProperties", cryptoContextProperties);
            return this;
        }
        /**
         * Digest algorithm URI. Optional parameter. This digest algorithm is
         * used for calculating the digest of the input message. If this digest
         * algorithm is not specified then the digest algorithm is calculated
         * from the signature algorithm. Example:
         * http://www.w3.org/2001/04/xmlenc#sha256.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param digestAlgorithm the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder digestAlgorithm(
                java.lang.String digestAlgorithm) {
            doSetProperty("digestAlgorithm", digestAlgorithm);
            return this;
        }
        /**
         * Disallows that the incoming XML document contains DTD DOCTYPE
         * declaration. The default value is Boolean#TRUE.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param disallowDoctypeDecl the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder disallowDoctypeDecl(
                java.lang.Boolean disallowDoctypeDecl) {
            doSetProperty("disallowDoctypeDecl", disallowDoctypeDecl);
            return this;
        }
        /**
         * For the signing process, a private key is necessary. You specify a
         * key accessor bean which provides this private key. The key accessor
         * bean must implement the KeyAccessor interface. The package
         * org.apache.camel.component.xmlsecurity.api contains the default
         * implementation class DefaultKeyAccessor which reads the private key
         * from a Java keystore.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xmlsecurity.api.KeyAccessor&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keyAccessor the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder keyAccessor(
                org.apache.camel.component.xmlsecurity.api.KeyAccessor keyAccessor) {
            doSetProperty("keyAccessor", keyAccessor);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Indicator whether the XML declaration in the outgoing message body
         * should be omitted. Default value is false. Can be overwritten by the
         * header XmlSignatureConstants#HEADER_OMIT_XML_DECLARATION.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param omitXmlDeclaration the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder omitXmlDeclaration(
                java.lang.Boolean omitXmlDeclaration) {
            doSetProperty("omitXmlDeclaration", omitXmlDeclaration);
            return this;
        }
        /**
         * The character encoding of the resulting signed XML document. If null
         * then the encoding of the original XML document is used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param outputXmlEncoding the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder outputXmlEncoding(
                java.lang.String outputXmlEncoding) {
            doSetProperty("outputXmlEncoding", outputXmlEncoding);
            return this;
        }
        /**
         * Local name of the parent element to which the XML signature element
         * will be added. Only relevant for enveloped XML signature.
         * Alternatively you can also use
         * setParentXpath(XPathFilterParameterSpec). Default value is null. The
         * value must be null for enveloping and detached XML signature. This
         * parameter or the parameter setParentXpath(XPathFilterParameterSpec)
         * for enveloped signature and the parameter
         * setXpathsToIdAttributes(List) for detached signature must not be set
         * in the same configuration. If the parameters parentXpath and
         * parentLocalName are specified in the same configuration then an
         * exception is thrown.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param parentLocalName the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder parentLocalName(
                java.lang.String parentLocalName) {
            doSetProperty("parentLocalName", parentLocalName);
            return this;
        }
        /**
         * Namespace of the parent element to which the XML signature element
         * will be added.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param parentNamespace the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder parentNamespace(
                java.lang.String parentNamespace) {
            doSetProperty("parentNamespace", parentNamespace);
            return this;
        }
        /**
         * Sets the XPath to find the parent node in the enveloped case. Either
         * you specify the parent node via this method or the local name and
         * namespace of the parent with the methods setParentLocalName(String)
         * and setParentNamespace(String). Default value is null. The value must
         * be null for enveloping and detached XML signature. If the parameters
         * parentXpath and parentLocalName are specified in the same
         * configuration then an exception is thrown.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.crypto.dsig.spec.XPathFilterParameterSpec&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param parentXpath the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder parentXpath(
                javax.xml.crypto.dsig.spec.XPathFilterParameterSpec parentXpath) {
            doSetProperty("parentXpath", parentXpath);
            return this;
        }
        /**
         * Indicator whether the message body contains plain text. The default
         * value is false, indicating that the message body contains XML. The
         * value can be overwritten by the header
         * XmlSignatureConstants#HEADER_MESSAGE_IS_PLAIN_TEXT.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param plainText the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder plainText(
                java.lang.Boolean plainText) {
            doSetProperty("plainText", plainText);
            return this;
        }
        /**
         * Encoding of the plain text. Only relevant if the message body is
         * plain text (see parameter plainText. Default value is UTF-8.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: UTF-8
         * Group: producer
         * 
         * @param plainTextEncoding the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder plainTextEncoding(
                java.lang.String plainTextEncoding) {
            doSetProperty("plainTextEncoding", plainTextEncoding);
            return this;
        }
        /**
         * Namespace prefix for the XML signature namespace
         * http://www.w3.org/2000/09/xmldsig#. Default value is ds. If null or
         * an empty value is set then no prefix is used for the XML signature
         * namespace. See best practice
         * http://www.w3.org/TR/xmldsig-bestpractices/#signing-xml-
         * without-namespaces.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: ds
         * Group: producer
         * 
         * @param prefixForXmlSignatureNamespace the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder prefixForXmlSignatureNamespace(
                java.lang.String prefixForXmlSignatureNamespace) {
            doSetProperty("prefixForXmlSignatureNamespace", prefixForXmlSignatureNamespace);
            return this;
        }
        /**
         * For adding additional References and Objects to the XML signature
         * which contain additional properties, you can provide a bean which
         * implements the XmlSignatureProperties interface.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param properties the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder properties(
                org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties properties) {
            doSetProperty("properties", properties);
            return this;
        }
        /**
         * Classpath to the XML Schema. Must be specified in the detached XML
         * Signature case for determining the ID attributes, might be set in the
         * enveloped and enveloping case. If set, then the XML document is
         * validated with the specified XML schema. The schema resource URI can
         * be overwritten by the header
         * XmlSignatureConstants#HEADER_SCHEMA_RESOURCE_URI.
         * 
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param schemaResourceUri the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder schemaResourceUri(
                java.lang.String schemaResourceUri) {
            doSetProperty("schemaResourceUri", schemaResourceUri);
            return this;
        }
        /**
         * Signature algorithm. Default value is
         * http://www.w3.org/2000/09/xmldsig#rsa-sha1.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: http://www.w3.org/2001/04/xmldsig-more#rsa-sha256
         * Group: producer
         * 
         * @param signatureAlgorithm the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder signatureAlgorithm(
                java.lang.String signatureAlgorithm) {
            doSetProperty("signatureAlgorithm", signatureAlgorithm);
            return this;
        }
        /**
         * Sets the signature Id. If this parameter is not set (null value) then
         * a unique ID is generated for the signature ID (default). If this
         * parameter is set to (empty string) then no Id attribute is created in
         * the signature element.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param signatureId the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder signatureId(
                java.lang.String signatureId) {
            doSetProperty("signatureId", signatureId);
            return this;
        }
        /**
         * Transforms which are executed on the message body before the digest
         * is calculated. By default, C14n is added and in the case of enveloped
         * signature (see option parentLocalName) also
         * http://www.w3.org/2000/09/xmldsig#enveloped-signature is added at
         * position 0 of the list. Use methods in XmlSignatureHelper to create
         * the transform methods.
         * 
         * The option is a:
         * &lt;code&gt;java.util.List&amp;lt;javax.xml.crypto.AlgorithmMethod&amp;gt;&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param transformMethods the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder transformMethods(
                java.util.List<javax.xml.crypto.AlgorithmMethod> transformMethods) {
            doSetProperty("transformMethods", transformMethods);
            return this;
        }
        /**
         * Define the elements which are signed in the detached case via XPATH
         * expressions to ID attributes (attributes of type ID). For each
         * element found via the XPATH expression a detached signature is
         * created whose reference URI contains the corresponding attribute
         * value (preceded by '#'). The signature becomes the last sibling of
         * the signed element. Elements with deeper hierarchy level are signed
         * first. You can also set the XPATH list dynamically via the header
         * XmlSignatureConstants#HEADER_XPATHS_TO_ID_ATTRIBUTES. The parameter
         * setParentLocalName(String) or
         * setParentXpath(XPathFilterParameterSpec) for enveloped signature and
         * this parameter for detached signature must not be set in the same
         * configuration.
         * 
         * The option is a:
         * &lt;code&gt;java.util.List&amp;lt;javax.xml.crypto.dsig.spec.XPathFilterParameterSpec&amp;gt;&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param xpathsToIdAttributes the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder xpathsToIdAttributes(
                java.util.List<javax.xml.crypto.dsig.spec.XPathFilterParameterSpec> xpathsToIdAttributes) {
            doSetProperty("xpathsToIdAttributes", xpathsToIdAttributes);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use a shared XmlSignerConfiguration configuration to use as base
         * for configuring endpoints.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param signerConfiguration the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder signerConfiguration(
                org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration signerConfiguration) {
            doSetProperty("signerConfiguration", signerConfiguration);
            return this;
        }
        /**
         * If you want to restrict the remote access via reference URIs, you can
         * set an own dereferencer. Optional parameter. If not set the provider
         * default dereferencer is used which can resolve URI fragments, HTTP,
         * file and XPpointer URIs. Attention: The implementation is provider
         * dependent!.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.crypto.URIDereferencer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uriDereferencer the value to set
         * @return the dsl builder
         */
        default XmlsecuritySignComponentBuilder uriDereferencer(
                javax.xml.crypto.URIDereferencer uriDereferencer) {
            doSetProperty("uriDereferencer", uriDereferencer);
            return this;
        }
    }

    class XmlsecuritySignComponentBuilderImpl
            extends
                AbstractComponentBuilder<XmlSignerComponent>
            implements
                XmlsecuritySignComponentBuilder {
        @Override
        protected XmlSignerComponent buildConcreteComponent() {
            return new XmlSignerComponent();
        }
        private org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration getOrCreateConfiguration(
                org.apache.camel.component.xmlsecurity.XmlSignerComponent component) {
            if (component.getSignerConfiguration() == null) {
                component.setSignerConfiguration(new org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration());
            }
            return component.getSignerConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "addKeyInfoReference": getOrCreateConfiguration((XmlSignerComponent) component).setAddKeyInfoReference((java.lang.Boolean) value); return true;
            case "baseUri": getOrCreateConfiguration((XmlSignerComponent) component).setBaseUri((java.lang.String) value); return true;
            case "canonicalizationMethod": getOrCreateConfiguration((XmlSignerComponent) component).setCanonicalizationMethod((javax.xml.crypto.AlgorithmMethod) value); return true;
            case "clearHeaders": getOrCreateConfiguration((XmlSignerComponent) component).setClearHeaders((java.lang.Boolean) value); return true;
            case "contentObjectId": getOrCreateConfiguration((XmlSignerComponent) component).setContentObjectId((java.lang.String) value); return true;
            case "contentReferenceType": getOrCreateConfiguration((XmlSignerComponent) component).setContentReferenceType((java.lang.String) value); return true;
            case "contentReferenceUri": getOrCreateConfiguration((XmlSignerComponent) component).setContentReferenceUri((java.lang.String) value); return true;
            case "cryptoContextProperties": getOrCreateConfiguration((XmlSignerComponent) component).setCryptoContextProperties((java.util.Map) value); return true;
            case "digestAlgorithm": getOrCreateConfiguration((XmlSignerComponent) component).setDigestAlgorithm((java.lang.String) value); return true;
            case "disallowDoctypeDecl": getOrCreateConfiguration((XmlSignerComponent) component).setDisallowDoctypeDecl((java.lang.Boolean) value); return true;
            case "keyAccessor": getOrCreateConfiguration((XmlSignerComponent) component).setKeyAccessor((org.apache.camel.component.xmlsecurity.api.KeyAccessor) value); return true;
            case "lazyStartProducer": ((XmlSignerComponent) component).setLazyStartProducer((boolean) value); return true;
            case "omitXmlDeclaration": getOrCreateConfiguration((XmlSignerComponent) component).setOmitXmlDeclaration((java.lang.Boolean) value); return true;
            case "outputXmlEncoding": getOrCreateConfiguration((XmlSignerComponent) component).setOutputXmlEncoding((java.lang.String) value); return true;
            case "parentLocalName": getOrCreateConfiguration((XmlSignerComponent) component).setParentLocalName((java.lang.String) value); return true;
            case "parentNamespace": getOrCreateConfiguration((XmlSignerComponent) component).setParentNamespace((java.lang.String) value); return true;
            case "parentXpath": getOrCreateConfiguration((XmlSignerComponent) component).setParentXpath((javax.xml.crypto.dsig.spec.XPathFilterParameterSpec) value); return true;
            case "plainText": getOrCreateConfiguration((XmlSignerComponent) component).setPlainText((java.lang.Boolean) value); return true;
            case "plainTextEncoding": getOrCreateConfiguration((XmlSignerComponent) component).setPlainTextEncoding((java.lang.String) value); return true;
            case "prefixForXmlSignatureNamespace": getOrCreateConfiguration((XmlSignerComponent) component).setPrefixForXmlSignatureNamespace((java.lang.String) value); return true;
            case "properties": getOrCreateConfiguration((XmlSignerComponent) component).setProperties((org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties) value); return true;
            case "schemaResourceUri": getOrCreateConfiguration((XmlSignerComponent) component).setSchemaResourceUri((java.lang.String) value); return true;
            case "signatureAlgorithm": getOrCreateConfiguration((XmlSignerComponent) component).setSignatureAlgorithm((java.lang.String) value); return true;
            case "signatureId": getOrCreateConfiguration((XmlSignerComponent) component).setSignatureId((java.lang.String) value); return true;
            case "transformMethods": getOrCreateConfiguration((XmlSignerComponent) component).setTransformMethods((java.util.List) value); return true;
            case "xpathsToIdAttributes": getOrCreateConfiguration((XmlSignerComponent) component).setXpathsToIdAttributes((java.util.List) value); return true;
            case "autowiredEnabled": ((XmlSignerComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "signerConfiguration": ((XmlSignerComponent) component).setSignerConfiguration((org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration) value); return true;
            case "uriDereferencer": getOrCreateConfiguration((XmlSignerComponent) component).setUriDereferencer((javax.xml.crypto.URIDereferencer) value); return true;
            default: return false;
            }
        }
    }
}
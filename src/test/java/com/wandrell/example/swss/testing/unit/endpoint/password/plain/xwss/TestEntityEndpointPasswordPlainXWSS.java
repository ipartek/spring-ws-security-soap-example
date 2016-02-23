/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2015 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.wandrell.example.swss.testing.unit.endpoint.password.plain.xwss;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import com.wandrell.example.swss.testing.util.config.context.ServletContextConfig;
import com.wandrell.example.swss.testing.util.config.properties.EndpointXWSSPropertiesConfig;
import com.wandrell.example.swss.testing.util.config.properties.InterceptorXWSSPropertiesConfig;
import com.wandrell.example.swss.testing.util.config.properties.SOAPPropertiesConfig;
import com.wandrell.example.swss.testing.util.config.properties.TestPropertiesConfig;
import com.wandrell.example.swss.testing.util.test.unit.endpoint.AbstractTestEntityEndpointRequest;

/**
 * Implementation of {@code AbstractTestEntityEndpointRequest} for a plain
 * password protected endpoint.
 *
 * @author Bernardo Martínez Garrido
 */
@ContextConfiguration(locations = { ServletContextConfig.BASE,
        ServletContextConfig.PASSWORD_PLAIN_XWSS })
@TestPropertySource({ TestPropertiesConfig.WSDL, SOAPPropertiesConfig.UNSECURE,
        SOAPPropertiesConfig.PASSWORD_PLAIN,
        InterceptorXWSSPropertiesConfig.PASSWORD_PLAIN,
        EndpointXWSSPropertiesConfig.PASSWORD_PLAIN,
        EndpointXWSSPropertiesConfig.BASE })
public final class TestEntityEndpointPasswordPlainXWSS extends
        AbstractTestEntityEndpointRequest {

    /**
     * Constructs a {@code TestEntityEndpointPasswordPlainXWSS}.
     */
    public TestEntityEndpointPasswordPlainXWSS() {
        super();
    }

}

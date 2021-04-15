/*
 * Copyright 2016-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.mefscaapi;

import org.apache.felix.scr.annotations.Component;
import org.onosproject.rest.AbstractApiDocRegistrator;
import org.onosproject.rest.ApiDocProvider;

// Usually onos-maven-plugin generates swagger.json and generate equivalent.
// But this app is generated "from" swagger, so equivalent is not auto-generated
// by the plugin. Manually creating one.
@Component(immediate = true)
public class ApiDocRegistrator extends AbstractApiDocRegistrator {
    public ApiDocRegistrator() {
        // sync with pom.xml web.context
        super(new ApiDocProvider("/onos/mef-sca-api",
                                 "MEF SCA REST API",
                                 ApiDocRegistrator.class.getClassLoader()));
    }
}

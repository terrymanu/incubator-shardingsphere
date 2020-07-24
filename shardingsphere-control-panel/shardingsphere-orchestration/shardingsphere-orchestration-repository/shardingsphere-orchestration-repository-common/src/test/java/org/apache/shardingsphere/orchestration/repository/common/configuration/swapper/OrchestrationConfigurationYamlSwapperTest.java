/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.orchestration.repository.common.configuration.swapper;

import org.apache.shardingsphere.orchestration.repository.common.configuration.config.YamlOrchestrationRepositoryConfiguration;
import org.apache.shardingsphere.orchestration.repository.common.configuration.config.YamlOrchestrationConfiguration;
import org.apache.shardingsphere.orchestration.repository.api.config.CenterConfiguration;
import org.apache.shardingsphere.orchestration.repository.api.config.OrchestrationConfiguration;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public final class OrchestrationConfigurationYamlSwapperTest {
    
    private static final String LOGIC_SCHEMA = "logic_schema";
    
    @Test
    public void assertSwapToYamlOrchestrationConfiguration() {
        OrchestrationConfiguration data = getOrchestrationConfiguration();
        YamlOrchestrationConfiguration result = new OrchestrationConfigurationYamlSwapper().swapToYamlConfiguration(data);
        for (String each : result.getOrchestrationRepositoryConfigurationMap().keySet()) {
            assertNotNull(result.getOrchestrationRepositoryConfigurationMap().get(each));
            assertThat(result.getOrchestrationRepositoryConfigurationMap().get(each).getOrchestrationType(), is(data.getInstanceConfigurationMap().get(each).getOrchestrationType()));
            assertThat(result.getOrchestrationRepositoryConfigurationMap().get(each).getInstanceType(), is(data.getInstanceConfigurationMap().get(each).getType()));
            assertThat(result.getOrchestrationRepositoryConfigurationMap().get(each).getNamespace(), is(data.getInstanceConfigurationMap().get(each).getNamespace()));
            assertThat(result.getOrchestrationRepositoryConfigurationMap().get(each).getServerLists(), is(data.getInstanceConfigurationMap().get(each).getServerLists()));
            assertThat(result.getOrchestrationRepositoryConfigurationMap().get(each).getProps(), is(data.getInstanceConfigurationMap().get(each).getProps()));
        }
    }
    
    @Test
    public void assertSwapToOrchestrationConfiguration() {
        YamlOrchestrationConfiguration data = getYamlOrchestrationConfiguration();
        OrchestrationConfiguration result = new OrchestrationConfigurationYamlSwapper().swapToObject(data);
        for (String each : result.getInstanceConfigurationMap().keySet()) {
            assertNotNull(result.getInstanceConfigurationMap().get(each));
            assertThat(result.getInstanceConfigurationMap().get(each).getOrchestrationType(), is(data.getOrchestrationRepositoryConfigurationMap().get(each).getOrchestrationType()));
            assertThat(result.getInstanceConfigurationMap().get(each).getType(), is(data.getOrchestrationRepositoryConfigurationMap().get(each).getInstanceType()));
            assertThat(result.getInstanceConfigurationMap().get(each).getNamespace(), is(data.getOrchestrationRepositoryConfigurationMap().get(each).getNamespace()));
            assertThat(result.getInstanceConfigurationMap().get(each).getServerLists(), is(data.getOrchestrationRepositoryConfigurationMap().get(each).getServerLists()));
            assertThat(result.getInstanceConfigurationMap().get(each).getProps(), is(data.getOrchestrationRepositoryConfigurationMap().get(each).getProps()));
        }
    }
    
    private OrchestrationConfiguration getOrchestrationConfiguration() {
        CenterConfiguration instanceConfiguration = new CenterConfiguration("zookeeper", new Properties());
        instanceConfiguration.setOrchestrationType("config_center");
        instanceConfiguration.setServerLists("127.0.0.1:2181,127.0.0.1:2182");
        instanceConfiguration.setNamespace("orchestration");
        Map<String, CenterConfiguration> instanceConfigurationMap = new HashMap<>();
        instanceConfigurationMap.put(LOGIC_SCHEMA, instanceConfiguration);
        return new OrchestrationConfiguration(instanceConfigurationMap);
    }
    
    private YamlOrchestrationConfiguration getYamlOrchestrationConfiguration() {
        YamlOrchestrationRepositoryConfiguration yamlInstanceConfiguration = new YamlOrchestrationRepositoryConfiguration();
        yamlInstanceConfiguration.setInstanceType("zookeeper");
        yamlInstanceConfiguration.setProps(new Properties());
        yamlInstanceConfiguration.setOrchestrationType("config_center");
        yamlInstanceConfiguration.setServerLists("127.0.0.1:2181,127.0.0.1:2182");
        yamlInstanceConfiguration.setNamespace("orchestration");
        Map<String, YamlOrchestrationRepositoryConfiguration> yamlInstanceConfigurationMap = new HashMap<>();
        yamlInstanceConfigurationMap.put(LOGIC_SCHEMA, yamlInstanceConfiguration);
        YamlOrchestrationConfiguration result = new YamlOrchestrationConfiguration();
        result.setOrchestrationRepositoryConfigurationMap(yamlInstanceConfigurationMap);
        return result;
    }
}

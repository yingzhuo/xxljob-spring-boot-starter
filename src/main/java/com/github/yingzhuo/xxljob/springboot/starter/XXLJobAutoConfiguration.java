/*
 * Copyright 2024-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.yingzhuo.xxljob.springboot.starter;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author 应卓
 * @since 2.3.0
 */
@EnableConfigurationProperties(XXLJobProperties.class)
@ConditionalOnProperty(prefix = XXLJobProperties.PREFIX, name = "enabled", havingValue = "true", matchIfMissing = true)
public class XXLJobAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public XxlJobSpringExecutor xxlJobSpringExecutor(XXLJobProperties props) {
		final XxlJobSpringExecutor executor = new XxlJobSpringExecutor();
		executor.setAdminAddresses(props.getAdminAddresses());
		executor.setAppname(props.getExecutorApplicationName());
		executor.setAddress(props.getExecutorAddress());
		executor.setIp(props.getExecutorIp());
		executor.setPort(props.getExecutorPort());
		executor.setAccessToken(props.getAccessToken());
		executor.setLogPath(props.getLogPath());
		executor.setLogRetentionDays(props.getLogRetentionDays());
		return executor;
	}

}

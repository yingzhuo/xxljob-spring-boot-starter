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
@ConditionalOnProperty(prefix = "xxl-job", name = "enabled", havingValue = "true", matchIfMissing = true)
public class XXLJobAutoConfig {

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

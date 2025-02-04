package com.github.yingzhuo.xxljob.springboot.starter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @author 应卓
 * @since 2.3.0
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@ConfigurationProperties(prefix = "xxl-job")
public class XXLJobProperties implements Serializable {

    /**
     * enable this starter if true
     */
    private boolean enabled = true;

    /**
     * xxl-job admin address list, such as "<a href="http://address">...</a>" or "<a href="http://address01,http://address02">...</a>"
     */
    private String adminAddresses;

    /**
     * access token
     */
    private String accessToken;

    /**
     * application name
     */
    private String executorApplicationName;

    /**
     * executor registry-address: default use address to registry , otherwise use ip:port if address is null
     */
    private String executorAddress;

    /**
     * executor IP address
     */
    private String executorIp;

    /**
     * executor port
     */
    private int executorPort = 9999;

    /**
     * executor log for path
     */
    private String logPath = "/tmp";

    /**
     * log retention days
     */
    private int logRetentionDays = 7;

}

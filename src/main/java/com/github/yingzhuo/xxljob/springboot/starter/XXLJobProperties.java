/*
            _  _       _                          _                   _                 _            _             _
__  ____  _| |(_) ___ | |__        ___ _ __  _ __(_)_ __   __ _      | |__   ___   ___ | |_      ___| |_ __ _ _ __| |_ ___ _ __
\ \/ /\ \/ / || |/ _ \| '_ \ _____/ __| '_ \| '__| | '_ \ / _` |_____| '_ \ / _ \ / _ \| __|____/ __| __/ _` | '__| __/ _ \ '__|
 >  <  >  <| || | (_) | |_) |_____\__ \ |_) | |  | | | | | (_| |_____| |_) | (_) | (_) | ||_____\__ \ || (_| | |  | ||  __/ |
/_/\_\/_/\_\_|/ |\___/|_.__/      |___/ .__/|_|  |_|_| |_|\__, |     |_.__/ \___/ \___/ \__|    |___/\__\__,_|_|   \__\___|_|
            |__/                      |_|                 |___/
 */
package com.github.yingzhuo.xxljob.springboot.starter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @author 应卓
 * @since 2.3.0
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "xxl-job")
public class XXLJobProperties implements Serializable {

    /**
     * enable this starter if true
     */
    private boolean enabled = true;

    /**
     * xxl-job admin address list, such as "http://address" or "http://address01,http://address02"
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

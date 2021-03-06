package com.ciwei.lock.redisson.config.strategy;

import com.ciwei.lock.redisson.config.RedissonProperties;
import org.redisson.config.Config;

/**
 * @author FuHang
 * @date 2019/7/12
 * @desc Redisson配置构建接口
 */
public interface RedissonConfigStrategy {

    /**
     * 根据不同的Redis配置策略创建对应的Config
     * @param redissonProperties
     * @return Config
     */
    Config createRedissonConfig(RedissonProperties redissonProperties);
}

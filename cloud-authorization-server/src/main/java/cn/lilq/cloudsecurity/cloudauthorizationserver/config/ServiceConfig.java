package cn.lilq.cloudsecurity.cloudauthorizationserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @auther: Li Liangquan
 * @date: 2020/10/30 20:09
 */
@Component
@Configuration
public class ServiceConfig {
    @Value("${signing.key}")
    private String jwtSigningKey="";

    public String getJwtSigningKey() {
        return jwtSigningKey;
    }

}

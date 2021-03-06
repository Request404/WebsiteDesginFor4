package com.hey.request.security.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jwt")
@SuppressWarnings("static-access")
public class JwtConfig {

  /**
   * 密匙Key
   */
  public static String secret;

  /**
   * HeaderKey
   */
  public static String tokenHeader;

  /**
   * Token前缀
   */
  public static String tokenPrefix;

  /**
   * 过期时间
   */
  public static Integer expiration;

  /**
   * 配置白名单
   */
  public static String antMatchers;

  /**
   * 将过期时间单位换算成毫秒
   *
   * @param expiration 过期时间，单位秒
   */
  public void setExpiration(Integer expiration) {
    this.expiration = expiration * 1000;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public void setTokenHeader(String tokenHeader) {
    this.tokenHeader = tokenHeader;
  }

  public void setTokenPrefix(String tokenPrefix) {
    this.tokenPrefix = tokenPrefix + " ";
  }

  public void setAntMatchers(String antMatchers) {
    this.antMatchers = antMatchers;
  }

}
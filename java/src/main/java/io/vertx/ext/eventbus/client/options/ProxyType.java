package io.vertx.ext.eventbus.client.options;

/**
 * @author <a href="mailto:pl@linux.com">Phil Lehmann</a>
 *
 * Blatantly copied from io.vertx.core.net.ProxyType @author Alexander Lehmann
 */
public enum ProxyType {
  /**
   * HTTP CONNECT ssl proxy
   */
  HTTP,
  /**
   * SOCKS4/4a tcp proxy
   */
  SOCKS4,
  /**
   * SOCSK5 tcp proxy
   */
  SOCKS5
}

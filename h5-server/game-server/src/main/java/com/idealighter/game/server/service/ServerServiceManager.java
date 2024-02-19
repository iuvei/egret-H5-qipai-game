package com.idealighter.game.server.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServerServiceManager {
  private static ServerServiceManager instance;
  // public static final String SERVICE_ID_ROOT="SERVICE_ROOT";
  private final Map<String, IServerService> serviceMap =
      new ConcurrentHashMap<String, IServerService>();

  /** 
  * 获取实例 .
  *
  * @return 实例.
  */
  public static final ServerServiceManager getInstance() {
    if (instance == null) {
      instance = new ServerServiceManager();
    }
    return instance;
  }

  public final void registerService(String serviceId, IServerService service) {
    serviceMap.put(serviceId, service);
  }

  public final IServerService getService(String serviceId) {
    return serviceMap.get(serviceId);
  }

  public final IServerService removeService(String serviceId) {
    return serviceMap.remove(serviceId);
  }
}

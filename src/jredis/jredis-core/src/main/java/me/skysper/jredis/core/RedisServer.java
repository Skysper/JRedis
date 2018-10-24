package me.skysper.jredis.core;

import java.util.List;
import java.util.Map;

/**
 * @author wupengfei
 * @date 2018/10/24 0024 下午 21:50
 **/
public class RedisServer {
    private RedisDb db;
    private Map<Object,Object> commands;
    private int lruClock;
    private String requirePass;
    private int cronLoops;
    private boolean sentinelMode;

    /* Networking */
    private int port;
    private int tcpBacklog;
    private String bindAddr;
    private List clients;
    private List clientsToClose;

}

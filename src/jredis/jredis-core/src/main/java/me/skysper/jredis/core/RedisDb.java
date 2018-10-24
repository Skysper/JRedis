package me.skysper.jredis.core;

import java.util.List;
import java.util.Map;

/**
 * @author wupengfei
 * @date 2018/10/24 0024 下午 21:54
 **/
public class RedisDb {
    private Map<String,Object> dict;
    private Map<String,Object> expires;

    int id;
    long avgTTL;
    List<String> defragLater;



    public Map<String, Object> getDict() {
        return dict;
    }

    public void setDict(Map<String, Object> dict) {
        this.dict = dict;
    }

    public Map<String, Object> getExpires() {
        return expires;
    }

    public void setExpires(Map<String, Object> expires) {
        this.expires = expires;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAvgTTL() {
        return avgTTL;
    }

    public void setAvgTTL(long avgTTL) {
        this.avgTTL = avgTTL;
    }

    public List<String> getDefragLater() {
        return defragLater;
    }

    public void setDefragLater(List<String> defragLater) {
        this.defragLater = defragLater;
    }
}

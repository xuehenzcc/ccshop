package com.zcc.dao.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
public class RedisDao {
    Logger logger = LoggerFactory.getLogger(RedisDao.class);
    @Autowired
    StringRedisTemplate redisTemplate;

    public String getOne(String key){
        try {
            return redisTemplate.opsForValue().get(key);
        }catch (Exception e){
            logger.error("redis 操作失败！！！",e);
        }
        return null;
    }
    public List<String> getObjList(String[] keys){
        List<String> keyList = new ArrayList<String>();
        for (String key : keys){
            keyList.add(key);
        }
        try {
            return redisTemplate.opsForValue().multiGet(keyList);
        }catch (Exception e){
            logger.error("redis 操作失败！！！",e);
        }
        return null;
    }
    public String addOne(String key,String value){
        String result="0";
        try {
            redisTemplate.opsForValue().set(key,value);
            result="1";
        }catch (Exception e){
            logger.error("redis 操作失败！！！",e);
        }
        return result;
    }
    public String addOne(String key,String value,Long time){
        String result="0";
        try {
            redisTemplate.opsForValue().set(key,value,time, TimeUnit.SECONDS);
            result="1";
        }catch (Exception e){
            logger.error("redis 操作失败！！！",e);
        }
        return result;
    }
    public boolean addByAbsent(String key,String value){
        try {
            return redisTemplate.opsForValue().setIfAbsent(key,value);
        }catch (Exception e){
            logger.error("redis 操作失败！！！",e);
        }
        return false;
    }
    public String setExpire(String key,Long time){
        String result="0";
        try {
            redisTemplate.expire(key,time,TimeUnit.SECONDS);
            result="1";
        }catch (Exception e){
            logger.error("redis 操作失败！！！",e);
        }
        return result;
    }
    public String setExpireDate(String key, Date date){
        String result="0";
        try {
            redisTemplate.expireAt(key,date);
            result="1";
        }catch (Exception e){
            logger.error("redis 操作失败！！！",e);
        }
        return result;
    }
    public String delete(String key){
        String result="0";
        try {
            redisTemplate.delete(key);
            result="1";
        }catch (Exception e){
            logger.error("redis 操作失败！！！",e);
        }
        return result;
    }
    public String deleteArray(String[] keys){
        List<String> keyList = new ArrayList<String>();
        for (String key : keys){
            keyList.add(key);
        }
        String result="0";
        try {
            redisTemplate.delete(keyList);
            result="1";
        }catch (Exception e){
            logger.error("redis 操作失败！！！",e);
        }
        return result;
    }
    public Long ttl(String key){
        try {
            return redisTemplate.getExpire(key);
        }catch (Exception e){
            logger.error("redis 操作失败！！！",e);
        }
        return null;
    }
    public Set<String> getKeys(String param){
        try {
            return redisTemplate.keys(param);
        }catch (Exception e){
            logger.error("redis 操作失败！！！",e);
        }
        return null;
    }
}

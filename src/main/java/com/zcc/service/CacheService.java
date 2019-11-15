package com.zcc.service;

import com.zcc.dao.redis.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class CacheService {
    @Autowired
    private RedisDao redisDao;

    public boolean addByAbsent(String key,String value){
        return redisDao.addByAbsent(key,value);
    }
    public String getOne(String key){
        return redisDao.getOne(key);
    }
    public List<String> getObjList(String[] keys){
        return redisDao.getObjList(keys);
    }
    public Long ttl(String key){
        return redisDao.ttl(key);
    }
    public String setExpireDate(String key, Date date){
        return redisDao.setExpireDate(key,date);
    }
    public String setExpire(String key,Long time){
        return redisDao.setExpire(key,time);
    }
    public Set<String> getKeys(String param){
        return redisDao.getKeys(param);
    }
    public String delete(String key){
        return redisDao.delete(key);
    }
    public String deleteArray(String[] keys){
        return redisDao.deleteArray(keys);
    }
    public String addOne(String key,String value){
        return redisDao.addOne(key,value);
    }
    public String addOne(String key,String value,Long time){
        return redisDao.addOne(key,value,time);
    }

}

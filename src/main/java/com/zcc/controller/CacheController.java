package com.zcc.controller;

import com.zcc.common.SysCode;
import com.zcc.common.response.ReturnBody;
import com.zcc.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @RequestMapping("/getOne")
    public ReturnBody getOne(String key){
        String result = cacheService.getOne(key);
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
    @RequestMapping("/getObjList")
    public ReturnBody getObjList(String keys){
        String strKeys[] = keys.split(",");
        List<String> result = cacheService.getObjList(strKeys);
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
    @RequestMapping("/getKeys")
    public ReturnBody getKeys(String key){
        Set<String> result = cacheService.getKeys(key);
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
    @RequestMapping("/addOne")
    public ReturnBody addOne(String key,String value){
        String result = cacheService.addOne(key,value);
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
    @RequestMapping("/addOneByTime")
    public ReturnBody addOne(String key,String value,Long time){
        String result = cacheService.addOne(key,value,time);
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
    @RequestMapping("/delete")
    public ReturnBody delete(String key){
        String result = cacheService.delete(key);
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
    @RequestMapping("/deleteArray")
    public ReturnBody deleteArray(String keys){
        String strKeys[]=keys.split(",");
        String result = cacheService.deleteArray(strKeys);
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
    @RequestMapping("/addByAbsent")
    public ReturnBody addByAbsent(String key,String value){
        boolean result = cacheService.addByAbsent(key,value);
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
    @RequestMapping("/setExpire")
    public ReturnBody setExpire(String key,Long time){
        String result = cacheService.setExpire(key,time);
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
    @RequestMapping("/setExpireDate")
    public ReturnBody setExpireDate(String key, Date date){
        String result = cacheService.setExpireDate(key,date);
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
    @RequestMapping("/ttl")
    public ReturnBody ttl(String key){
        Long result = cacheService.ttl(key);
        return ReturnBody.Sucess(SysCode.SUCCESS,result);
    }
}

package com.zcc.service;

import com.zcc.dao.mongo.MongoBaseDao;
import com.zcc.mapper.HomeMapper;
import com.zcc.vo.CcUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    @Autowired
    private HomeMapper homeMapper;
    @Autowired
    private MongoBaseDao mongoBaseDao;

    public List<CcUser> getUser(CcUser ccUserVO){
        List<CcUser> ccUserList = new ArrayList<CcUser>();
//        userVO = mongoBaseDao.getUser(2);
//        if(null!=userVO){
//            userList.add(userVO);
//            return userList;
//        }
        ccUserList = homeMapper.selectAll();
//        userList = homeMapper.getUser(userVO);
        return ccUserList;
    }

    @Transactional
    public int addUser(CcUser ccUserVO){
        int result=0;
        result = homeMapper.insert(ccUserVO);
//        result = homeMapper.addUser(userVO);
//        mongoBaseDao.addUser(userVO);
        return result;
    }
}

package com.zcc.dao.mongo;

import com.zcc.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class MongoBaseDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public UserVO getUser(int userId){
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(userId));
        UserVO userVO = mongoTemplate.findOne(query, UserVO.class);
        return userVO;
    }

    public void addUser(UserVO userVO){
        mongoTemplate.save(userVO);
    }

}

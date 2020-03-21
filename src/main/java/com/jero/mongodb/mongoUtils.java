package com.jero.mongodb;

import com.mongodb.DBCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class mongoUtils {

    @Autowired
    private MongoTemplate mongoTemplate;

}

package com.demo.service;

import com.demo.mapper.UserTableMapper;
import com.demo.pojo.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
        @Autowired UserTableMapper mapper;

        public List<UserTable> find(){
              return  mapper.selectByExample(null);
        }




}

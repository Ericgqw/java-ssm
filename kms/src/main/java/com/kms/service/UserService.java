package com.kms.service;

import java.util.List;

import com.kms.model.user;

public interface UserService {
    List<user> getone(String workid,String password);
    List<user> getall( );
    void insertUser(String workid,String name,String password);
}

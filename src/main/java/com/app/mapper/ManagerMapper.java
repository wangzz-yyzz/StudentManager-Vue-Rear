package com.app.mapper;

import com.app.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManagerMapper {
    void insertManager(Manager manager);
    void updateManager(Manager manager);
    void delManager(String name);
    List<Manager> selManagerByName(String name);
}

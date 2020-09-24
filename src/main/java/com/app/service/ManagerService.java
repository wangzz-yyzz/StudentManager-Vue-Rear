package com.app.service;

import com.app.pojo.Manager;

import java.util.List;

public interface ManagerService {
    void addManager(Manager manager);
    void delManager(String name);
    void updateManager(Manager manager);
    List<Manager> findManagerByName(String name);
}

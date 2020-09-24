package com.app.service.impl;

import com.app.mapper.ManagerMapper;
import com.app.pojo.Manager;
import com.app.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {
    @Autowired(required = false)
    private ManagerMapper managerMapper;

    @Override
    public void addManager(Manager manager) {
        managerMapper.insertManager(manager);
    }

    @Override
    public void delManager(String name) {
        managerMapper.delManager(name);
    }

    @Override
    public void updateManager(Manager manager) {
        managerMapper.updateManager(manager);
    }

    @Override
    public List<Manager> findManagerByName(String name) {
        return managerMapper.selManagerByName(name);
    }
}

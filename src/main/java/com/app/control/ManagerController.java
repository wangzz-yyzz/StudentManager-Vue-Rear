package com.app.control;

import com.app.pojo.Manager;
import com.app.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;
import java.util.List;

@CrossOrigin("http://localhost:5050")
@RequestMapping("/manager")
@RestController
public class ManagerController {

    private final ManagerService managerService;
    @Autowired
    public ManagerController(ManagerService managerService){
        this.managerService=managerService;
    }

    @RequestMapping("/add")
    public String add(Manager manager){
        managerService.addManager(manager);
        return "ok";
    }

    @RequestMapping("/update")
    public String update(Manager manager){
        managerService.updateManager(manager);
        return "ok";
    }

    @RequestMapping("/del")
    public String del(String name){
        managerService.delManager(name);
        return "ok";
    }

    @RequestMapping("/sign_in")
    public String sign_in(String name, String password){
        List<Manager> list=managerService.findManagerByName(name);
        if (list.size()==0){
            return "wrong name";
        }
        Manager manager=list.get(0);
        if (manager.getPassword().equals(password)){
            return "ok";
        } else {
            return "wrong password";
        }
    }

    @RequestMapping("/get_all")
    public Manager getAll(String name){
        return managerService.findManagerByName(name).get(0);
    }

    @RequestMapping("/check_if_has_same_name")
    public String checkIfHasSameName(String name){
        List<Manager> managers = managerService.findManagerByName(name);
        if (managers.size() == 0) {
            return "ok";
        } else {
            return "has same name numbers " + managers.size();
        }
    }
}

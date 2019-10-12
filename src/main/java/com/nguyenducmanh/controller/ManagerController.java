package com.nguyenducmanh.controller;

import com.nguyenducmanh.entity.Manager;
import com.nguyenducmanh.model.request.ManagerRequest;
import com.nguyenducmanh.service.ManagerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManagerController {
    private ManagerService managerService;

    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping("/managers")
    public List<Manager> getAllManagers() {
        List<Manager> list = managerService.findAll();
        return list;
    }

    @GetMapping("/mng/{id}")
    public Manager getManager(@PathVariable long id) {
        return managerService.findManagerByUserId(id);
    }

    @RequestMapping(value = "/insertManager", method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody ManagerRequest managerRequest) {
        managerService.insert(managerRequest);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/manager/update", method = RequestMethod.POST)
    public ResponseEntity<Void> update(@RequestBody ManagerRequest managerRequest, @RequestParam long id) {
        managerService.update(managerRequest, id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/manager/delete/{id}")
    public String delete(@PathVariable long id){
        managerService.delete(id);
        return "del complete";
    }
}

package com.ru.springboot3.service.Imp;

import com.ru.springboot3.mapper.RoleMapper;
import com.ru.springboot3.model.Role;
import com.ru.springboot3.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImp implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> selectAll() {
        return roleMapper.selectByExample(null);
    }
}

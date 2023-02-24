/*package com.fh.webshopdemo.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fh.webshopdemo.demo.repository.OrganizationRepository;
import com.fh.webshopdemo.demo.repository.PrivilegeRepository;
import com.fh.webshopdemo.demo.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@Component
public class SetupData {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PrivilegeRepository privilegeRepository;

    @Autowired
    private OrganizationRepository organizationRepository;

    @PostConstruct
    public void init() {
        initPrivileges();
        initOrganizations();
        initUsers();
    }
}*/
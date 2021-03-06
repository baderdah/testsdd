package com.ensas.miniprojet.demo.service.userService;

import com.ensas.miniprojet.demo.entity.Identification;
import com.ensas.miniprojet.demo.entity.User;
import com.ensas.miniprojet.demo.service.AbstractService;

public interface UserService extends AbstractService<User> {
    /**
     * this function is for authenticating an existing user by their identification.
     * @param identification
     * @return
     */
    public User login(Identification identification);

}

package com.epam.education.spring.service;

import com.epam.education.spring.domain.User;

import javax.annotation.Nullable;

/**
 * @author Yuriy_Tkach
 */
public interface UserService extends AbstractDomainObjectService<User> {

    /**
     * Finding user by email
     *
     * @param email Email of the user
     * @return found user or <code>null</code>
     */
    @Nullable
    User getUserByEmail(String email);
}

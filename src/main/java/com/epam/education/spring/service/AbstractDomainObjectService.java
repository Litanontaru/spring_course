package com.epam.education.spring.service;

import com.epam.education.spring.domain.DomainObject;

import javax.annotation.Nonnull;
import java.util.Collection;

/**
 * @param <T> DomainObject subclass
 * @author Yuriy_Tkach
 */
public interface AbstractDomainObjectService<T extends DomainObject> {

    /**
     * Saving new object to storage or updating existing one
     *
     * @param object Object to save
     * @return saved object with assigned id
     */
    public T save(@Nonnull T object);

    /**
     * Removing object from storage
     *
     * @param object Object to remove
     */
    public void remove(@Nonnull T object);

    /**
     * Getting object by id from storage
     *
     * @param id id of the object
     * @return Found object or <code>null</code>
     */
    public T getById(@Nonnull Long id);

    /**
     * Getting all objects from storage
     *
     * @return collection of objects
     */
    public
    @Nonnull
    Collection<T> getAll();
}
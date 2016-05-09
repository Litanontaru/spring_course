package com.epam.education.spring.service;

import com.epam.education.spring.domain.Event;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * @author Yuriy_Tkach
 */
public interface EventService extends AbstractDomainObjectService<Event> {

    /**
     * Finding event by name
     *
     * @param name Name of the event
     * @return found event or <code>null</code>
     */
    @Nullable
    Event getByName(@Nonnull String name);
}

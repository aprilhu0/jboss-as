/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.ejb3.subsystem.deployment;

import org.jboss.as.controller.OperationContext;
import org.jboss.as.controller.PathAddress;
import org.jboss.as.ee.component.ComponentConfiguration;
import org.jboss.as.ejb3.component.entity.EntityBeanComponent;
import org.jboss.as.ejb3.component.messagedriven.MessageDrivenComponent;

/**
 * Handles operations that provide runtime management of a {@link MessageDrivenComponent}.
 *
 * @author Brian Stansberry (c) 2011 Red Hat Inc.
 */
public class EntityBeanRuntimeHandler extends AbstractEJBComponentRuntimeHandler<EntityBeanComponent> {

    public static final EntityBeanRuntimeHandler INSTANCE = new EntityBeanRuntimeHandler();

    private EntityBeanRuntimeHandler() {
        super(EJBComponentType.ENTITY, EntityBeanComponent.class);
    }

    @Override
    protected void executeReadAttribute(String attributeName, OperationContext context, EntityBeanComponent component, ComponentConfiguration config, PathAddress address) {
        super.executeReadAttribute(attributeName, context, component, config, address);
        //TODO expose the cache
    }
}

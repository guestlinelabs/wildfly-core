/*
 * Copyright (C) 2019 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file
 * in the distribution for a full listing of individual contributors.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

package org.jboss.as.model.test.parent;

import org.jboss.as.model.test.api.Welcome;

/**
 * @author <a href="mailto:lgao@redhat.com">Lin Gao</a>
 */

public class WelcomeParent implements Welcome {

  public String hello(String name) {
    return "The parent is saying hello " + name;
  }

}
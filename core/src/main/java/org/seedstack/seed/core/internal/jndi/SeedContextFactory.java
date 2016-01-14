/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.seed.core.internal.jndi;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;
import java.util.Hashtable;

/**
 * JNDI context factory for {@link JndiContext} context.
 *
 * @author adrien.lauer@mpsa.com
 */
public class SeedContextFactory implements InitialContextFactory {
    @Override
    public Context getInitialContext(final Hashtable environment) throws NamingException {
        return new JndiContext(environment);
    }
}
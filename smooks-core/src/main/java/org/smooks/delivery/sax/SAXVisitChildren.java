/*-
 * ========================LICENSE_START=================================
 * Smooks Core
 * %%
 * Copyright (C) 2020 Smooks
 * %%
 * Licensed under the terms of the Apache License Version 2.0, or
 * the GNU Lesser General Public License version 3.0 or later.
 * 
 * SPDX-License-Identifier: Apache-2.0 OR LGPL-3.0-or-later
 * 
 * ======================================================================
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * ======================================================================
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * =========================LICENSE_END==================================
 */
package org.smooks.delivery.sax;

import org.smooks.container.ExecutionContext;
import org.smooks.SmooksException;

import java.io.IOException;

/**
 * SAX Visit children events.
 *
 * @author <a href="mailto:tom.fennelly@gmail.com">tom.fennelly@gmail.com</a>
 */
public interface SAXVisitChildren extends SAXVisitor {
    /**
     * Process the onChildText event for the targeted element.
     * <p/>
     * Be careful when caching element data.  This is not a DOM.
     *
     * @param element          The element containing the text (parent).  The targeted element.
     * @param childText        The text.
     * @param executionContext Execution context.
     * @throws org.smooks.SmooksException Event processing failure.
     * @throws java.io.IOException     Error writing event to output writer.
     */
    void onChildText(SAXElement element, SAXText childText, ExecutionContext executionContext) throws SmooksException, IOException;

    /**
     * Process the onChildElement event for the targeted element.
     * <p/>
     * Be careful when caching element data.  This is not a DOM.
     *
     * @param element          The element containing the child element (parent). The targeted element.
     * @param childElement     The child element just added to the targeted element.
     * @param executionContext Execution context.
     * @throws org.smooks.SmooksException Event processing failure.
     * @throws java.io.IOException     Error writing event to output writer.
     */
    void onChildElement(SAXElement element, SAXElement childElement, ExecutionContext executionContext) throws SmooksException, IOException;
}

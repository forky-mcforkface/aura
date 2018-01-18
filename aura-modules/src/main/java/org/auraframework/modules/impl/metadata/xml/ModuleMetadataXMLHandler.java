/*
 * Copyright (C) 2013 salesforce.com, inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.auraframework.modules.impl.metadata.xml;

import org.auraframework.impl.root.component.ModuleDefImpl.Builder;
import org.auraframework.system.TextSource;
import org.auraframework.throwable.quickfix.QuickFixException;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public interface ModuleMetadataXMLHandler {
    String handledElement();
    void process(XMLStreamReader reader, Builder moduleBuilder, TextSource source) throws XMLStreamException, QuickFixException;
}

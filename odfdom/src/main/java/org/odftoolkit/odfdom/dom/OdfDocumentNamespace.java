/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

package org.odftoolkit.odfdom.dom;

import org.odftoolkit.odfdom.pkg.NamespaceName;

/**
 * Namespaces of OpenDocument 1.2 XML Schema
 */
public enum OdfDocumentNamespace implements NamespaceName {

	ANIM("anim", "urn:oasis:names:tc:opendocument:xmlns:animation:1.0"),
	CHART("chart", "urn:oasis:names:tc:opendocument:xmlns:chart:1.0"),
	CONFIG("config", "urn:oasis:names:tc:opendocument:xmlns:config:1.0"),
	DB("db", "urn:oasis:names:tc:opendocument:xmlns:database:1.0"),
	DC("dc", "http://purl.org/dc/elements/1.1/"),
	DR3D("dr3d", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"),
	DRAW("draw", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"),
	FO("fo", "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0"),
	FORM("form", "urn:oasis:names:tc:opendocument:xmlns:form:1.0"),
	GRDDL("grddl", "http://www.w3.org/2003/g/data-view#"),
	MATH("math", "http://www.w3.org/1998/Math/MathML"),
	META("meta", "urn:oasis:names:tc:opendocument:xmlns:meta:1.0"),
	NUMBER("number", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0"),
	OF("of", "urn:oasis:names:tc:opendocument:xmlns:of:1.2"),
	OFFICE("office", "urn:oasis:names:tc:opendocument:xmlns:office:1.0"),
	PRESENTATION("presentation", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"),
	SCRIPT("script", "urn:oasis:names:tc:opendocument:xmlns:script:1.0"),
	SMIL("smil", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"),
	STYLE("style", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"),
	SVG("svg", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"),
	TABLE("table", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"),
	TEXT("text", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"),
	XFORMS("xforms", "http://www.w3.org/2002/xforms"),
	XHTML("xhtml", "http://www.w3.org/1999/xhtml"),
	XLINK("xlink", "http://www.w3.org/1999/xlink"),
	XML("xml", "http://www.w3.org/XML/1998/namespace" );

	private String mPrefix;
	private String mUri;

	OdfDocumentNamespace(String prefix, String uri) {
		mPrefix = prefix;
		mUri = uri;
	}

	/**
	 * @return the prefix currently related to ODF Namespace.
	 */
	public String getPrefix() {
		return mPrefix;
	}

	/**
	 * @return the URI identifiying the ODF Namespace.
	 */
	public String getUri() {
		return mUri;
	}
}

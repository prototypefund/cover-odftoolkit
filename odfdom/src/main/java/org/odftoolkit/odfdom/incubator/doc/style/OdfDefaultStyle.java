
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


package org.odftoolkit.odfdom.incubator.doc.style;

import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.element.style.StyleDefaultStyleElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;

/**
 * Convenient functionalty for the parent ODF OpenDocument element
 *
 */
public class OdfDefaultStyle extends StyleDefaultStyleElement
{

	private static final long serialVersionUID = -8824457719103504447L;

	public OdfDefaultStyle( OdfFileDom ownerDoc )
    {
        super( ownerDoc );
    }

    @Override
    public OdfStyleBase getParentStyle()
    {
        return null;
    }

	@Override
	public OdfStyleFamily getFamily() {
		String family = getStyleFamilyAttribute();
		if(family!=null)
		 return OdfStyleFamily.valueOf( family);
		else
			return null;
	}
}

/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
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

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.openoffice.odf.dom.element.text;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.style.OdfStyleFamily;
import org.openoffice.odf.dom.element.OdfStylableElement;
import org.openoffice.odf.dom.type.OdfPositiveInteger;
import org.openoffice.odf.dom.type.OdfStyleName;


/**
 * ODF DOM Element implementation for element "<text:table-of-content-entry-template>".
 */
public abstract class OdfTableOfContentEntryTemplateElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "table-of-content-entry-template" );

    public OdfTableOfContentEntryTemplateElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.Paragraph, OdfName.get( OdfNamespace.TEXT, "style-name" ) );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(Integer _aOutlineLevel, String _aStyleName)
    {
        setOutlineLevel( _aOutlineLevel );
        setStyleName( _aStyleName );
    }

    /**
     * Get value of attribute "text:outline-level".
     */
    public Integer getOutlineLevel()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "outline-level" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:outline-level".
     */
    public void setOutlineLevel( Integer _aOutlineLevel )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aOutlineLevel );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "outline-level" ), aStringVal );
    }

    /**
     * Get value of attribute "text:style-name".
     */
    public String getStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:style-name".
     */
    public void setStyleName( String _aStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "style-name" ), aStringVal );
    }

}

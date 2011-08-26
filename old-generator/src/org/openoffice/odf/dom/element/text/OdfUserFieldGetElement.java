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
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.text.OdfValueFormulaNoneDisplayType;
import org.openoffice.odf.dom.type.OdfStyleName;


/**
 * ODF DOM Element implementation for element "<text:user-field-get>".
 */
public abstract class OdfUserFieldGetElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "user-field-get" );

    public OdfUserFieldGetElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aName)
    {
        setName( _aName );
    }

    /**
     * Get value of attribute "text:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "name" ) );
    }

    /**
     * Set value of attribute "text:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "name" ), _aName );
    }

    /**
     * Get value of attribute "text:display".
     */
    public OdfValueFormulaNoneDisplayType getDisplay()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display" ) );
        return OdfValueFormulaNoneDisplayType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:display".
     */
    public void setDisplay( OdfValueFormulaNoneDisplayType _aDisplay )
    {                    
        String aStringVal = OdfValueFormulaNoneDisplayType.toString( _aDisplay );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display" ), aStringVal );
    }

    /**
     * Get value of attribute "style:data-style-name".
     */
    public String getDataStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "data-style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:data-style-name".
     */
    public void setDataStyleName( String _aDataStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aDataStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "data-style-name" ), aStringVal );
    }

}

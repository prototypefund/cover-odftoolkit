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
import org.openoffice.odf.dom.type.office.OdfValueType;


/**
 * ODF DOM Element implementation for element "<text:variable-decl>".
 */
public abstract class OdfVariableDeclElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "variable-decl" );

    public OdfVariableDeclElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aName, OdfValueType _aValueType)
    {
        setName( _aName );
        setValueType( _aValueType );
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
     * Get value of attribute "office:value-type".
     */
    public OdfValueType getValueType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value-type" ) );
        return OdfValueType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:value-type".
     */
    public void setValueType( OdfValueType _aValueType )
    {                    
        String aStringVal = OdfValueType.toString( _aValueType );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "value-type" ), aStringVal );
    }

}

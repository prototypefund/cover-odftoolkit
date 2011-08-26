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

package org.openoffice.odf.dom.element.table;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.OdfNonNegativeInteger;


/**
 * ODF DOM Element implementation for element "<table:subtotal-field>".
 */
public abstract class OdfSubtotalFieldElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "subtotal-field" );

    public OdfSubtotalFieldElement( OdfFileDom _aOwnerDoc )
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
    public void init(Integer _aFieldNumber, String _aFunction)
    {
        setFieldNumber( _aFieldNumber );
        setFunction( _aFunction );
    }

    /**
     * Get value of attribute "table:field-number".
     */
    public Integer getFieldNumber()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "field-number" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:field-number".
     */
    public void setFieldNumber( Integer _aFieldNumber )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aFieldNumber );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "field-number" ), aStringVal );
    }

    /**
     * Get value of attribute "table:function".
     */
    public String getFunction()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "function" ) );
    }

    /**
     * Set value of attribute "table:function".
     */
    public void setFunction( String _aFunction )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "function" ), _aFunction );
    }

}

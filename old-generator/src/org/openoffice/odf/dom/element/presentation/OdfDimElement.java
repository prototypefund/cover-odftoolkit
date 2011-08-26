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

package org.openoffice.odf.dom.element.presentation;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.OdfId;


/**
 * ODF DOM Element implementation for element "<presentation:dim>".
 */
public abstract class OdfDimElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.PRESENTATION, "dim" );

    public OdfDimElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aShapeId, String _aColor)
    {
        setShapeId( _aShapeId );
        setColor( _aColor );
    }

    /**
     * Get value of attribute "draw:shape-id".
     */
    public String getShapeId()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "shape-id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:shape-id".
     */
    public void setShapeId( String _aShapeId )
    {                    
        String aStringVal = OdfId.toString( _aShapeId );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "shape-id" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:color".
     */
    public String getColor()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "color" ) );
    }

    /**
     * Set value of attribute "draw:color".
     */
    public void setColor( String _aColor )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "color" ), _aColor );
    }

}

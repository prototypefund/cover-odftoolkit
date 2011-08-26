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

package org.openoffice.odf.dom.element.draw;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<draw:handle>".
 */
public abstract class OdfHandleElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "handle" );

    public OdfHandleElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aHandlePosition)
    {
        setHandlePosition( _aHandlePosition );
    }

    /**
     * Get value of attribute "draw:handle-mirror-vertical".
     */
    public Boolean getHandleMirrorVertical()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-mirror-vertical" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:handle-mirror-vertical".
     */
    public void setHandleMirrorVertical( Boolean _aHandleMirrorVertical )
    {                    
        String aStringVal = OdfBoolean.toString( _aHandleMirrorVertical );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-mirror-vertical" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:handle-mirror-horizontal".
     */
    public Boolean getHandleMirrorHorizontal()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-mirror-horizontal" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:handle-mirror-horizontal".
     */
    public void setHandleMirrorHorizontal( Boolean _aHandleMirrorHorizontal )
    {                    
        String aStringVal = OdfBoolean.toString( _aHandleMirrorHorizontal );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-mirror-horizontal" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:handle-switched".
     */
    public Boolean getHandleSwitched()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-switched" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:handle-switched".
     */
    public void setHandleSwitched( Boolean _aHandleSwitched )
    {                    
        String aStringVal = OdfBoolean.toString( _aHandleSwitched );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-switched" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:handle-position".
     */
    public String getHandlePosition()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-position" ) );
    }

    /**
     * Set value of attribute "draw:handle-position".
     */
    public void setHandlePosition( String _aHandlePosition )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-position" ), _aHandlePosition );
    }

    /**
     * Get value of attribute "draw:handle-range-x-minimum".
     */
    public String getHandleRangeXMinimum()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-range-x-minimum" ) );
    }

    /**
     * Set value of attribute "draw:handle-range-x-minimum".
     */
    public void setHandleRangeXMinimum( String _aHandleRangeXMinimum )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-range-x-minimum" ), _aHandleRangeXMinimum );
    }

    /**
     * Get value of attribute "draw:handle-range-x-maximum".
     */
    public String getHandleRangeXMaximum()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-range-x-maximum" ) );
    }

    /**
     * Set value of attribute "draw:handle-range-x-maximum".
     */
    public void setHandleRangeXMaximum( String _aHandleRangeXMaximum )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-range-x-maximum" ), _aHandleRangeXMaximum );
    }

    /**
     * Get value of attribute "draw:handle-range-y-minimum".
     */
    public String getHandleRangeYMinimum()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-range-y-minimum" ) );
    }

    /**
     * Set value of attribute "draw:handle-range-y-minimum".
     */
    public void setHandleRangeYMinimum( String _aHandleRangeYMinimum )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-range-y-minimum" ), _aHandleRangeYMinimum );
    }

    /**
     * Get value of attribute "draw:handle-range-y-maximum".
     */
    public String getHandleRangeYMaximum()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-range-y-maximum" ) );
    }

    /**
     * Set value of attribute "draw:handle-range-y-maximum".
     */
    public void setHandleRangeYMaximum( String _aHandleRangeYMaximum )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-range-y-maximum" ), _aHandleRangeYMaximum );
    }

    /**
     * Get value of attribute "draw:handle-polar".
     */
    public String getHandlePolar()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-polar" ) );
    }

    /**
     * Set value of attribute "draw:handle-polar".
     */
    public void setHandlePolar( String _aHandlePolar )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-polar" ), _aHandlePolar );
    }

    /**
     * Get value of attribute "draw:handle-radius-range-minimum".
     */
    public String getHandleRadiusRangeMinimum()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-radius-range-minimum" ) );
    }

    /**
     * Set value of attribute "draw:handle-radius-range-minimum".
     */
    public void setHandleRadiusRangeMinimum( String _aHandleRadiusRangeMinimum )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-radius-range-minimum" ), _aHandleRadiusRangeMinimum );
    }

    /**
     * Get value of attribute "draw:handle-radius-range-maximum".
     */
    public String getHandleRadiusRangeMaximum()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-radius-range-maximum" ) );
    }

    /**
     * Set value of attribute "draw:handle-radius-range-maximum".
     */
    public void setHandleRadiusRangeMaximum( String _aHandleRadiusRangeMaximum )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "handle-radius-range-maximum" ), _aHandleRadiusRangeMaximum );
    }

}

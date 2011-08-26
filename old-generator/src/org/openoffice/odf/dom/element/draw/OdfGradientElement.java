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
import org.openoffice.odf.dom.type.OdfStyleName;
import org.openoffice.odf.dom.type.draw.OdfGradientStyleType;
import org.openoffice.odf.dom.type.OdfPercent;


/**
 * ODF DOM Element implementation for element "<draw:gradient>".
 */
public abstract class OdfGradientElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "gradient" );

    public OdfGradientElement( OdfFileDom _aOwnerDoc )
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
    public void init(OdfGradientStyleType _aStyle)
    {
        setStyle( _aStyle );
    }

    /**
     * Get value of attribute "draw:name".
     */
    public String getName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:name".
     */
    public void setName( String _aName )
    {                    
        String aStringVal = OdfStyleName.toString( _aName );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "name" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:display-name".
     */
    public String getDisplayName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "display-name" ) );
    }

    /**
     * Set value of attribute "draw:display-name".
     */
    public void setDisplayName( String _aDisplayName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "display-name" ), _aDisplayName );
    }

    /**
     * Get value of attribute "draw:style".
     */
    public OdfGradientStyleType getStyle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style" ) );
        return OdfGradientStyleType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:style".
     */
    public void setStyle( OdfGradientStyleType _aStyle )
    {                    
        String aStringVal = OdfGradientStyleType.toString( _aStyle );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:cx".
     */
    public Double getCx()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "cx" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:cx".
     */
    public void setCx( Double _aCx )
    {                    
        String aStringVal = OdfPercent.toString( _aCx );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "cx" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:cy".
     */
    public Double getCy()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "cy" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:cy".
     */
    public void setCy( Double _aCy )
    {                    
        String aStringVal = OdfPercent.toString( _aCy );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "cy" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:angle".
     */
    public Integer getAngle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "angle" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:angle".
     */
    public void setAngle( Integer _aAngle )
    {                    
        String aStringVal = Integer.toString( _aAngle );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "angle" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:border".
     */
    public Double getBorder()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "border" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:border".
     */
    public void setBorder( Double _aBorder )
    {                    
        String aStringVal = OdfPercent.toString( _aBorder );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "border" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:start-color".
     */
    public String getStartColor()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start-color" ) );
    }

    /**
     * Set value of attribute "draw:start-color".
     */
    public void setStartColor( String _aStartColor )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start-color" ), _aStartColor );
    }

    /**
     * Get value of attribute "draw:end-color".
     */
    public String getEndColor()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end-color" ) );
    }

    /**
     * Set value of attribute "draw:end-color".
     */
    public void setEndColor( String _aEndColor )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end-color" ), _aEndColor );
    }

    /**
     * Get value of attribute "draw:start-intensity".
     */
    public Double getStartIntensity()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start-intensity" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:start-intensity".
     */
    public void setStartIntensity( Double _aStartIntensity )
    {                    
        String aStringVal = OdfPercent.toString( _aStartIntensity );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "start-intensity" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:end-intensity".
     */
    public Double getEndIntensity()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end-intensity" ) );
        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:end-intensity".
     */
    public void setEndIntensity( Double _aEndIntensity )
    {                    
        String aStringVal = OdfPercent.toString( _aEndIntensity );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "end-intensity" ), aStringVal );
    }

}

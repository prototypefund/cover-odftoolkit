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

package org.openoffice.odf.dom.element.style;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.OdfNonNegativeLength;
import org.openoffice.odf.dom.type.style.OdfTabStopType;
import org.openoffice.odf.dom.type.style.OdfLeaderType;
import org.openoffice.odf.dom.type.style.OdfLeaderStyleType;
import org.openoffice.odf.dom.type.OdfPositiveInteger;
import org.openoffice.odf.dom.type.OdfStyleName;


/**
 * ODF DOM Element implementation for element "<style:tab-stop>".
 */
public abstract class OdfTabStopElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.STYLE, "tab-stop" );

    public OdfTabStopElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aPosition)
    {
        setPosition( _aPosition );
    }

    /**
     * Get value of attribute "style:position".
     */
    public String getPosition()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "position" ) );
        return OdfNonNegativeLength.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:position".
     */
    public void setPosition( String _aPosition )
    {                    
        String aStringVal = OdfNonNegativeLength.toString( _aPosition );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "position" ), aStringVal );
    }

    /**
     * Get value of attribute "style:type".
     */
    public OdfTabStopType getType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "type" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "left";
        }

        return OdfTabStopType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:type".
     */
    public void setType( OdfTabStopType _aType )
    {                    
        String aStringVal = OdfTabStopType.toString( _aType );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "type" ), aStringVal );
    }

    /**
     * Get value of attribute "style:char".
     */
    public String getChar()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "char" ) );
    }

    /**
     * Set value of attribute "style:char".
     */
    public void setChar( String _aChar )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "char" ), _aChar );
    }

    /**
     * Get value of attribute "style:leader-type".
     */
    public OdfLeaderType getLeaderType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-type" ) );
        return OdfLeaderType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:leader-type".
     */
    public void setLeaderType( OdfLeaderType _aLeaderType )
    {                    
        String aStringVal = OdfLeaderType.toString( _aLeaderType );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-type" ), aStringVal );
    }

    /**
     * Get value of attribute "style:leader-style".
     */
    public OdfLeaderStyleType getLeaderStyle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-style" ) );
        return OdfLeaderStyleType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:leader-style".
     */
    public void setLeaderStyle( OdfLeaderStyleType _aLeaderStyle )
    {                    
        String aStringVal = OdfLeaderStyleType.toString( _aLeaderStyle );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-style" ), aStringVal );
    }

    /**
     * Get value of attribute "style:leader-width".
     */
    public Integer getLeaderWidth()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-width" ) );
        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:leader-width".
     */
    public void setLeaderWidth( Integer _aLeaderWidth )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aLeaderWidth );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-width" ), aStringVal );
    }

    /**
     * Get value of attribute "style:leader-color".
     */
    public String getLeaderColor()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-color" ) );
    }

    /**
     * Set value of attribute "style:leader-color".
     */
    public void setLeaderColor( String _aLeaderColor )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-color" ), _aLeaderColor );
    }

    /**
     * Get value of attribute "style:leader-text".
     */
    public String getLeaderText()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-text" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = " ";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:leader-text".
     */
    public void setLeaderText( String _aLeaderText )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-text" ), _aLeaderText );
    }

    /**
     * Get value of attribute "style:leader-text-style".
     */
    public String getLeaderTextStyle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-text-style" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:leader-text-style".
     */
    public void setLeaderTextStyle( String _aLeaderTextStyle )
    {                    
        String aStringVal = OdfStyleName.toString( _aLeaderTextStyle );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "leader-text-style" ), aStringVal );
    }

}

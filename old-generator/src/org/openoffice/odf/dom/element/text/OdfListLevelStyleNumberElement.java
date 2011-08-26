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
import org.openoffice.odf.dom.type.OdfStyleName;
import org.openoffice.odf.dom.type.OdfBoolean;
import org.openoffice.odf.dom.type.OdfPositiveInteger;


/**
 * ODF DOM Element implementation for element "<text:list-level-style-number>".
 */
public abstract class OdfListLevelStyleNumberElement extends OdfListLevelStyleElementBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "list-level-style-number" );

    public OdfListLevelStyleNumberElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aNumFormat, Integer _aLevel)
    {
        setNumFormat( _aNumFormat );
        super.init( _aLevel );
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

    /**
     * Get value of attribute "style:num-format".
     */
    public String getNumFormat()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-format" ) );
    }

    /**
     * Set value of attribute "style:num-format".
     */
    public void setNumFormat( String _aNumFormat )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-format" ), _aNumFormat );
    }

    /**
     * Get value of attribute "style:num-letter-sync".
     */
    public Boolean getNumLetterSync()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-letter-sync" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:num-letter-sync".
     */
    public void setNumLetterSync( Boolean _aNumLetterSync )
    {                    
        String aStringVal = OdfBoolean.toString( _aNumLetterSync );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-letter-sync" ), aStringVal );
    }

    /**
     * Get value of attribute "style:num-prefix".
     */
    public String getNumPrefix()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-prefix" ) );
    }

    /**
     * Set value of attribute "style:num-prefix".
     */
    public void setNumPrefix( String _aNumPrefix )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-prefix" ), _aNumPrefix );
    }

    /**
     * Get value of attribute "style:num-suffix".
     */
    public String getNumSuffix()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-suffix" ) );
    }

    /**
     * Set value of attribute "style:num-suffix".
     */
    public void setNumSuffix( String _aNumSuffix )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "num-suffix" ), _aNumSuffix );
    }

    /**
     * Get value of attribute "text:display-levels".
     */
    public Integer getDisplayLevels()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display-levels" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "1";
        }

        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:display-levels".
     */
    public void setDisplayLevels( Integer _aDisplayLevels )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aDisplayLevels );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "display-levels" ), aStringVal );
    }

    /**
     * Get value of attribute "text:start-value".
     */
    public Integer getStartValue()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "start-value" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "1";
        }

        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:start-value".
     */
    public void setStartValue( Integer _aStartValue )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aStartValue );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "start-value" ), aStringVal );
    }

}

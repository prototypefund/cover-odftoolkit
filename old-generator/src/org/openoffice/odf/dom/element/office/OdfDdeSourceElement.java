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

package org.openoffice.odf.dom.element.office;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.office.OdfConversionModeType;
import org.openoffice.odf.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<office:dde-source>".
 */
public abstract class OdfDdeSourceElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.OFFICE, "dde-source" );

    public OdfDdeSourceElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aDdeApplication, String _aDdeTopic, String _aDdeItem)
    {
        setDdeApplication( _aDdeApplication );
        setDdeTopic( _aDdeTopic );
        setDdeItem( _aDdeItem );
    }

    /**
     * Get value of attribute "office:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "name" ) );
    }

    /**
     * Set value of attribute "office:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "name" ), _aName );
    }

    /**
     * Get value of attribute "office:conversion-mode".
     */
    public OdfConversionModeType getConversionMode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "conversion-mode" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "into-default-style-data-style";
        }

        return OdfConversionModeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:conversion-mode".
     */
    public void setConversionMode( OdfConversionModeType _aConversionMode )
    {                    
        String aStringVal = OdfConversionModeType.toString( _aConversionMode );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "conversion-mode" ), aStringVal );
    }

    /**
     * Get value of attribute "office:dde-application".
     */
    public String getDdeApplication()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "dde-application" ) );
    }

    /**
     * Set value of attribute "office:dde-application".
     */
    public void setDdeApplication( String _aDdeApplication )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "dde-application" ), _aDdeApplication );
    }

    /**
     * Get value of attribute "office:dde-topic".
     */
    public String getDdeTopic()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "dde-topic" ) );
    }

    /**
     * Set value of attribute "office:dde-topic".
     */
    public void setDdeTopic( String _aDdeTopic )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "dde-topic" ), _aDdeTopic );
    }

    /**
     * Get value of attribute "office:dde-item".
     */
    public String getDdeItem()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "dde-item" ) );
    }

    /**
     * Set value of attribute "office:dde-item".
     */
    public void setDdeItem( String _aDdeItem )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "dde-item" ), _aDdeItem );
    }

    /**
     * Get value of attribute "office:automatic-update".
     */
    public Boolean getAutomaticUpdate()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "automatic-update" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:automatic-update".
     */
    public void setAutomaticUpdate( Boolean _aAutomaticUpdate )
    {                    
        String aStringVal = OdfBoolean.toString( _aAutomaticUpdate );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "automatic-update" ), aStringVal );
    }

}

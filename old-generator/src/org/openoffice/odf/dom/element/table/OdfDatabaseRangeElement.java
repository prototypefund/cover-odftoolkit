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
import org.openoffice.odf.dom.type.OdfBoolean;
import org.openoffice.odf.dom.type.table.OdfOrientationType;


/**
 * ODF DOM Element implementation for element "<table:database-range>".
 */
public abstract class OdfDatabaseRangeElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "database-range" );

    public OdfDatabaseRangeElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aTargetRangeAddress)
    {
        setTargetRangeAddress( _aTargetRangeAddress );
    }

    /**
     * Get value of attribute "table:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "name" ) );
    }

    /**
     * Set value of attribute "table:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "name" ), _aName );
    }

    /**
     * Get value of attribute "table:is-selection".
     */
    public Boolean getIsSelection()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "is-selection" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:is-selection".
     */
    public void setIsSelection( Boolean _aIsSelection )
    {                    
        String aStringVal = OdfBoolean.toString( _aIsSelection );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "is-selection" ), aStringVal );
    }

    /**
     * Get value of attribute "table:on-update-keep-styles".
     */
    public Boolean getOnUpdateKeepStyles()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "on-update-keep-styles" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:on-update-keep-styles".
     */
    public void setOnUpdateKeepStyles( Boolean _aOnUpdateKeepStyles )
    {                    
        String aStringVal = OdfBoolean.toString( _aOnUpdateKeepStyles );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "on-update-keep-styles" ), aStringVal );
    }

    /**
     * Get value of attribute "table:on-update-keep-size".
     */
    public Boolean getOnUpdateKeepSize()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "on-update-keep-size" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:on-update-keep-size".
     */
    public void setOnUpdateKeepSize( Boolean _aOnUpdateKeepSize )
    {                    
        String aStringVal = OdfBoolean.toString( _aOnUpdateKeepSize );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "on-update-keep-size" ), aStringVal );
    }

    /**
     * Get value of attribute "table:has-persistent-data".
     */
    public Boolean getHasPersistentData()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "has-persistent-data" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:has-persistent-data".
     */
    public void setHasPersistentData( Boolean _aHasPersistentData )
    {                    
        String aStringVal = OdfBoolean.toString( _aHasPersistentData );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "has-persistent-data" ), aStringVal );
    }

    /**
     * Get value of attribute "table:orientation".
     */
    public OdfOrientationType getOrientation()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "orientation" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "row";
        }

        return OdfOrientationType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:orientation".
     */
    public void setOrientation( OdfOrientationType _aOrientation )
    {                    
        String aStringVal = OdfOrientationType.toString( _aOrientation );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "orientation" ), aStringVal );
    }

    /**
     * Get value of attribute "table:contains-header".
     */
    public Boolean getContainsHeader()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "contains-header" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:contains-header".
     */
    public void setContainsHeader( Boolean _aContainsHeader )
    {                    
        String aStringVal = OdfBoolean.toString( _aContainsHeader );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "contains-header" ), aStringVal );
    }

    /**
     * Get value of attribute "table:display-filter-buttons".
     */
    public Boolean getDisplayFilterButtons()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "display-filter-buttons" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:display-filter-buttons".
     */
    public void setDisplayFilterButtons( Boolean _aDisplayFilterButtons )
    {                    
        String aStringVal = OdfBoolean.toString( _aDisplayFilterButtons );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "display-filter-buttons" ), aStringVal );
    }

    /**
     * Get value of attribute "table:target-range-address".
     */
    public String getTargetRangeAddress()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "target-range-address" ) );
    }

    /**
     * Set value of attribute "table:target-range-address".
     */
    public void setTargetRangeAddress( String _aTargetRangeAddress )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "target-range-address" ), _aTargetRangeAddress );
    }

    /**
     * Get value of attribute "table:refresh-delay".
     */
    public Boolean getRefreshDelay()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "refresh-delay" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:refresh-delay".
     */
    public void setRefreshDelay( Boolean _aRefreshDelay )
    {                    
        String aStringVal = OdfBoolean.toString( _aRefreshDelay );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "refresh-delay" ), aStringVal );
    }

}

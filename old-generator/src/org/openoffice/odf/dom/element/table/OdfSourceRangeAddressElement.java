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


/**
 * ODF DOM Element implementation for element "<table:source-range-address>".
 */
public abstract class OdfSourceRangeAddressElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "source-range-address" );

    public OdfSourceRangeAddressElement( OdfFileDom _aOwnerDoc )
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
    public void init(Integer _aColumn, Integer _aRow, Integer _aTable, Integer _aStartColumn, Integer _aStartRow, Integer _aStartTable, Integer _aEndColumn, Integer _aEndRow, Integer _aEndTable)
    {
        setColumn( _aColumn );
        setRow( _aRow );
        setTable( _aTable );
        setStartColumn( _aStartColumn );
        setStartRow( _aStartRow );
        setStartTable( _aStartTable );
        setEndColumn( _aEndColumn );
        setEndRow( _aEndRow );
        setEndTable( _aEndTable );
    }

    /**
     * Get value of attribute "table:column".
     */
    public Integer getColumn()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "column" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:column".
     */
    public void setColumn( Integer _aColumn )
    {                    
        String aStringVal = Integer.toString( _aColumn );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "column" ), aStringVal );
    }

    /**
     * Get value of attribute "table:row".
     */
    public Integer getRow()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "row" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:row".
     */
    public void setRow( Integer _aRow )
    {                    
        String aStringVal = Integer.toString( _aRow );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "row" ), aStringVal );
    }

    /**
     * Get value of attribute "table:table".
     */
    public Integer getTable()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "table" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:table".
     */
    public void setTable( Integer _aTable )
    {                    
        String aStringVal = Integer.toString( _aTable );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "table" ), aStringVal );
    }

    /**
     * Get value of attribute "table:start-column".
     */
    public Integer getStartColumn()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "start-column" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:start-column".
     */
    public void setStartColumn( Integer _aStartColumn )
    {                    
        String aStringVal = Integer.toString( _aStartColumn );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "start-column" ), aStringVal );
    }

    /**
     * Get value of attribute "table:start-row".
     */
    public Integer getStartRow()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "start-row" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:start-row".
     */
    public void setStartRow( Integer _aStartRow )
    {                    
        String aStringVal = Integer.toString( _aStartRow );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "start-row" ), aStringVal );
    }

    /**
     * Get value of attribute "table:start-table".
     */
    public Integer getStartTable()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "start-table" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:start-table".
     */
    public void setStartTable( Integer _aStartTable )
    {                    
        String aStringVal = Integer.toString( _aStartTable );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "start-table" ), aStringVal );
    }

    /**
     * Get value of attribute "table:end-column".
     */
    public Integer getEndColumn()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-column" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:end-column".
     */
    public void setEndColumn( Integer _aEndColumn )
    {                    
        String aStringVal = Integer.toString( _aEndColumn );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-column" ), aStringVal );
    }

    /**
     * Get value of attribute "table:end-row".
     */
    public Integer getEndRow()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-row" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:end-row".
     */
    public void setEndRow( Integer _aEndRow )
    {                    
        String aStringVal = Integer.toString( _aEndRow );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-row" ), aStringVal );
    }

    /**
     * Get value of attribute "table:end-table".
     */
    public Integer getEndTable()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-table" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:end-table".
     */
    public void setEndTable( Integer _aEndTable )
    {                    
        String aStringVal = Integer.toString( _aEndTable );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-table" ), aStringVal );
    }

}

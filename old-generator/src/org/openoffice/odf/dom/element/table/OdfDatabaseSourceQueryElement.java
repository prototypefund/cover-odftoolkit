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
 * ODF DOM Element implementation for element "<table:database-source-query>".
 */
public abstract class OdfDatabaseSourceQueryElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "database-source-query" );

    public OdfDatabaseSourceQueryElement( OdfFileDom _aOwnerDoc )
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
    public void init(String _aDatabaseName, String _aQueryName)
    {
        setDatabaseName( _aDatabaseName );
        setQueryName( _aQueryName );
    }

    /**
     * Get value of attribute "table:database-name".
     */
    public String getDatabaseName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "database-name" ) );
    }

    /**
     * Set value of attribute "table:database-name".
     */
    public void setDatabaseName( String _aDatabaseName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "database-name" ), _aDatabaseName );
    }

    /**
     * Get value of attribute "table:query-name".
     */
    public String getQueryName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "query-name" ) );
    }

    /**
     * Set value of attribute "table:query-name".
     */
    public void setQueryName( String _aQueryName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "query-name" ), _aQueryName );
    }

}

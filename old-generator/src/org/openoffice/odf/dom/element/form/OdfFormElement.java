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

package org.openoffice.odf.dom.element.form;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.OdfAnyURI;
import org.openoffice.odf.dom.type.office.OdfTargetFrameNameType;
import org.openoffice.odf.dom.type.OdfBoolean;
import org.openoffice.odf.dom.type.form.OdfCommandType;
import org.openoffice.odf.dom.type.form.OdfNavigationModeType;
import org.openoffice.odf.dom.type.form.OdfTabCycleType;


/**
 * ODF DOM Element implementation for element "<form:form>".
 */
public abstract class OdfFormElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.FORM, "form" );

    public OdfFormElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "form:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "name" ) );
    }

    /**
     * Set value of attribute "form:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "name" ), _aName );
    }

    /**
     * Get value of attribute "form:control-implementation".
     */
    public String getControlImplementation()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "control-implementation" ) );
    }

    /**
     * Set value of attribute "form:control-implementation".
     */
    public void setControlImplementation( String _aControlImplementation )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "control-implementation" ), _aControlImplementation );
    }

    /**
     * Get value of attribute "xlink:href".
     */
    public String getHref()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xlink:href".
     */
    public void setHref( String _aHref )
    {                    
        String aStringVal = OdfAnyURI.toString( _aHref );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ), aStringVal );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "type" ), "simple" );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "actuate" ), "onRequest" );
    }

    /**
     * Get value of attribute "office:target-frame".
     */
    public OdfTargetFrameNameType getTargetFrame()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "target-frame" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "_blank";
        }

        return OdfTargetFrameNameType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:target-frame".
     */
    public void setTargetFrame( OdfTargetFrameNameType _aTargetFrame )
    {                    
        String aStringVal = OdfTargetFrameNameType.toString( _aTargetFrame );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "target-frame" ), aStringVal );
    }

    /**
     * Get value of attribute "form:method".
     */
    public String getMethod()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "method" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "get";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:method".
     */
    public void setMethod( String _aMethod )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "method" ), _aMethod );
    }

    /**
     * Get value of attribute "form:enctype".
     */
    public String getEnctype()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "enctype" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "application/x-www-form-urlencoded";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:enctype".
     */
    public void setEnctype( String _aEnctype )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "enctype" ), _aEnctype );
    }

    /**
     * Get value of attribute "form:allow-deletes".
     */
    public Boolean getAllowDeletes()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "allow-deletes" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:allow-deletes".
     */
    public void setAllowDeletes( Boolean _aAllowDeletes )
    {                    
        String aStringVal = OdfBoolean.toString( _aAllowDeletes );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "allow-deletes" ), aStringVal );
    }

    /**
     * Get value of attribute "form:allow-inserts".
     */
    public Boolean getAllowInserts()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "allow-inserts" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:allow-inserts".
     */
    public void setAllowInserts( Boolean _aAllowInserts )
    {                    
        String aStringVal = OdfBoolean.toString( _aAllowInserts );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "allow-inserts" ), aStringVal );
    }

    /**
     * Get value of attribute "form:allow-updates".
     */
    public Boolean getAllowUpdates()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "allow-updates" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:allow-updates".
     */
    public void setAllowUpdates( Boolean _aAllowUpdates )
    {                    
        String aStringVal = OdfBoolean.toString( _aAllowUpdates );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "allow-updates" ), aStringVal );
    }

    /**
     * Get value of attribute "form:apply-filter".
     */
    public Boolean getApplyFilter()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "apply-filter" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:apply-filter".
     */
    public void setApplyFilter( Boolean _aApplyFilter )
    {                    
        String aStringVal = OdfBoolean.toString( _aApplyFilter );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "apply-filter" ), aStringVal );
    }

    /**
     * Get value of attribute "form:command-type".
     */
    public OdfCommandType getCommandType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "command-type" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "command";
        }

        return OdfCommandType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:command-type".
     */
    public void setCommandType( OdfCommandType _aCommandType )
    {                    
        String aStringVal = OdfCommandType.toString( _aCommandType );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "command-type" ), aStringVal );
    }

    /**
     * Get value of attribute "form:command".
     */
    public String getCommand()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "command" ) );
    }

    /**
     * Set value of attribute "form:command".
     */
    public void setCommand( String _aCommand )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "command" ), _aCommand );
    }

    /**
     * Get value of attribute "form:datasource".
     */
    public String getDatasource()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "datasource" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:datasource".
     */
    public void setDatasource( String _aDatasource )
    {                    
        String aStringVal = OdfAnyURI.toString( _aDatasource );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "datasource" ), aStringVal );
    }

    /**
     * Get value of attribute "form:master-fields".
     */
    public String getMasterFields()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "master-fields" ) );
    }

    /**
     * Set value of attribute "form:master-fields".
     */
    public void setMasterFields( String _aMasterFields )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "master-fields" ), _aMasterFields );
    }

    /**
     * Get value of attribute "form:detail-fields".
     */
    public String getDetailFields()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "detail-fields" ) );
    }

    /**
     * Set value of attribute "form:detail-fields".
     */
    public void setDetailFields( String _aDetailFields )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "detail-fields" ), _aDetailFields );
    }

    /**
     * Get value of attribute "form:escape-processing".
     */
    public Boolean getEscapeProcessing()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "escape-processing" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:escape-processing".
     */
    public void setEscapeProcessing( Boolean _aEscapeProcessing )
    {                    
        String aStringVal = OdfBoolean.toString( _aEscapeProcessing );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "escape-processing" ), aStringVal );
    }

    /**
     * Get value of attribute "form:filter".
     */
    public String getFilter()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "filter" ) );
    }

    /**
     * Set value of attribute "form:filter".
     */
    public void setFilter( String _aFilter )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "filter" ), _aFilter );
    }

    /**
     * Get value of attribute "form:ignore-result".
     */
    public Boolean getIgnoreResult()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "ignore-result" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:ignore-result".
     */
    public void setIgnoreResult( Boolean _aIgnoreResult )
    {                    
        String aStringVal = OdfBoolean.toString( _aIgnoreResult );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "ignore-result" ), aStringVal );
    }

    /**
     * Get value of attribute "form:navigation-mode".
     */
    public OdfNavigationModeType getNavigationMode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "navigation-mode" ) );
        return OdfNavigationModeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:navigation-mode".
     */
    public void setNavigationMode( OdfNavigationModeType _aNavigationMode )
    {                    
        String aStringVal = OdfNavigationModeType.toString( _aNavigationMode );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "navigation-mode" ), aStringVal );
    }

    /**
     * Get value of attribute "form:order".
     */
    public String getOrder()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.FORM, "order" ) );
    }

    /**
     * Set value of attribute "form:order".
     */
    public void setOrder( String _aOrder )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "order" ), _aOrder );
    }

    /**
     * Get value of attribute "form:tab-cycle".
     */
    public OdfTabCycleType getTabCycle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-cycle" ) );
        return OdfTabCycleType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "form:tab-cycle".
     */
    public void setTabCycle( OdfTabCycleType _aTabCycle )
    {                    
        String aStringVal = OdfTabCycleType.toString( _aTabCycle );
        setOdfAttribute( OdfName.get( OdfNamespace.FORM, "tab-cycle" ), aStringVal );
    }

}

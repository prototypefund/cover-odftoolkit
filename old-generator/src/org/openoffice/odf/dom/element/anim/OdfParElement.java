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

package org.openoffice.odf.dom.element.anim;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.presentation.OdfNodeType;
import org.openoffice.odf.dom.type.presentation.OdfPresetClassType;
import org.openoffice.odf.dom.type.OdfId;
import org.openoffice.odf.dom.type.OdfNonNegativeInteger;
import org.openoffice.odf.dom.type.smil.OdfRestartType;
import org.openoffice.odf.dom.type.smil.OdfRestartdefaultType;
import org.openoffice.odf.dom.type.smil.OdfFillType;
import org.openoffice.odf.dom.type.smil.OdfFilldefaultType;
import org.openoffice.odf.dom.type.OdfBoolean;
import org.openoffice.odf.dom.type.smil.OdfEndsyncType;


/**
 * ODF DOM Element implementation for element "<anim:par>".
 */
public abstract class OdfParElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.ANIM, "par" );

    public OdfParElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "presentation:node-type".
     */
    public OdfNodeType getPresentationNode()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "node-type" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "default";
        }

        return OdfNodeType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:node-type".
     */
    public void setPresentationNode( OdfNodeType _aPresentationNode )
    {                    
        String aStringVal = OdfNodeType.toString( _aPresentationNode );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "node-type" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:preset-id".
     */
    public String getPresetId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-id" ) );
    }

    /**
     * Set value of attribute "presentation:preset-id".
     */
    public void setPresetId( String _aPresetId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-id" ), _aPresetId );
    }

    /**
     * Get value of attribute "presentation:preset-sub-type".
     */
    public String getPresetSubType()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-sub-type" ) );
    }

    /**
     * Set value of attribute "presentation:preset-sub-type".
     */
    public void setPresetSubType( String _aPresetSubType )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-sub-type" ), _aPresetSubType );
    }

    /**
     * Get value of attribute "presentation:preset-class".
     */
    public OdfPresetClassType getPresetClass()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-class" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "custom";
        }

        return OdfPresetClassType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:preset-class".
     */
    public void setPresetClass( OdfPresetClassType _aPresetClass )
    {                    
        String aStringVal = OdfPresetClassType.toString( _aPresetClass );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "preset-class" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:master-element".
     */
    public String getMasterElement()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "master-element" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:master-element".
     */
    public void setMasterElement( String _aMasterElement )
    {                    
        String aStringVal = OdfId.toString( _aMasterElement );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "master-element" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:group-id".
     */
    public String getGroupId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "group-id" ) );
    }

    /**
     * Set value of attribute "presentation:group-id".
     */
    public void setGroupId( String _aGroupId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "group-id" ), _aGroupId );
    }

    /**
     * Get value of attribute "anim:id".
     */
    public String getId()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.ANIM, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "anim:id".
     */
    public void setId( String _aId )
    {                    
        String aStringVal = OdfId.toString( _aId );
        setOdfAttribute( OdfName.get( OdfNamespace.ANIM, "id" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:begin".
     */
    public String getBegin()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "begin" ) );
    }

    /**
     * Set value of attribute "smil:begin".
     */
    public void setBegin( String _aBegin )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "begin" ), _aBegin );
    }

    /**
     * Get value of attribute "smil:end".
     */
    public String getEnd()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "end" ) );
    }

    /**
     * Set value of attribute "smil:end".
     */
    public void setEnd( String _aEnd )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "end" ), _aEnd );
    }

    /**
     * Get value of attribute "smil:dur".
     */
    public String getDur()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "dur" ) );
    }

    /**
     * Set value of attribute "smil:dur".
     */
    public void setDur( String _aDur )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "dur" ), _aDur );
    }

    /**
     * Get value of attribute "smil:repeatDur".
     */
    public String getRepeatdur()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatDur" ) );
    }

    /**
     * Set value of attribute "smil:repeatDur".
     */
    public void setRepeatdur( String _aRepeatdur )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatDur" ), _aRepeatdur );
    }

    /**
     * Get value of attribute "smil:repeatCount".
     */
    public Integer getRepeatcount()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatCount" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:repeatCount".
     */
    public void setRepeatcount( Integer _aRepeatcount )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aRepeatcount );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "repeatCount" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:restart".
     */
    public OdfRestartType getRestart()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restart" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "default";
        }

        return OdfRestartType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:restart".
     */
    public void setRestart( OdfRestartType _aRestart )
    {                    
        String aStringVal = OdfRestartType.toString( _aRestart );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restart" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:restartDefault".
     */
    public OdfRestartdefaultType getRestartdefault()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restartDefault" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "inherit";
        }

        return OdfRestartdefaultType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:restartDefault".
     */
    public void setRestartdefault( OdfRestartdefaultType _aRestartdefault )
    {                    
        String aStringVal = OdfRestartdefaultType.toString( _aRestartdefault );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "restartDefault" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:fill".
     */
    public OdfFillType getFill()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fill" ) );
        return OdfFillType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:fill".
     */
    public void setFill( OdfFillType _aFill )
    {                    
        String aStringVal = OdfFillType.toString( _aFill );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fill" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:fillDefault".
     */
    public OdfFilldefaultType getFilldefault()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fillDefault" ) );
        return OdfFilldefaultType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:fillDefault".
     */
    public void setFilldefault( OdfFilldefaultType _aFilldefault )
    {                    
        String aStringVal = OdfFilldefaultType.toString( _aFilldefault );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "fillDefault" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:accelerate".
     */
    public Double getAccelerate()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "accelerate" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "0.0";
        }

        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:accelerate".
     */
    public void setAccelerate( Double _aAccelerate )
    {                    
        String aStringVal = Double.toString( _aAccelerate );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "accelerate" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:decelerate".
     */
    public Double getDecelerate()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "decelerate" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "0.0";
        }

        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:decelerate".
     */
    public void setDecelerate( Double _aDecelerate )
    {                    
        String aStringVal = Double.toString( _aDecelerate );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "decelerate" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:autoReverse".
     */
    public Boolean getAutoreverse()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "autoReverse" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:autoReverse".
     */
    public void setAutoreverse( Boolean _aAutoreverse )
    {                    
        String aStringVal = OdfBoolean.toString( _aAutoreverse );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "autoReverse" ), aStringVal );
    }

    /**
     * Get value of attribute "smil:endsync".
     */
    public OdfEndsyncType getEndsync()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.SMIL, "endsync" ) );
        return OdfEndsyncType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "smil:endsync".
     */
    public void setEndsync( OdfEndsyncType _aEndsync )
    {                    
        String aStringVal = OdfEndsyncType.toString( _aEndsync );
        setOdfAttribute( OdfName.get( OdfNamespace.SMIL, "endsync" ), aStringVal );
    }

}

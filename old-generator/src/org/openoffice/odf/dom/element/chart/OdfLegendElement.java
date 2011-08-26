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

package org.openoffice.odf.dom.element.chart;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.style.OdfStyleFamily;
import org.openoffice.odf.dom.element.OdfStylableElement;
import org.openoffice.odf.dom.type.chart.OdfLegendPositionType;
import org.openoffice.odf.dom.type.chart.OdfLegendAlignType;
import org.openoffice.odf.dom.type.style.OdfLegendExpansionType;
import org.openoffice.odf.dom.type.OdfStyleName;


/**
 * ODF DOM Element implementation for element "<chart:legend>".
 */
public abstract class OdfLegendElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.CHART, "legend" );

    public OdfLegendElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.Chart, OdfName.get( OdfNamespace.CHART, "style-name" ) );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(OdfLegendPositionType _aLegendPosition, OdfLegendExpansionType _aLegendExpansion, Double _aLegendExpansionAspectRatio)
    {
        setLegendPosition( _aLegendPosition );
        setLegendExpansion( _aLegendExpansion );
        setLegendExpansionAspectRatio( _aLegendExpansionAspectRatio );
    }

    /**
     * Get value of attribute "chart:legend-position".
     */
    public OdfLegendPositionType getLegendPosition()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.CHART, "legend-position" ) );
        return OdfLegendPositionType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "chart:legend-position".
     */
    public void setLegendPosition( OdfLegendPositionType _aLegendPosition )
    {                    
        String aStringVal = OdfLegendPositionType.toString( _aLegendPosition );
        setOdfAttribute( OdfName.get( OdfNamespace.CHART, "legend-position" ), aStringVal );
    }

    /**
     * Get value of attribute "chart:legend-align".
     */
    public OdfLegendAlignType getLegendAlign()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.CHART, "legend-align" ) );
        return OdfLegendAlignType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "chart:legend-align".
     */
    public void setLegendAlign( OdfLegendAlignType _aLegendAlign )
    {                    
        String aStringVal = OdfLegendAlignType.toString( _aLegendAlign );
        setOdfAttribute( OdfName.get( OdfNamespace.CHART, "legend-align" ), aStringVal );
    }

    /**
     * Get value of attribute "svg:x".
     */
    public String getX()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ) );
    }

    /**
     * Set value of attribute "svg:x".
     */
    public void setX( String _aX )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "x" ), _aX );
    }

    /**
     * Get value of attribute "svg:y".
     */
    public String getY()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ) );
    }

    /**
     * Set value of attribute "svg:y".
     */
    public void setY( String _aY )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.SVG, "y" ), _aY );
    }

    /**
     * Get value of attribute "style:legend-expansion".
     */
    public OdfLegendExpansionType getLegendExpansion()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "legend-expansion" ) );
        return OdfLegendExpansionType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:legend-expansion".
     */
    public void setLegendExpansion( OdfLegendExpansionType _aLegendExpansion )
    {                    
        String aStringVal = OdfLegendExpansionType.toString( _aLegendExpansion );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "legend-expansion" ), aStringVal );
    }

    /**
     * Get value of attribute "style:legend-expansion-aspect-ratio".
     */
    public Double getLegendExpansionAspectRatio()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "legend-expansion-aspect-ratio" ) );
        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:legend-expansion-aspect-ratio".
     */
    public void setLegendExpansionAspectRatio( Double _aLegendExpansionAspectRatio )
    {                    
        String aStringVal = Double.toString( _aLegendExpansionAspectRatio );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "legend-expansion-aspect-ratio" ), aStringVal );
    }

    /**
     * Get value of attribute "chart:style-name".
     */
    public String getStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.CHART, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "chart:style-name".
     */
    public void setStyleName( String _aStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.CHART, "style-name" ), aStringVal );
    }

}

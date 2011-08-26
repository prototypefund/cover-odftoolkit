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
package org.openoffice.odf.dom.type.presentation;

public enum OdfTransitionStyleType
{
              MOVE_FROM_LOWERLEFT( "move-from-lowerleft" ), SPIRALIN_RIGHT( "spiralin-right" ), CLOCKWISE( "clockwise" ), WAVYLINE_FROM_LEFT( "wavyline-from-left" ), STRETCH_FROM_RIGHT( "stretch-from-right" ), MOVE_FROM_UPPERRIGHT( "move-from-upperright" ), FADE_FROM_LEFT( "fade-from-left" ), UNCOVER_TO_RIGHT( "uncover-to-right" ), MOVE_FROM_BOTTOM( "move-from-bottom" ), CLOSE( "close" ), MOVE_FROM_LEFT( "move-from-left" ), OPEN( "open" ), MOVE_FROM_RIGHT( "move-from-right" ), CLOSE_HORIZONTAL( "close-horizontal" ), ROLL_FROM_LEFT( "roll-from-left" ), FADE_FROM_RIGHT( "fade-from-right" ), UNCOVER_TO_UPPERLEFT( "uncover-to-upperleft" ), NONE( "none" ), ROLL_FROM_TOP( "roll-from-top" ), UNCOVER_TO_BOTTOM( "uncover-to-bottom" ), VERTICAL_CHECKERBOARD( "vertical-checkerboard" ), UNCOVER_TO_LOWERLEFT( "uncover-to-lowerleft" ), FADE_FROM_TOP( "fade-from-top" ), FLY_AWAY( "fly-away" ), INTERLOCKING_HORIZONTAL_LEFT( "interlocking-horizontal-left" ), RANDOM( "random" ), MOVE_FROM_UPPERLEFT( "move-from-upperleft" ), HORIZONTAL_CHECKERBOARD( "horizontal-checkerboard" ), FADE_FROM_UPPERRIGHT( "fade-from-upperright" ), SPIRALOUT_LEFT( "spiralout-left" ), WAVYLINE_FROM_BOTTOM( "wavyline-from-bottom" ), WAVYLINE_FROM_TOP( "wavyline-from-top" ), STRETCH_FROM_BOTTOM( "stretch-from-bottom" ), CLOSE_VERTICAL( "close-vertical" ), STRETCH_FROM_TOP( "stretch-from-top" ), DISSOLVE( "dissolve" ), HORIZONTAL_LINES( "horizontal-lines" ), FADE_FROM_LOWERRIGHT( "fade-from-lowerright" ), FADE_FROM_BOTTOM( "fade-from-bottom" ), UNCOVER_TO_TOP( "uncover-to-top" ), HORIZONTAL_STRIPES( "horizontal-stripes" ), SPIRALIN_LEFT( "spiralin-left" ), FADE_FROM_LOWERLEFT( "fade-from-lowerleft" ), UNCOVER_TO_LOWERRIGHT( "uncover-to-lowerright" ), ROLL_FROM_RIGHT( "roll-from-right" ), OPEN_VERTICAL( "open-vertical" ), INTERLOCKING_HORIZONTAL_RIGHT( "interlocking-horizontal-right" ), WAVYLINE_FROM_RIGHT( "wavyline-from-right" ), INTERLOCKING_VERTICAL_TOP( "interlocking-vertical-top" ), STRETCH_FROM_LEFT( "stretch-from-left" ), SPIRALOUT_RIGHT( "spiralout-right" ), VERTICAL_LINES( "vertical-lines" ), MELT( "melt" ), MOVE_FROM_LOWERRIGHT( "move-from-lowerright" ), UNCOVER_TO_UPPERRIGHT( "uncover-to-upperright" ), FADE_FROM_CENTER( "fade-from-center" ), MOVE_FROM_TOP( "move-from-top" ), COUNTERCLOCKWISE( "counterclockwise" ), ROLL_FROM_BOTTOM( "roll-from-bottom" ), UNCOVER_TO_LEFT( "uncover-to-left" ), FADE_FROM_UPPERLEFT( "fade-from-upperleft" ), OPEN_HORIZONTAL( "open-horizontal" ), FADE_TO_CENTER( "fade-to-center" ), INTERLOCKING_VERTICAL_BOTTOM( "interlocking-vertical-bottom" ), VERTICAL_STRIPES( "vertical-stripes" );

    private String m_aValue;

    OdfTransitionStyleType( String _aValue )
    {
        m_aValue = _aValue;
    }

    public String toString()
    {
        return m_aValue;
    }

    public static String toString( OdfTransitionStyleType _aEnum )
    {
        return _aEnum.toString();
    }

    public static OdfTransitionStyleType enumValueOf( String _aString )
    {
        for( OdfTransitionStyleType aIter : values() )
        {
            if( _aString.equals( aIter.toString() ) )
            {
                return aIter;
            }
        }
        return null;
    }

}

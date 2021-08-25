/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.fo.FoHeightAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoTextAlignAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleFontNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleVerticalPosAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleVerticalRelAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgYAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextListLevelPositionAndSpaceModeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextMinLabelDistanceAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextMinLabelWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextSpaceBeforeAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;
import org.odftoolkit.odfdom.dom.style.props.OdfStylePropertiesSet;
import org.odftoolkit.odfdom.dom.style.props.OdfStyleProperty;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element style:list-level-properties}. */
public class StyleListLevelPropertiesElement extends OdfStylePropertiesBase {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.STYLE, "list-level-properties");

  /**
   * Create the instance of <code>StyleListLevelPropertiesElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public StyleListLevelPropertiesElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element
   *     style:list-level-properties}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  public static final OdfStyleProperty Height =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.ListLevelProperties,
          OdfName.newName(OdfDocumentNamespace.FO, "height"));

  public static final OdfStyleProperty TextAlign =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.ListLevelProperties,
          OdfName.newName(OdfDocumentNamespace.FO, "text-align"));

  public static final OdfStyleProperty Width =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.ListLevelProperties,
          OdfName.newName(OdfDocumentNamespace.FO, "width"));

  public static final OdfStyleProperty FontName =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.ListLevelProperties,
          OdfName.newName(OdfDocumentNamespace.STYLE, "font-name"));

  public static final OdfStyleProperty VerticalPos =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.ListLevelProperties,
          OdfName.newName(OdfDocumentNamespace.STYLE, "vertical-pos"));

  public static final OdfStyleProperty VerticalRel =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.ListLevelProperties,
          OdfName.newName(OdfDocumentNamespace.STYLE, "vertical-rel"));

  public static final OdfStyleProperty Y =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.ListLevelProperties,
          OdfName.newName(OdfDocumentNamespace.SVG, "y"));

  public static final OdfStyleProperty ListLevelPositionAndSpaceMode =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.ListLevelProperties,
          OdfName.newName(OdfDocumentNamespace.TEXT, "list-level-position-and-space-mode"));

  public static final OdfStyleProperty MinLabelDistance =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.ListLevelProperties,
          OdfName.newName(OdfDocumentNamespace.TEXT, "min-label-distance"));

  public static final OdfStyleProperty MinLabelWidth =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.ListLevelProperties,
          OdfName.newName(OdfDocumentNamespace.TEXT, "min-label-width"));

  public static final OdfStyleProperty SpaceBefore =
      OdfStyleProperty.get(
          OdfStylePropertiesSet.ListLevelProperties,
          OdfName.newName(OdfDocumentNamespace.TEXT, "space-before"));

  /**
   * Receives the value of the ODFDOM attribute representation <code>FoHeightAttribute</code> , See
   * {@odf.attribute fo:height}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFoHeightAttribute() {
    FoHeightAttribute attr = (FoHeightAttribute) getOdfAttribute(OdfDocumentNamespace.FO, "height");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FoHeightAttribute</code> , See
   * {@odf.attribute fo:height}
   *
   * @param foHeightValue The type is <code>String</code>
   */
  public void setFoHeightAttribute(String foHeightValue) {
    FoHeightAttribute attr = new FoHeightAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(foHeightValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FoTextAlignAttribute</code> ,
   * See {@odf.attribute fo:text-align}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFoTextAlignAttribute() {
    FoTextAlignAttribute attr =
        (FoTextAlignAttribute) getOdfAttribute(OdfDocumentNamespace.FO, "text-align");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FoTextAlignAttribute</code> , See
   * {@odf.attribute fo:text-align}
   *
   * @param foTextAlignValue The type is <code>String</code>
   */
  public void setFoTextAlignAttribute(String foTextAlignValue) {
    FoTextAlignAttribute attr = new FoTextAlignAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(foTextAlignValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FoWidthAttribute</code> , See
   * {@odf.attribute fo:width}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getFoWidthAttribute() {
    FoWidthAttribute attr = (FoWidthAttribute) getOdfAttribute(OdfDocumentNamespace.FO, "width");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FoWidthAttribute</code> , See
   * {@odf.attribute fo:width}
   *
   * @param foWidthValue The type is <code>String</code>
   */
  public void setFoWidthAttribute(String foWidthValue) {
    FoWidthAttribute attr = new FoWidthAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(foWidthValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleFontNameAttribute</code> ,
   * See {@odf.attribute style:font-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleFontNameAttribute() {
    StyleFontNameAttribute attr =
        (StyleFontNameAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "font-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleFontNameAttribute</code> , See
   * {@odf.attribute style:font-name}
   *
   * @param styleFontNameValue The type is <code>String</code>
   */
  public void setStyleFontNameAttribute(String styleFontNameValue) {
    StyleFontNameAttribute attr = new StyleFontNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleFontNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleVerticalPosAttribute
   * </code> , See {@odf.attribute style:vertical-pos}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleVerticalPosAttribute() {
    StyleVerticalPosAttribute attr =
        (StyleVerticalPosAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "vertical-pos");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleVerticalPosAttribute</code> , See
   * {@odf.attribute style:vertical-pos}
   *
   * @param styleVerticalPosValue The type is <code>String</code>
   */
  public void setStyleVerticalPosAttribute(String styleVerticalPosValue) {
    StyleVerticalPosAttribute attr = new StyleVerticalPosAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleVerticalPosValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleVerticalRelAttribute
   * </code> , See {@odf.attribute style:vertical-rel}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleVerticalRelAttribute() {
    StyleVerticalRelAttribute attr =
        (StyleVerticalRelAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "vertical-rel");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleVerticalRelAttribute</code> , See
   * {@odf.attribute style:vertical-rel}
   *
   * @param styleVerticalRelValue The type is <code>String</code>
   */
  public void setStyleVerticalRelAttribute(String styleVerticalRelValue) {
    StyleVerticalRelAttribute attr = new StyleVerticalRelAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleVerticalRelValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>SvgYAttribute</code> , See
   * {@odf.attribute svg:y}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getSvgYAttribute() {
    SvgYAttribute attr = (SvgYAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "y");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>SvgYAttribute</code> , See
   * {@odf.attribute svg:y}
   *
   * @param svgYValue The type is <code>String</code>
   */
  public void setSvgYAttribute(String svgYValue) {
    SvgYAttribute attr = new SvgYAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(svgYValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * TextListLevelPositionAndSpaceModeAttribute</code> , See {@odf.attribute
   * text:list-level-position-and-space-mode}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextListLevelPositionAndSpaceModeAttribute() {
    TextListLevelPositionAndSpaceModeAttribute attr =
        (TextListLevelPositionAndSpaceModeAttribute)
            getOdfAttribute(OdfDocumentNamespace.TEXT, "list-level-position-and-space-mode");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>
   * TextListLevelPositionAndSpaceModeAttribute</code> , See {@odf.attribute
   * text:list-level-position-and-space-mode}
   *
   * @param textListLevelPositionAndSpaceModeValue The type is <code>String</code>
   */
  public void setTextListLevelPositionAndSpaceModeAttribute(
      String textListLevelPositionAndSpaceModeValue) {
    TextListLevelPositionAndSpaceModeAttribute attr =
        new TextListLevelPositionAndSpaceModeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textListLevelPositionAndSpaceModeValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextMinLabelDistanceAttribute
   * </code> , See {@odf.attribute text:min-label-distance}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextMinLabelDistanceAttribute() {
    TextMinLabelDistanceAttribute attr =
        (TextMinLabelDistanceAttribute)
            getOdfAttribute(OdfDocumentNamespace.TEXT, "min-label-distance");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextMinLabelDistanceAttribute</code> ,
   * See {@odf.attribute text:min-label-distance}
   *
   * @param textMinLabelDistanceValue The type is <code>String</code>
   */
  public void setTextMinLabelDistanceAttribute(String textMinLabelDistanceValue) {
    TextMinLabelDistanceAttribute attr =
        new TextMinLabelDistanceAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textMinLabelDistanceValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextMinLabelWidthAttribute
   * </code> , See {@odf.attribute text:min-label-width}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextMinLabelWidthAttribute() {
    TextMinLabelWidthAttribute attr =
        (TextMinLabelWidthAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "min-label-width");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextMinLabelWidthAttribute</code> , See
   * {@odf.attribute text:min-label-width}
   *
   * @param textMinLabelWidthValue The type is <code>String</code>
   */
  public void setTextMinLabelWidthAttribute(String textMinLabelWidthValue) {
    TextMinLabelWidthAttribute attr =
        new TextMinLabelWidthAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textMinLabelWidthValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextSpaceBeforeAttribute</code>
   * , See {@odf.attribute text:space-before}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextSpaceBeforeAttribute() {
    TextSpaceBeforeAttribute attr =
        (TextSpaceBeforeAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "space-before");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextSpaceBeforeAttribute</code> , See
   * {@odf.attribute text:space-before}
   *
   * @param textSpaceBeforeValue The type is <code>String</code>
   */
  public void setTextSpaceBeforeAttribute(String textSpaceBeforeValue) {
    TextSpaceBeforeAttribute attr = new TextSpaceBeforeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textSpaceBeforeValue);
  }

  /**
   * Create child element {@odf.element style:list-level-label-alignment}.
   *
   * @param textLabelFollowedByValue the <code>String</code> value of <code>
   *     TextLabelFollowedByAttribute</code>, see {@odf.attribute text:label-followed-by} at
   *     specification
   * @return the element {@odf.element style:list-level-label-alignment}
   */
  public StyleListLevelLabelAlignmentElement newStyleListLevelLabelAlignmentElement(
      String textLabelFollowedByValue) {
    StyleListLevelLabelAlignmentElement styleListLevelLabelAlignment =
        ((OdfFileDom) this.ownerDocument).newOdfElement(StyleListLevelLabelAlignmentElement.class);
    styleListLevelLabelAlignment.setTextLabelFollowedByAttribute(textLabelFollowedByValue);
    this.appendChild(styleListLevelLabelAlignment);
    return styleListLevelLabelAlignment;
  }

  /**
   * Accept an visitor instance to allow the visitor to do some operations. Refer to visitor design
   * pattern to get a better understanding.
   *
   * @param visitor an instance of DefaultElementVisitor
   */
  @Override
  public void accept(ElementVisitor visitor) {
    if (visitor instanceof DefaultElementVisitor) {
      DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
      defaultVisitor.visit(this);
    } else {
      visitor.visit(this);
    }
  }
}

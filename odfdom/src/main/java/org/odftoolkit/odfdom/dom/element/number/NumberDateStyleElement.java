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
package org.odftoolkit.odfdom.dom.element.number;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.number.NumberAutomaticOrderAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberCountryAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberFormatSourceAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberLanguageAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberRfcLanguageTagAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberScriptAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberTransliterationCountryAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberTransliterationFormatAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberTransliterationLanguageAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberTransliterationStyleAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDisplayNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleVolatileAttribute;
import org.odftoolkit.odfdom.dom.element.style.StyleMapElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTextPropertiesElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element number:date-style}. */
public abstract class NumberDateStyleElement extends DataStyleElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.NUMBER, "date-style");

  /**
   * Create the instance of <code>NumberDateStyleElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public NumberDateStyleElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element number:date-style}.
   */
  @Override
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberAutomaticOrderAttribute
   * </code> , See {@odf.attribute number:automatic-order}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getNumberAutomaticOrderAttribute() {
    NumberAutomaticOrderAttribute attr =
        (NumberAutomaticOrderAttribute)
            getOdfAttribute(OdfDocumentNamespace.NUMBER, "automatic-order");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(NumberAutomaticOrderAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberAutomaticOrderAttribute</code> ,
   * See {@odf.attribute number:automatic-order}
   *
   * @param numberAutomaticOrderValue The type is <code>Boolean</code>
   */
  public void setNumberAutomaticOrderAttribute(Boolean numberAutomaticOrderValue) {
    NumberAutomaticOrderAttribute attr =
        new NumberAutomaticOrderAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(numberAutomaticOrderValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberCountryAttribute</code> ,
   * See {@odf.attribute number:country}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberCountryAttribute() {
    NumberCountryAttribute attr =
        (NumberCountryAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "country");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberCountryAttribute</code> , See
   * {@odf.attribute number:country}
   *
   * @param numberCountryValue The type is <code>String</code>
   */
  public void setNumberCountryAttribute(String numberCountryValue) {
    NumberCountryAttribute attr = new NumberCountryAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberCountryValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberFormatSourceAttribute
   * </code> , See {@odf.attribute number:format-source}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberFormatSourceAttribute() {
    NumberFormatSourceAttribute attr =
        (NumberFormatSourceAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "format-source");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return NumberFormatSourceAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberFormatSourceAttribute</code> ,
   * See {@odf.attribute number:format-source}
   *
   * @param numberFormatSourceValue The type is <code>String</code>
   */
  public void setNumberFormatSourceAttribute(String numberFormatSourceValue) {
    NumberFormatSourceAttribute attr =
        new NumberFormatSourceAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberFormatSourceValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberLanguageAttribute</code>
   * , See {@odf.attribute number:language}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberLanguageAttribute() {
    NumberLanguageAttribute attr =
        (NumberLanguageAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "language");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberLanguageAttribute</code> , See
   * {@odf.attribute number:language}
   *
   * @param numberLanguageValue The type is <code>String</code>
   */
  public void setNumberLanguageAttribute(String numberLanguageValue) {
    NumberLanguageAttribute attr = new NumberLanguageAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberLanguageValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberRfcLanguageTagAttribute
   * </code> , See {@odf.attribute number:rfc-language-tag}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberRfcLanguageTagAttribute() {
    NumberRfcLanguageTagAttribute attr =
        (NumberRfcLanguageTagAttribute)
            getOdfAttribute(OdfDocumentNamespace.NUMBER, "rfc-language-tag");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberRfcLanguageTagAttribute</code> ,
   * See {@odf.attribute number:rfc-language-tag}
   *
   * @param numberRfcLanguageTagValue The type is <code>String</code>
   */
  public void setNumberRfcLanguageTagAttribute(String numberRfcLanguageTagValue) {
    NumberRfcLanguageTagAttribute attr =
        new NumberRfcLanguageTagAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberRfcLanguageTagValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberScriptAttribute</code> ,
   * See {@odf.attribute number:script}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberScriptAttribute() {
    NumberScriptAttribute attr =
        (NumberScriptAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "script");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberScriptAttribute</code> , See
   * {@odf.attribute number:script}
   *
   * @param numberScriptValue The type is <code>String</code>
   */
  public void setNumberScriptAttribute(String numberScriptValue) {
    NumberScriptAttribute attr = new NumberScriptAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberScriptValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>NumberTitleAttribute</code> ,
   * See {@odf.attribute number:title}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberTitleAttribute() {
    NumberTitleAttribute attr =
        (NumberTitleAttribute) getOdfAttribute(OdfDocumentNamespace.NUMBER, "title");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberTitleAttribute</code> , See
   * {@odf.attribute number:title}
   *
   * @param numberTitleValue The type is <code>String</code>
   */
  public void setNumberTitleAttribute(String numberTitleValue) {
    NumberTitleAttribute attr = new NumberTitleAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberTitleValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * NumberTransliterationCountryAttribute</code> , See {@odf.attribute
   * number:transliteration-country}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberTransliterationCountryAttribute() {
    NumberTransliterationCountryAttribute attr =
        (NumberTransliterationCountryAttribute)
            getOdfAttribute(OdfDocumentNamespace.NUMBER, "transliteration-country");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberTransliterationCountryAttribute
   * </code> , See {@odf.attribute number:transliteration-country}
   *
   * @param numberTransliterationCountryValue The type is <code>String</code>
   */
  public void setNumberTransliterationCountryAttribute(String numberTransliterationCountryValue) {
    NumberTransliterationCountryAttribute attr =
        new NumberTransliterationCountryAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberTransliterationCountryValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * NumberTransliterationFormatAttribute</code> , See {@odf.attribute
   * number:transliteration-format}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberTransliterationFormatAttribute() {
    NumberTransliterationFormatAttribute attr =
        (NumberTransliterationFormatAttribute)
            getOdfAttribute(OdfDocumentNamespace.NUMBER, "transliteration-format");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return NumberTransliterationFormatAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberTransliterationFormatAttribute
   * </code> , See {@odf.attribute number:transliteration-format}
   *
   * @param numberTransliterationFormatValue The type is <code>String</code>
   */
  public void setNumberTransliterationFormatAttribute(String numberTransliterationFormatValue) {
    NumberTransliterationFormatAttribute attr =
        new NumberTransliterationFormatAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberTransliterationFormatValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * NumberTransliterationLanguageAttribute</code> , See {@odf.attribute
   * number:transliteration-language}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberTransliterationLanguageAttribute() {
    NumberTransliterationLanguageAttribute attr =
        (NumberTransliterationLanguageAttribute)
            getOdfAttribute(OdfDocumentNamespace.NUMBER, "transliteration-language");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberTransliterationLanguageAttribute
   * </code> , See {@odf.attribute number:transliteration-language}
   *
   * @param numberTransliterationLanguageValue The type is <code>String</code>
   */
  public void setNumberTransliterationLanguageAttribute(String numberTransliterationLanguageValue) {
    NumberTransliterationLanguageAttribute attr =
        new NumberTransliterationLanguageAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberTransliterationLanguageValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>
   * NumberTransliterationStyleAttribute</code> , See {@odf.attribute number:transliteration-style}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getNumberTransliterationStyleAttribute() {
    NumberTransliterationStyleAttribute attr =
        (NumberTransliterationStyleAttribute)
            getOdfAttribute(OdfDocumentNamespace.NUMBER, "transliteration-style");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return NumberTransliterationStyleAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>NumberTransliterationStyleAttribute
   * </code> , See {@odf.attribute number:transliteration-style}
   *
   * @param numberTransliterationStyleValue The type is <code>String</code>
   */
  public void setNumberTransliterationStyleAttribute(String numberTransliterationStyleValue) {
    NumberTransliterationStyleAttribute attr =
        new NumberTransliterationStyleAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(numberTransliterationStyleValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleDisplayNameAttribute
   * </code> , See {@odf.attribute style:display-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleDisplayNameAttribute() {
    StyleDisplayNameAttribute attr =
        (StyleDisplayNameAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "display-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleDisplayNameAttribute</code> , See
   * {@odf.attribute style:display-name}
   *
   * @param styleDisplayNameValue The type is <code>String</code>
   */
  public void setStyleDisplayNameAttribute(String styleDisplayNameValue) {
    StyleDisplayNameAttribute attr = new StyleDisplayNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleDisplayNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleNameAttribute</code> , See
   * {@odf.attribute style:name}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleNameAttribute() {
    StyleNameAttribute attr =
        (StyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleNameAttribute</code> , See
   * {@odf.attribute style:name}
   *
   * @param styleNameValue The type is <code>String</code>
   */
  public void setStyleNameAttribute(String styleNameValue) {
    StyleNameAttribute attr = new StyleNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleVolatileAttribute</code> ,
   * See {@odf.attribute style:volatile}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getStyleVolatileAttribute() {
    StyleVolatileAttribute attr =
        (StyleVolatileAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "volatile");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleVolatileAttribute</code> , See
   * {@odf.attribute style:volatile}
   *
   * @param styleVolatileValue The type is <code>Boolean</code>
   */
  public void setStyleVolatileAttribute(Boolean styleVolatileValue) {
    StyleVolatileAttribute attr = new StyleVolatileAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(styleVolatileValue.booleanValue());
  }

  /**
   * Create child element {@odf.element number:am-pm}.
   *
   * @return the element {@odf.element number:am-pm}
   */
  public NumberAmPmElement newNumberAmPmElement() {
    NumberAmPmElement numberAmPm =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberAmPmElement.class);
    this.appendChild(numberAmPm);
    return numberAmPm;
  }

  /**
   * Create child element {@odf.element number:day}.
   *
   * @return the element {@odf.element number:day}
   */
  public NumberDayElement newNumberDayElement() {
    NumberDayElement numberDay =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberDayElement.class);
    this.appendChild(numberDay);
    return numberDay;
  }

  /**
   * Create child element {@odf.element number:day-of-week}.
   *
   * @return the element {@odf.element number:day-of-week}
   */
  public NumberDayOfWeekElement newNumberDayOfWeekElement() {
    NumberDayOfWeekElement numberDayOfWeek =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberDayOfWeekElement.class);
    this.appendChild(numberDayOfWeek);
    return numberDayOfWeek;
  }

  /**
   * Create child element {@odf.element number:era}.
   *
   * @return the element {@odf.element number:era}
   */
  public NumberEraElement newNumberEraElement() {
    NumberEraElement numberEra =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberEraElement.class);
    this.appendChild(numberEra);
    return numberEra;
  }

  /**
   * Create child element {@odf.element number:hours}.
   *
   * @return the element {@odf.element number:hours}
   */
  public NumberHoursElement newNumberHoursElement() {
    NumberHoursElement numberHours =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberHoursElement.class);
    this.appendChild(numberHours);
    return numberHours;
  }

  /**
   * Create child element {@odf.element number:minutes}.
   *
   * @return the element {@odf.element number:minutes}
   */
  public NumberMinutesElement newNumberMinutesElement() {
    NumberMinutesElement numberMinutes =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberMinutesElement.class);
    this.appendChild(numberMinutes);
    return numberMinutes;
  }

  /**
   * Create child element {@odf.element number:month}.
   *
   * @return the element {@odf.element number:month}
   */
  public NumberMonthElement newNumberMonthElement() {
    NumberMonthElement numberMonth =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberMonthElement.class);
    this.appendChild(numberMonth);
    return numberMonth;
  }

  /**
   * Create child element {@odf.element number:quarter}.
   *
   * @return the element {@odf.element number:quarter}
   */
  public NumberQuarterElement newNumberQuarterElement() {
    NumberQuarterElement numberQuarter =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberQuarterElement.class);
    this.appendChild(numberQuarter);
    return numberQuarter;
  }

  /**
   * Create child element {@odf.element number:seconds}.
   *
   * @return the element {@odf.element number:seconds}
   */
  public NumberSecondsElement newNumberSecondsElement() {
    NumberSecondsElement numberSeconds =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberSecondsElement.class);
    this.appendChild(numberSeconds);
    return numberSeconds;
  }

  /**
   * Create child element {@odf.element number:text}.
   *
   * @return the element {@odf.element number:text}
   */
  public NumberTextElement newNumberTextElement() {
    NumberTextElement numberText =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberTextElement.class);
    this.appendChild(numberText);
    return numberText;
  }

  /**
   * Create child element {@odf.element number:week-of-year}.
   *
   * @return the element {@odf.element number:week-of-year}
   */
  public NumberWeekOfYearElement newNumberWeekOfYearElement() {
    NumberWeekOfYearElement numberWeekOfYear =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberWeekOfYearElement.class);
    this.appendChild(numberWeekOfYear);
    return numberWeekOfYear;
  }

  /**
   * Create child element {@odf.element number:year}.
   *
   * @return the element {@odf.element number:year}
   */
  public NumberYearElement newNumberYearElement() {
    NumberYearElement numberYear =
        ((OdfFileDom) this.ownerDocument).newOdfElement(NumberYearElement.class);
    this.appendChild(numberYear);
    return numberYear;
  }

  /**
   * Create child element {@odf.element style:map}.
   *
   * @param styleApplyStyleNameValue the <code>String</code> value of <code>
   *     StyleApplyStyleNameAttribute</code>, see {@odf.attribute style:apply-style-name} at
   *     specification
   * @param styleConditionValue the <code>String</code> value of <code>StyleConditionAttribute
   *     </code>, see {@odf.attribute style:condition} at specification
   * @return the element {@odf.element style:map}
   */
  public StyleMapElement newStyleMapElement(
      String styleApplyStyleNameValue, String styleConditionValue) {
    StyleMapElement styleMap =
        ((OdfFileDom) this.ownerDocument).newOdfElement(StyleMapElement.class);
    styleMap.setStyleApplyStyleNameAttribute(styleApplyStyleNameValue);
    styleMap.setStyleConditionAttribute(styleConditionValue);
    this.appendChild(styleMap);
    return styleMap;
  }

  /**
   * Create child element {@odf.element style:text-properties}.
   *
   * @param textDisplayValue the <code>String</code> value of <code>TextDisplayAttribute</code>, see
   *     {@odf.attribute text:display} at specification
   * @return the element {@odf.element style:text-properties}
   */
  public StyleTextPropertiesElement newStyleTextPropertiesElement(String textDisplayValue) {
    StyleTextPropertiesElement styleTextProperties =
        ((OdfFileDom) this.ownerDocument).newOdfElement(StyleTextPropertiesElement.class);
    styleTextProperties.setTextDisplayAttribute(textDisplayValue);
    this.appendChild(styleTextProperties);
    return styleTextProperties;
  }

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

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
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumFormatAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumLetterSyncAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element text:object-count}. */
public class TextObjectCountElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TEXT, "object-count");

  /**
   * Create the instance of <code>TextObjectCountElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TextObjectCountElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element text:object-count}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleNumFormatAttribute</code>
   * , See {@odf.attribute style:num-format}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getStyleNumFormatAttribute() {
    StyleNumFormatAttribute attr =
        (StyleNumFormatAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "num-format");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleNumFormatAttribute</code> , See
   * {@odf.attribute style:num-format}
   *
   * @param styleNumFormatValue The type is <code>String</code>
   */
  public void setStyleNumFormatAttribute(String styleNumFormatValue) {
    StyleNumFormatAttribute attr = new StyleNumFormatAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(styleNumFormatValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleNumLetterSyncAttribute
   * </code> , See {@odf.attribute style:num-letter-sync}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getStyleNumLetterSyncAttribute() {
    StyleNumLetterSyncAttribute attr =
        (StyleNumLetterSyncAttribute)
            getOdfAttribute(OdfDocumentNamespace.STYLE, "num-letter-sync");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleNumLetterSyncAttribute</code> ,
   * See {@odf.attribute style:num-letter-sync}
   *
   * @param styleNumLetterSyncValue The type is <code>Boolean</code>
   */
  public void setStyleNumLetterSyncAttribute(Boolean styleNumLetterSyncValue) {
    StyleNumLetterSyncAttribute attr =
        new StyleNumLetterSyncAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(styleNumLetterSyncValue.booleanValue());
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
  /** Add text content. Only elements which are allowed to have text content offer this method. */
  public void newTextNode(String content) {
    if (content != null && !content.equals("")) {
      this.appendChild(this.getOwnerDocument().createTextNode(content));
    }
  }
}

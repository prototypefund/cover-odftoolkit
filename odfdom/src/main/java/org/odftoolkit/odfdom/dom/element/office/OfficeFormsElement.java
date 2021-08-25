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
package org.odftoolkit.odfdom.dom.element.office;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.form.FormApplyDesignModeAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormAutomaticFocusAttribute;
import org.odftoolkit.odfdom.dom.element.form.FormFormElement;
import org.odftoolkit.odfdom.dom.element.xforms.XformsModelElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element office:forms}. */
public class OfficeFormsElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.OFFICE, "forms");

  /**
   * Create the instance of <code>OfficeFormsElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public OfficeFormsElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element office:forms}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormApplyDesignModeAttribute
   * </code> , See {@odf.attribute form:apply-design-mode}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getFormApplyDesignModeAttribute() {
    FormApplyDesignModeAttribute attr =
        (FormApplyDesignModeAttribute)
            getOdfAttribute(OdfDocumentNamespace.FORM, "apply-design-mode");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(FormApplyDesignModeAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormApplyDesignModeAttribute</code> ,
   * See {@odf.attribute form:apply-design-mode}
   *
   * @param formApplyDesignModeValue The type is <code>Boolean</code>
   */
  public void setFormApplyDesignModeAttribute(Boolean formApplyDesignModeValue) {
    FormApplyDesignModeAttribute attr =
        new FormApplyDesignModeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(formApplyDesignModeValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>FormAutomaticFocusAttribute
   * </code> , See {@odf.attribute form:automatic-focus}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getFormAutomaticFocusAttribute() {
    FormAutomaticFocusAttribute attr =
        (FormAutomaticFocusAttribute) getOdfAttribute(OdfDocumentNamespace.FORM, "automatic-focus");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(FormAutomaticFocusAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>FormAutomaticFocusAttribute</code> ,
   * See {@odf.attribute form:automatic-focus}
   *
   * @param formAutomaticFocusValue The type is <code>Boolean</code>
   */
  public void setFormAutomaticFocusAttribute(Boolean formAutomaticFocusValue) {
    FormAutomaticFocusAttribute attr =
        new FormAutomaticFocusAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(formAutomaticFocusValue.booleanValue());
  }

  /**
   * Create child element {@odf.element form:form}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element form:form}
   */
  public FormFormElement newFormFormElement() {
    FormFormElement formForm =
        ((OdfFileDom) this.ownerDocument).newOdfElement(FormFormElement.class);
    this.appendChild(formForm);
    return formForm;
  }

  /**
   * Create child element {@odf.element xforms:model}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element xforms:model}
   */
  public XformsModelElement newXformsModelElement() {
    XformsModelElement xformsModel =
        ((OdfFileDom) this.ownerDocument).newOdfElement(XformsModelElement.class);
    this.appendChild(xformsModel);
    return xformsModel;
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

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
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.table.TableAcceptanceStateAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TablePositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableRejectingChangeIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTableAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTypeAttribute;
import org.odftoolkit.odfdom.dom.element.office.OfficeChangeInfoElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element table:insertion}. */
public class TableInsertionElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TABLE, "insertion");

  /**
   * Create the instance of <code>TableInsertionElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TableInsertionElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element table:insertion}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableAcceptanceStateAttribute
   * </code> , See {@odf.attribute table:acceptance-state}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableAcceptanceStateAttribute() {
    TableAcceptanceStateAttribute attr =
        (TableAcceptanceStateAttribute)
            getOdfAttribute(OdfDocumentNamespace.TABLE, "acceptance-state");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return TableAcceptanceStateAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableAcceptanceStateAttribute</code> ,
   * See {@odf.attribute table:acceptance-state}
   *
   * @param tableAcceptanceStateValue The type is <code>String</code>
   */
  public void setTableAcceptanceStateAttribute(String tableAcceptanceStateValue) {
    TableAcceptanceStateAttribute attr =
        new TableAcceptanceStateAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableAcceptanceStateValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableCountAttribute</code> ,
   * See {@odf.attribute table:count}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getTableCountAttribute() {
    TableCountAttribute attr =
        (TableCountAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "count");
    if (attr != null) {
      return Integer.valueOf(attr.intValue());
    }
    return Integer.valueOf(TableCountAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableCountAttribute</code> , See
   * {@odf.attribute table:count}
   *
   * @param tableCountValue The type is <code>Integer</code>
   */
  public void setTableCountAttribute(Integer tableCountValue) {
    TableCountAttribute attr = new TableCountAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(tableCountValue.intValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableIdAttribute</code> , See
   * {@odf.attribute table:id}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableIdAttribute() {
    TableIdAttribute attr = (TableIdAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableIdAttribute</code> , See
   * {@odf.attribute table:id}
   *
   * @param tableIdValue The type is <code>String</code>
   */
  public void setTableIdAttribute(String tableIdValue) {
    TableIdAttribute attr = new TableIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableIdValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TablePositionAttribute</code> ,
   * See {@odf.attribute table:position}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getTablePositionAttribute() {
    TablePositionAttribute attr =
        (TablePositionAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "position");
    if (attr != null) {
      return Integer.valueOf(attr.intValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TablePositionAttribute</code> , See
   * {@odf.attribute table:position}
   *
   * @param tablePositionValue The type is <code>Integer</code>
   */
  public void setTablePositionAttribute(Integer tablePositionValue) {
    TablePositionAttribute attr = new TablePositionAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(tablePositionValue.intValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableRejectingChangeIdAttribute
   * </code> , See {@odf.attribute table:rejecting-change-id}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableRejectingChangeIdAttribute() {
    TableRejectingChangeIdAttribute attr =
        (TableRejectingChangeIdAttribute)
            getOdfAttribute(OdfDocumentNamespace.TABLE, "rejecting-change-id");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableRejectingChangeIdAttribute</code>
   * , See {@odf.attribute table:rejecting-change-id}
   *
   * @param tableRejectingChangeIdValue The type is <code>String</code>
   */
  public void setTableRejectingChangeIdAttribute(String tableRejectingChangeIdValue) {
    TableRejectingChangeIdAttribute attr =
        new TableRejectingChangeIdAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableRejectingChangeIdValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableTableAttribute</code> ,
   * See {@odf.attribute table:table}
   *
   * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Integer getTableTableAttribute() {
    TableTableAttribute attr =
        (TableTableAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "table");
    if (attr != null) {
      return Integer.valueOf(attr.intValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableTableAttribute</code> , See
   * {@odf.attribute table:table}
   *
   * @param tableTableValue The type is <code>Integer</code>
   */
  public void setTableTableAttribute(Integer tableTableValue) {
    TableTableAttribute attr = new TableTableAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setIntValue(tableTableValue.intValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TableTypeAttribute</code> , See
   * {@odf.attribute table:type}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTableTypeAttribute() {
    TableTypeAttribute attr =
        (TableTypeAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "type");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TableTypeAttribute</code> , See
   * {@odf.attribute table:type}
   *
   * @param tableTypeValue The type is <code>String</code>
   */
  public void setTableTypeAttribute(String tableTypeValue) {
    TableTypeAttribute attr = new TableTypeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(tableTypeValue);
  }

  /**
   * Create child element {@odf.element office:change-info}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * <p>Child element is mandatory.
   *
   * @return the element {@odf.element office:change-info}
   */
  public OfficeChangeInfoElement newOfficeChangeInfoElement() {
    OfficeChangeInfoElement officeChangeInfo =
        ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeChangeInfoElement.class);
    this.appendChild(officeChangeInfo);
    return officeChangeInfo;
  }

  /**
   * Create child element {@odf.element table:deletions}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element table:deletions}
   */
  public TableDeletionsElement newTableDeletionsElement() {
    TableDeletionsElement tableDeletions =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableDeletionsElement.class);
    this.appendChild(tableDeletions);
    return tableDeletions;
  }

  /**
   * Create child element {@odf.element table:dependencies}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * @return the element {@odf.element table:dependencies}
   */
  public TableDependenciesElement newTableDependenciesElement() {
    TableDependenciesElement tableDependencies =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableDependenciesElement.class);
    this.appendChild(tableDependencies);
    return tableDependencies;
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

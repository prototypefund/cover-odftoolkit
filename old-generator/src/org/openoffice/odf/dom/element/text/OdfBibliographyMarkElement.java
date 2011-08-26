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

package org.openoffice.odf.dom.element.text;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.text.OdfBibliographyType;


/**
 * ODF DOM Element implementation for element "<text:bibliography-mark>".
 */
public abstract class OdfBibliographyMarkElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TEXT, "bibliography-mark" );

    public OdfBibliographyMarkElement( OdfFileDom _aOwnerDoc )
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
    public void init(OdfBibliographyType _aBibliographyType, String _aIdentifier, String _aAddress, String _aAnnote, String _aAuthor, String _aBooktitle, String _aChapter, String _aEdition, String _aEditor, String _aHowpublished, String _aInstitution, String _aJournal, String _aMonth, String _aNote, String _aNumber, String _aOrganizations, String _aPages, String _aPublisher, String _aSchool, String _aSeries, String _aTitle, String _aReportType, String _aVolume, String _aYear, String _aUrl, String _aCustom1, String _aCustom2, String _aCustom3, String _aCustom4, String _aCustom5, String _aIsbn, String _aIssn)
    {
        setBibliographyType( _aBibliographyType );
        setIdentifier( _aIdentifier );
        setAddress( _aAddress );
        setAnnote( _aAnnote );
        setAuthor( _aAuthor );
        setBooktitle( _aBooktitle );
        setChapter( _aChapter );
        setEdition( _aEdition );
        setEditor( _aEditor );
        setHowpublished( _aHowpublished );
        setInstitution( _aInstitution );
        setJournal( _aJournal );
        setMonth( _aMonth );
        setNote( _aNote );
        setNumber( _aNumber );
        setOrganizations( _aOrganizations );
        setPages( _aPages );
        setPublisher( _aPublisher );
        setSchool( _aSchool );
        setSeries( _aSeries );
        setTitle( _aTitle );
        setReportType( _aReportType );
        setVolume( _aVolume );
        setYear( _aYear );
        setUrl( _aUrl );
        setCustom1( _aCustom1 );
        setCustom2( _aCustom2 );
        setCustom3( _aCustom3 );
        setCustom4( _aCustom4 );
        setCustom5( _aCustom5 );
        setIsbn( _aIsbn );
        setIssn( _aIssn );
    }

    /**
     * Get value of attribute "text:bibliography-type".
     */
    public OdfBibliographyType getBibliographyType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "bibliography-type" ) );
        return OdfBibliographyType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "text:bibliography-type".
     */
    public void setBibliographyType( OdfBibliographyType _aBibliographyType )
    {                    
        String aStringVal = OdfBibliographyType.toString( _aBibliographyType );
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "bibliography-type" ), aStringVal );
    }

    /**
     * Get value of attribute "text:identifier".
     */
    public String getIdentifier()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "identifier" ) );
    }

    /**
     * Set value of attribute "text:identifier".
     */
    public void setIdentifier( String _aIdentifier )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "identifier" ), _aIdentifier );
    }

    /**
     * Get value of attribute "text:address".
     */
    public String getAddress()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "address" ) );
    }

    /**
     * Set value of attribute "text:address".
     */
    public void setAddress( String _aAddress )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "address" ), _aAddress );
    }

    /**
     * Get value of attribute "text:annote".
     */
    public String getAnnote()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "annote" ) );
    }

    /**
     * Set value of attribute "text:annote".
     */
    public void setAnnote( String _aAnnote )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "annote" ), _aAnnote );
    }

    /**
     * Get value of attribute "text:author".
     */
    public String getAuthor()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "author" ) );
    }

    /**
     * Set value of attribute "text:author".
     */
    public void setAuthor( String _aAuthor )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "author" ), _aAuthor );
    }

    /**
     * Get value of attribute "text:booktitle".
     */
    public String getBooktitle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "booktitle" ) );
    }

    /**
     * Set value of attribute "text:booktitle".
     */
    public void setBooktitle( String _aBooktitle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "booktitle" ), _aBooktitle );
    }

    /**
     * Get value of attribute "text:chapter".
     */
    public String getChapter()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "chapter" ) );
    }

    /**
     * Set value of attribute "text:chapter".
     */
    public void setChapter( String _aChapter )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "chapter" ), _aChapter );
    }

    /**
     * Get value of attribute "text:edition".
     */
    public String getEdition()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "edition" ) );
    }

    /**
     * Set value of attribute "text:edition".
     */
    public void setEdition( String _aEdition )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "edition" ), _aEdition );
    }

    /**
     * Get value of attribute "text:editor".
     */
    public String getEditor()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "editor" ) );
    }

    /**
     * Set value of attribute "text:editor".
     */
    public void setEditor( String _aEditor )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "editor" ), _aEditor );
    }

    /**
     * Get value of attribute "text:howpublished".
     */
    public String getHowpublished()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "howpublished" ) );
    }

    /**
     * Set value of attribute "text:howpublished".
     */
    public void setHowpublished( String _aHowpublished )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "howpublished" ), _aHowpublished );
    }

    /**
     * Get value of attribute "text:institution".
     */
    public String getInstitution()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "institution" ) );
    }

    /**
     * Set value of attribute "text:institution".
     */
    public void setInstitution( String _aInstitution )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "institution" ), _aInstitution );
    }

    /**
     * Get value of attribute "text:journal".
     */
    public String getJournal()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "journal" ) );
    }

    /**
     * Set value of attribute "text:journal".
     */
    public void setJournal( String _aJournal )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "journal" ), _aJournal );
    }

    /**
     * Get value of attribute "text:month".
     */
    public String getMonth()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "month" ) );
    }

    /**
     * Set value of attribute "text:month".
     */
    public void setMonth( String _aMonth )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "month" ), _aMonth );
    }

    /**
     * Get value of attribute "text:note".
     */
    public String getNote()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "note" ) );
    }

    /**
     * Set value of attribute "text:note".
     */
    public void setNote( String _aNote )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "note" ), _aNote );
    }

    /**
     * Get value of attribute "text:number".
     */
    public String getNumber()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "number" ) );
    }

    /**
     * Set value of attribute "text:number".
     */
    public void setNumber( String _aNumber )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "number" ), _aNumber );
    }

    /**
     * Get value of attribute "text:organizations".
     */
    public String getOrganizations()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "organizations" ) );
    }

    /**
     * Set value of attribute "text:organizations".
     */
    public void setOrganizations( String _aOrganizations )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "organizations" ), _aOrganizations );
    }

    /**
     * Get value of attribute "text:pages".
     */
    public String getPages()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "pages" ) );
    }

    /**
     * Set value of attribute "text:pages".
     */
    public void setPages( String _aPages )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "pages" ), _aPages );
    }

    /**
     * Get value of attribute "text:publisher".
     */
    public String getPublisher()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "publisher" ) );
    }

    /**
     * Set value of attribute "text:publisher".
     */
    public void setPublisher( String _aPublisher )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "publisher" ), _aPublisher );
    }

    /**
     * Get value of attribute "text:school".
     */
    public String getSchool()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "school" ) );
    }

    /**
     * Set value of attribute "text:school".
     */
    public void setSchool( String _aSchool )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "school" ), _aSchool );
    }

    /**
     * Get value of attribute "text:series".
     */
    public String getSeries()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "series" ) );
    }

    /**
     * Set value of attribute "text:series".
     */
    public void setSeries( String _aSeries )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "series" ), _aSeries );
    }

    /**
     * Get value of attribute "text:title".
     */
    public String getTitle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "title" ) );
    }

    /**
     * Set value of attribute "text:title".
     */
    public void setTitle( String _aTitle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "title" ), _aTitle );
    }

    /**
     * Get value of attribute "text:report-type".
     */
    public String getReportType()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "report-type" ) );
    }

    /**
     * Set value of attribute "text:report-type".
     */
    public void setReportType( String _aReportType )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "report-type" ), _aReportType );
    }

    /**
     * Get value of attribute "text:volume".
     */
    public String getVolume()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "volume" ) );
    }

    /**
     * Set value of attribute "text:volume".
     */
    public void setVolume( String _aVolume )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "volume" ), _aVolume );
    }

    /**
     * Get value of attribute "text:year".
     */
    public String getYear()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "year" ) );
    }

    /**
     * Set value of attribute "text:year".
     */
    public void setYear( String _aYear )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "year" ), _aYear );
    }

    /**
     * Get value of attribute "text:url".
     */
    public String getUrl()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "url" ) );
    }

    /**
     * Set value of attribute "text:url".
     */
    public void setUrl( String _aUrl )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "url" ), _aUrl );
    }

    /**
     * Get value of attribute "text:custom1".
     */
    public String getCustom1()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "custom1" ) );
    }

    /**
     * Set value of attribute "text:custom1".
     */
    public void setCustom1( String _aCustom1 )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "custom1" ), _aCustom1 );
    }

    /**
     * Get value of attribute "text:custom2".
     */
    public String getCustom2()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "custom2" ) );
    }

    /**
     * Set value of attribute "text:custom2".
     */
    public void setCustom2( String _aCustom2 )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "custom2" ), _aCustom2 );
    }

    /**
     * Get value of attribute "text:custom3".
     */
    public String getCustom3()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "custom3" ) );
    }

    /**
     * Set value of attribute "text:custom3".
     */
    public void setCustom3( String _aCustom3 )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "custom3" ), _aCustom3 );
    }

    /**
     * Get value of attribute "text:custom4".
     */
    public String getCustom4()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "custom4" ) );
    }

    /**
     * Set value of attribute "text:custom4".
     */
    public void setCustom4( String _aCustom4 )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "custom4" ), _aCustom4 );
    }

    /**
     * Get value of attribute "text:custom5".
     */
    public String getCustom5()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "custom5" ) );
    }

    /**
     * Set value of attribute "text:custom5".
     */
    public void setCustom5( String _aCustom5 )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "custom5" ), _aCustom5 );
    }

    /**
     * Get value of attribute "text:isbn".
     */
    public String getIsbn()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "isbn" ) );
    }

    /**
     * Set value of attribute "text:isbn".
     */
    public void setIsbn( String _aIsbn )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "isbn" ), _aIsbn );
    }

    /**
     * Get value of attribute "text:issn".
     */
    public String getIssn()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TEXT, "issn" ) );
    }

    /**
     * Set value of attribute "text:issn".
     */
    public void setIssn( String _aIssn )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TEXT, "issn" ), _aIssn );
    }

}

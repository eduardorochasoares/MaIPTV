/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeasurementRequestXML;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Principal
 */
public class MeasurementRequest {
    private int measurementRequestID;
    private LinearTVQualifier linearTVQualifier;
    private AllContentClassExceptList allContentClassExceptList;
    private DocumentBuilderFactory docFactory;
    private Element rootElement;
    private MeasurementRequest measurementRequest;
    private List<MeasurementSchedule> measurementSchedule = new ArrayList<>();
    
    public MeasurementRequest(int measurementRequestID, LinearTVQualifier linearTVQualifier,
            AllContentClassExceptList allContentClassExceptList  ){
        this.measurementRequestID = measurementRequestID;
        this.linearTVQualifier = linearTVQualifier;
        this.allContentClassExceptList = allContentClassExceptList;
        
    }
    /**
     * @return the measurementRequestID
     */
    public int getMeasurementRequestID() {
        return measurementRequestID;
    }

    /**
     * @param measurementRequestID the measurementRequestID to set
     */
    public void setMeasurementRequestID(int measurementRequestID) {
        this.measurementRequestID = measurementRequestID;
    }

    /**
     * @return the linearTVQualifier
     */
    public LinearTVQualifier getLinearTVQualifier() {
        return linearTVQualifier;
    }

    /**
     * @param linearTVQualifier the linearTVQualifier to set
     */
    public void setLinearTVQualifier(LinearTVQualifier linearTVQualifier) {
        this.linearTVQualifier = linearTVQualifier;
    }

    /**
     * @return the allContentClassExceptList
     */
    public AllContentClassExceptList getAllContentClassExceptList() {
        return allContentClassExceptList;
    }

    /**
     * @param allContentClassExceptList the allContentClassExceptList to set
     */
    public void setAllContentClassExceptList(AllContentClassExceptList allContentClassExceptList) {
        this.allContentClassExceptList = allContentClassExceptList;
    }
    
     public void createMensuramentRequestDocument() {
        setDocFactory(DocumentBuilderFactory.newInstance());
        Document doc = null;

        DocumentBuilder docBuilder;
        try {
            docBuilder = getDocFactory().newDocumentBuilder();
            doc = docBuilder.newDocument();
            setRootElement(doc.createElement("MeasurementRequest"));
            addMensurementRequest(doc);
            addLinearTvQualifier(doc);
            addAllContentClassExceptList(doc);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ErrorMessageXML.Error.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public void addMensurementRequest(Document doc){
         Element filho = doc.createElement("MeasurementRequestID");
         getRootElement().appendChild(filho);
         filho.appendChild(doc.createTextNode(Integer.toString(this.getMeasurementRequestID())));
         
         
     }
     
    public void addLinearTvQualifier(Document doc){
        Element ltq = doc.createElement("LinearTvQualifier");
        getRootElement().appendChild(ltq);
        Element filho = doc.createElement("NavMethod");
        filho.appendChild(doc.createTextNode(Integer.toString(getLinearTVQualifier().getNavMethod().getCode())));
        ltq.appendChild(filho);
        filho =  doc.createElement("ControlDevice");
        filho.appendChild(doc.createTextNode(Integer.toString(getLinearTVQualifier().getControlDevice().getValorCodigo())));
        ltq.appendChild(filho);
        filho = doc.createElement("ViewMode");
        filho.appendChild(doc.createTextNode(Integer.toHexString(getLinearTVQualifier().getViewMode().getCode())));
        ltq.appendChild(filho);
        filho = doc.createElement("Obscuration");
        filho.appendChild(doc.createTextNode(Integer.toString(getLinearTVQualifier().getObscuration().getCode())));
        ltq.appendChild(filho);
        Element cq = doc.createElement("ChannelQualifier");
        ltq.appendChild(cq);
        Element cl = doc.createElement("ChannelList");
        cq.appendChild(cl);
        for(String s : getLinearTVQualifier().getChannelQualifier().getChannelList().getServiceIdentifier()){
            Element aux = doc.createElement("ServiceIdentifier");
            cl.appendChild(aux);
            aux.appendChild(doc.createTextNode(s));
        }
        Element ael = doc.createElement("AllChannelsExceptList");
        cq.appendChild(ael);
        for(String s : getLinearTVQualifier().getChannelQualifier().getAllChannelsExceptList().getServiceIdentifier()){
            Element aux = doc.createElement("ServiceIdentifier");
            ael.appendChild(aux);
            aux.appendChild(doc.createTextNode(s));
        }
        
        filho = doc.createElement("ChannelChangeFilter");
        ltq.appendChild(filho);
        filho.appendChild(doc.createTextNode(Integer.toString(getLinearTVQualifier().getChannelChangeFilter())));
        
        
    }
    
    public void addAllContentClassExceptList(Document doc){
        Element acce = doc.createElement("AllContentClassExceptList");
        getRootElement().appendChild(acce);
        
        for(ContentClassDomain c : getAllContentClassExceptList().getContentClassDomain()){
            Element ccd = doc.createElement("ContentClassDomain");
            acce.appendChild(ccd);
            ccd.appendChild(doc.createTextNode(c.getContentClassDomainValue()));
            for(String s : c.getContentclassID() ){
                Element aux = doc.createElement("ContentClassID");
                ccd.appendChild(aux);
                aux.appendChild(doc.createTextNode(s));
            }
        }
        
    }
    
    /**
     * @return the docFactory
     */
    public DocumentBuilderFactory getDocFactory() {
        return docFactory;
    }

    /**
     * @param docFactory the docFactory to set
     */
    public void setDocFactory(DocumentBuilderFactory docFactory) {
        this.docFactory = docFactory;
    }

    /**
     * @return the rootElement
     */
    public Element getRootElement() {
        return rootElement;
    }

    /**
     * @param rootElement the rootElement to set
     */
    public void setRootElement(Element rootElement) {
        this.rootElement = rootElement;
    }

    /**
     * @return the measurementRequest
     */
    public MeasurementRequest getMeasurementRequest() {
        return measurementRequest;
    }

    /**
     * @param measurementRequest the measurementRequest to set
     */
    public void setMeasurementRequest(MeasurementRequest measurementRequest) {
        this.measurementRequest = measurementRequest;
    }

    /**
     * @return the measurementSchedule
     */
    public List<MeasurementSchedule> getMeasurementSchedule() {
        return measurementSchedule;
    }

    /**
     * @param measurementSchedule the measurementSchedule to set
     */
    public void setMeasurementSchedule(List<MeasurementSchedule> measurementSchedule) {
        this.measurementSchedule = measurementSchedule;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeasurementRequestXML;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class TimeTrigger {
    private List<SampleSet> sampleSet = new ArrayList<>();

    /**
     * @return the sampleSet
     */
    public List<SampleSet> getSampleSet() {
        return sampleSet;
    }

    /**
     * @param sampleSet the sampleSet to set
     */
    public void setSampleSet(List<SampleSet> sampleSet) {
        this.sampleSet = sampleSet;
    }
}

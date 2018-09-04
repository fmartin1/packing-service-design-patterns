package ns.javaschool.designpatterns.packing.size.impl.envelope;

import ns.javaschool.designpatterns.packing.size.envelope.EnvelopeSize;

public class MediumEnvelope extends EnvelopeSize {

    @Override
    public String getDescription() {
        return "Medium";
    }

    @Override
    public String getLength() {
        return "40cm";
    }

    @Override
    public String getWidth() {
        return "30cm";
    }
}
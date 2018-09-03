package packing.size.impl.envelope;

import packing.size.envelope.EnvelopeSize;

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
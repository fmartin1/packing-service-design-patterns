package main.packing.size.impl.envelope;

import main.packing.size.envelope.EnvelopeSize;

public class SmallEnvelope extends EnvelopeSize {

    @Override
    public String getDescription() {
        return "Small";
    }

    @Override
    public String getLength() {
        return "30cm";
    }

    @Override
    public String getWidth() {
        return "10cm";
    }
}
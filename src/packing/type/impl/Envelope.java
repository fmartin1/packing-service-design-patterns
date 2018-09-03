package packing.type.impl;

import packing.size.envelope.EnvelopeSize;
import packing.type.PackageType;

public class Envelope extends PackageType {

    public Envelope(EnvelopeSize envelopeSize) {
        super(envelopeSize);
    }

    @Override
    public String getName() {
        return "Envelope";
    }

    @Override
    public String getDescription() {
        return "For posting documents, photos and stuff like that";
    }
}

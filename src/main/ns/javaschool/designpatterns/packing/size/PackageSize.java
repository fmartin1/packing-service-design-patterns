package ns.javaschool.designpatterns.packing.size;

import ns.javaschool.designpatterns.decorator.Priceable;

public interface PackageSize extends Priceable {

    String getDescription();

    String getDimensions();
}

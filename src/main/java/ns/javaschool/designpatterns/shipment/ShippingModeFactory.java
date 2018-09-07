package ns.javaschool.designpatterns.shipment;

import ns.javaschool.designpatterns.packing.type.Package;

public interface ShippingModeFactory {

    Shipping create(DeliveryTimeEnum deliveryTimeEnum, Package newPackage);
}

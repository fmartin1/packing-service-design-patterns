package ns.javaschool.designpatterns.shipment;

public interface ShippingModeFactory {

    Shipping create(DeliveryTimeEnum deliveryTimeEnum);
}

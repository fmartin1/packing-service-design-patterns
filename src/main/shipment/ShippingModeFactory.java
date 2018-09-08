package main.shipment;

public interface ShippingModeFactory {

    Shipping create(DeliveryTimeEnum deliveryTimeEnum);
}

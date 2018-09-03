package shipment;

public interface ShippingModeFactory {

    Shipping create(DeliveryTimeEnum deliveryTimeEnum);
}

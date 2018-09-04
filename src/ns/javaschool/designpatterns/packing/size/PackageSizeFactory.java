package ns.javaschool.designpatterns.packing.size;

public interface PackageSizeFactory {

    PackageSize create(PackageSizeEnum sizeEnum);
}

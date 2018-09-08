package main.packing.size;

public interface PackageSizeFactory {

    PackageSize create(PackageSizeEnum sizeEnum);
}

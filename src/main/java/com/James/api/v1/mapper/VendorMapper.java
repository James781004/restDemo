package com.James.api.v1.mapper;

import org.mapstruct.factory.Mappers;

import com.James.api.v1.model.VendorDTO;
import com.James.domain.Vendor;

public interface VendorMapper {

	VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

	VendorDTO vendorToVendorDTO(Vendor vendor);

	Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}

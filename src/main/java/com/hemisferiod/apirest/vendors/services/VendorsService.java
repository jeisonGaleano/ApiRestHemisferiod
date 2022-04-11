package com.hemisferiod.apirest.vendors.services;


import com.hemisferiod.apirest.products.dto.ProductDTO;
import com.hemisferiod.apirest.shared.entity.Products;
import com.hemisferiod.apirest.shared.entity.Vendors;
import com.hemisferiod.apirest.shared.message.Message;
import com.hemisferiod.apirest.shared.response.ResponseModel;
import com.hemisferiod.apirest.utils.Time;
import com.hemisferiod.apirest.vendors.dto.VendorsDTO;
import com.hemisferiod.apirest.vendors.repository.VendorsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VendorsService {

    @Autowired
    VendorsRepository vendorsRepository;

    public ResponseModel create(VendorsDTO vendorsDTO) {
        Vendors vendors = new Vendors();
        vendors = vendorsRepository.findByDocumentVendor(vendorsDTO.getDocumentVendor());
        if (vendors != null && vendors.getId()>0){
            return new ResponseModel(Time.getTime(), "", 201, Message.Error.FOUND_VENDOR);
        }
        vendors.setDocumentVendor(vendorsDTO.getDocumentVendor());
        vendors.setNameClient(vendorsDTO.getNameClient());
        vendors.setAge(vendorsDTO.getAge());
        vendors.setCity(vendorsDTO.getCity());
        return new ResponseModel(Time.getTime(), vendorsRepository.save(vendors), 200, Message.Success.CLIENT_CREATED);
    }
}

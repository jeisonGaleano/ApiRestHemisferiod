package com.hemisferiod.apirest.products.service;

import com.hemisferiod.apirest.client.dto.ClientDTO;
import com.hemisferiod.apirest.products.dto.ProductDTO;
import com.hemisferiod.apirest.products.repository.ProductsRepository;
import com.hemisferiod.apirest.shared.entity.Client;
import com.hemisferiod.apirest.shared.entity.Products;
import com.hemisferiod.apirest.shared.message.Message;
import com.hemisferiod.apirest.shared.response.ResponseModel;
import com.hemisferiod.apirest.utils.LogicMethod;
import com.hemisferiod.apirest.utils.Time;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    @Autowired
    ProductsRepository productsRepository;

    private LogicMethod logicMethod = new LogicMethod();

    public ResponseModel create(ProductDTO productDTO) {
        Products products = new Products();
        products = productsRepository.findByCodeProduct(productDTO.getCodeProduct());
        if (products != null && products.getCodeProduct()>0){
            return new ResponseModel(Time.getTime(), "", 201, Message.Success.SUCCESS);
        }
        products.setCodeProduct(productDTO.getCodeProduct());
        products.setNameProduct(productDTO.getNameProduct());
        products.setUnityPrice(productDTO.getUnityPrice());
        products.setQuantityStock(productDTO.getQuantityStock());
        return new ResponseModel(Time.getTime(), productsRepository.save(products), 200, Message.Success.PRODUCT_CREATED);
    }

    public ResponseModel update(ProductDTO productDTO) {
        Products products = new Products();
        products = productsRepository.findByCodeProduct(productDTO.getCodeProduct());
        if (products != null && products.getCodeProduct()>0){
            products.setCodeProduct(productDTO.getCodeProduct());
            products.setNameProduct(productDTO.getNameProduct());
            products.setUnityPrice(productDTO.getUnityPrice());
            products.setQuantityStock(productDTO.getQuantityStock());
            return new ResponseModel(Time.getTime(), productsRepository.save(products), 200, Message.Success.PRODUCT_UPDATE);
        }
        return new ResponseModel(Time.getTime(), "", 201, Message.Success.SUCCESS);
    }

    public ResponseModel increaseStock(ProductDTO productDTO) {
        Products products = new Products();
        products = productsRepository.findByCodeProduct(productDTO.getCodeProduct());
        if (products != null && products.getCodeProduct()>0){
            products.setQuantityStock(logicMethod.increaseStock(products.getQuantityStock(), productDTO.getQuantityStock()));
            return new ResponseModel(Time.getTime(), productsRepository.save(products), 200, Message.Success.CLIENT_CREATED);
        }
        return new ResponseModel(Time.getTime(), "", 201, Message.Success.SUCCESS);
    }


    public ResponseModel findStockAll() {
        return new ResponseModel(Time.getTime(), productsRepository.findAll(), 201, Message.Success.SUCCESS);
    }
}



//package com.omgproject.omgdemoproject.Service.Omg;
//
//import com.omgproject.omgdemoproject.Model.Product;
//import com.omgproject.omgdemoproject.Repository.Omg.ProductRepository;
//import com.omgproject.omgdemoproject.util.Imageutils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.Optional;
//
//@Service
//public class ProductService {
//    @Autowired
//    ProductRepository productRepository;
//
//    public String uploadimage(MultipartFile file) throws IOException {
//
//        Product prod_img = productRepository.save(Product.builder()
//                .Prod_id(file.getContentType())
//                .Prod_name(file.getOriginalFilename())
//                .Prod_img(Imageutils.compressImage(file.getBytes())).build());
//        if(prod_img!=null){
//            return "file uploaded sucessfully : "+file.getOriginalFilename();
//        }
//        return null;
//    }
//
//    public byte[] downloadImage(String Prod_name){
//        Optional<Product> dbProduct = productRepository.findById(Prod_name);
//        byte[] images= Imageutils.decompressImage((dbProduct.get().getProd_img()));
//        return images;
//    }
//}

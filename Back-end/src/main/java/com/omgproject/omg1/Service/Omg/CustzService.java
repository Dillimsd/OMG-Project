//package com.omgproject.omg1.Service.Omg;
//
//
//import com.omgproject.omg1.Model.CustzImage;
//import com.omgproject.omg1.Repository.Omg.CustzRepository;
//import com.omgproject.omgdemoproject.util.CustzImageutils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.Optional;
//
//@Service
//public class CustzService {
//
//
//    @Autowired
//    private CustzRepository custzRepository;
//    @Bean
//    public String uploadImage(MultipartFile file) throws IOException {
//
//        CustzImage custzImage = custzRepository.save(CustzImage.builder()
//                .Custz_name(file.getOriginalFilename())
//                .Custz_type(file.getContentType())
//                .Custz_img(CustzImageutils.compressImage(file.getBytes())).build());
//        if (custzImage != null) {
//            return "file uploaded successfully:" + file.getOriginalFilename();
//        }
//        return null;
//    }
//    public byte[] dowmloadImage(String fileName){
//        Optional<CustzImage> dbCustzImage = custzRepository.findByName(fileName);
//        byte[] images=CustzImageutils.decompressImage(dbCustzImage.)
//    }
//}
//

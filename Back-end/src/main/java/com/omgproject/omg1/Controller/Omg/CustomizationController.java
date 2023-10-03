//package com.omgproject.omg1.Controller.Omg;
//
//
//import com.omgproject.omg1.Service.Omg.CustzService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//
//@RequestMapping("/image")
//@RestController
//public class CustomizationController {
//
//    @Autowired
//    CustzService custzService;
////    @Autowired
////    CustomizationRepository customizationRepository;
//
//
////    @PostMapping("/addCustz")
////    public Customization creatCustz(@RequestBody Customization customization){
////        return customizationRepository.save(customization);
////    }
//
////    @GetMapping("/GetAllCustz")
////    public List<Customization> getCustz(){
////        return customizationRepository.findAll();
////    }
//
//
//
//
//
//    @PostMapping
//    public ResponseEntity<?> uploadimage(@RequestParam("image") MultipartFile file) throws IOException {
//        String uploadimage = custzService.uploadImage(file);
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(uploadimage);
//    }
//    @GetMapping("/{fileName}")
//    public ResponseEntity<?> downloadImage(@PathVariable String fileName){
//        byte[] custzimage=custzService.downloadImage(fileName);
//        return ResponseEntity.status(HttpStatus.OK)
//                .contentType(MediaType.valueOf("image/png"))
//                .body(custzimage);
//
//
//}
//}
//

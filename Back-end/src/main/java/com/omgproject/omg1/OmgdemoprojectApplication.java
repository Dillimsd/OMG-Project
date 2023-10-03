package com.omgproject.omg1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan
//@EnableJpaRepositories
@SpringBootApplication


public class OmgdemoprojectApplication{
    public static void main(String[] args) {
        SpringApplication.run(OmgdemoprojectApplication.class, args);
    }
    
    

//    @Autowired
//    public  CustzService custzService;


//		@Autowired
//		ProductRepository productRepository;
//		@Autowired
//		ProductService productService;
//
//
//
//		@PostMapping("/uploadImage")
//		public ResponseEntity<?> uplaodImage(@RequestParam("image") MultipartFile file)throws IOException {
//			String uploadimage = productService.uploadimage(file);
//            return ResponseEntity.status(HttpStatus.OK)
//					.body(uploadimage);
//		}
//
//		@GetMapping("/{fileName}")
//		public ResponseEntity<?> downloadImage(@PathVariable String fileName){
//			byte[] Prod_img=productService.downloadImage(fileName);
//			return ResponseEntity.status(HttpStatus.OK)
//					.contentType(MediaType.ALL.valueOf("image/png"))
//					.body(Prod_img);
//
//		}
//
//
//
//}
//@PostMapping("/image")
//public ResponseEntity<?> uploadimage(@RequestParam("image") MultipartFile file) throws IOException {
//    String uploadimage = custzService.uploadImage(file);
//    return ResponseEntity.status(HttpStatus.OK)
//            .body(uploadimage);
//}
//    @GetMapping("/{fileName}")
//    public ResponseEntity<?> downloadImage(@PathVariable String fileName){
//        byte[] custzimage=custzService.downloadImage(fileName);
//        return ResponseEntity.status(HttpStatus.OK)
//                .contentType(MediaType.valueOf("image/png"))
//                .body(custzimage);
//
//
//    }
}





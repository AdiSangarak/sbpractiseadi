package in.adi.mockitodemo;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
   public String getProductName() {
      return "Honey";
   } 
}
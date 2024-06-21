package api.inventauto.controllers;

import api.inventauto.model.Brand;
import api.inventauto.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService _brandService;

    @GetMapping("/list")
    public List<Brand> getAllBrands() {
        return _brandService.getAllBrands();
    }
}

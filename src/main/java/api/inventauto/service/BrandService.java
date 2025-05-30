package api.inventauto.service;

import api.inventauto.model.Brand;
import api.inventauto.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandRepository _brandRepository;

    public List<Brand> getAllBrands() {
        return _brandRepository.findAll();
    }
}

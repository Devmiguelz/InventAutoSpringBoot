package api.inventauto.controllers;

import api.inventauto.model.Brand;
import api.inventauto.service.AuthService;
import api.inventauto.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService _authService;

    @GetMapping("/login")
    public void getAllBrands() {
        _authService.Login();
    }
}

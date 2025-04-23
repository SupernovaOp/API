    package com.swarnava.Sg_Dashboard_API1.Controller;

    import com.swarnava.Sg_Dashboard_API1.model.BCA;
    import com.swarnava.Sg_Dashboard_API1.service.BCAService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.List;


    @RestController
    @RequestMapping(value = "/api")
    public class TransactionController {

        @Autowired
        private BCAService bcaService;

        @GetMapping("/transactions")
        public List<BCA> getAllBCA() {
            return bcaService.getAllBCA();
        }
    }



    package com.swarnava.Sg_Dashboard_API1.service;

    import com.swarnava.Sg_Dashboard_API1.model.BCA;
    import com.swarnava.Sg_Dashboard_API1.repository.BCARepo;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public class BCAService {

        @Autowired
        private BCARepo bcaRepo;

        public List<BCA> getAllBCA() {
            return bcaRepo.findAllBCA();
        }
    }


package com.neo.service.impl;

import com.neo.model.MobileFoodFacilityPermit;
import com.neo.repository.MobileFoodFacilityPermitRepository;
import com.neo.service.MobileFoodFacilityPermitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileFoodFacilityPermitServiceImpl implements MobileFoodFacilityPermitService{

    @Autowired
    private MobileFoodFacilityPermitRepository mobileFoodFacilityPermitRepository;

    @Override
    public List<MobileFoodFacilityPermit> getMobileFoodFacilityPermitList() {
        return mobileFoodFacilityPermitRepository.findAll();
    }

    @Override
    public MobileFoodFacilityPermit findMobileFoodFacilityPermitById(long id) {
        return mobileFoodFacilityPermitRepository.findById(id);
    }

    @Override
    public void save(MobileFoodFacilityPermit mobileFoodFacilityPermit) {
        mobileFoodFacilityPermitRepository.save(mobileFoodFacilityPermit);
    }

    @Override
    public void edit(MobileFoodFacilityPermit mobileFoodFacilityPermit) {
        mobileFoodFacilityPermitRepository.save(mobileFoodFacilityPermit);
    }

    @Override
    public void delete(long id) {
        mobileFoodFacilityPermitRepository.deleteById(id);
    }
}



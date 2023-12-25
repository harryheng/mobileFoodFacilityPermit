package com.neo.service;

import com.neo.model.MobileFoodFacilityPermit;

import java.util.List;

public interface MobileFoodFacilityPermitService {

    public List<MobileFoodFacilityPermit> getMobileFoodFacilityPermitList();

    public MobileFoodFacilityPermit findMobileFoodFacilityPermitById(long id);

    public void save(MobileFoodFacilityPermit mobileFoodFacilityPermit);

    public void edit(MobileFoodFacilityPermit mobileFoodFacilityPermit);

    public void delete(long id);


}

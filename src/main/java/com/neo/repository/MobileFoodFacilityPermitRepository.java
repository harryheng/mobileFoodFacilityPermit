package com.neo.repository;


import com.neo.model.MobileFoodFacilityPermit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MobileFoodFacilityPermitRepository extends JpaRepository<MobileFoodFacilityPermit, Long> {
	// List<MobileFoodFacilityPermit> findByPublished(boolean published);
	List<MobileFoodFacilityPermit> findByAddressContaining(String address);
	Optional<MobileFoodFacilityPermit> findByLocationidContaining(long locationid);

	MobileFoodFacilityPermit findById(long id);

	void deleteById(Long id);
}

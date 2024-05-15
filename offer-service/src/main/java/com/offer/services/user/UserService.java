package com.offer.services.user;

import com.offer.entity.AppelOffre;
import com.offer.entity.Offre;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
	Optional<AppelOffre> getAppelOffreById(UUID id);
    List<AppelOffre> getAllAppelOffres();
	Offre createOffre(Offre offre);
	Offre updateOffre(Offre offre);
	void deleteOffre(UUID id);
	List<Offre> getAllOffres();
	Optional<Offre> getOffreById(UUID id);

}

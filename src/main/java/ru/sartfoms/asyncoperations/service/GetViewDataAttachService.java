package ru.sartfoms.asyncoperations.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.asyncoperations.entity.GetViewDataAttachStart;
import ru.sartfoms.asyncoperations.repository.GetViewDataAttachStartRepository;

@Service
public class GetViewDataAttachService {
	private final GetViewDataAttachStartRepository startRepository;

	public GetViewDataAttachService(GetViewDataAttachStartRepository startRepository) {
		this.startRepository = startRepository;
	}

	public GetViewDataAttachStart save(GetViewDataAttachStart entity) {
		return startRepository.save(entity);
	}
}

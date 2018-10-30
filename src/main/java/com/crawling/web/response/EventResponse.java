package com.crawling.web.response;

import java.util.List;
import java.util.stream.Collectors;

import com.crawling.domain.EventDto;
import com.crawling.domain.InterParkData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventResponse extends PageResponse<InterParkData> {
	private List<EventDto> events;
	private int status;
	private String msg;

	public static EventResponse fromEntity(List<InterParkData> entityLs) {
		List<EventDto> events = entityLs.stream().map(EventDto::fromEntity).collect(Collectors.toList());
		EventResponse re = EventResponse.builder().events(events).build();
		return re;
	}
}
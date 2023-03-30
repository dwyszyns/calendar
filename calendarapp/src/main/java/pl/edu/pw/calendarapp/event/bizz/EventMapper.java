package pl.edu.pw.calendarapp.event.bizz;


import pl.edu.pw.calendarapp.event.repo.Event;
import pl.edu.pw.calendarapp.event.rest.EventView;

import java.sql.Timestamp;
import java.util.Optional;

public class EventMapper {
    private EventMapper() {
    }

    public static EventView map(final Event event) {
        return Optional.ofNullable(event).map(e -> {
            final EventView view = new EventView();
            view.setId(e.getEventId() != null ? e.getEventId() : -1L);
            view.setName(e.getName());
            Optional.ofNullable(e.getStartTime()).map(Timestamp::toLocalDateTime).ifPresent(view::setStartDate);
            Optional.ofNullable(e.getEndTime()).map(Timestamp::toLocalDateTime).ifPresent(view::setEndDate);
            return view;
        }).orElse(null);
    }
}
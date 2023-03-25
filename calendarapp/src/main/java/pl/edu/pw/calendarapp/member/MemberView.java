package pl.edu.pw.calendarapp.member;

import lombok.Data;
import pl.edu.pw.calendarapp.calendar.CalendarView;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class MemberView {
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private LocalDateTime dateJoined;
    private List<CalendarView> calendarsPreview;
}

package Pack1;


import java.time.DayOfWeek;
import java.util.Objects;

public class Users {
    private Long id;

    private DayOfWeek day = DayOfWeek.SUNDAY;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;
        return Objects.equals(id, users.id) && day == users.day;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(day);
        return result;
    }
}

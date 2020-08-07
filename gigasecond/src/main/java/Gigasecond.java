import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
  LocalDateTime addedGetDateTime;
    public Gigasecond(LocalDate moment) {

      addedGetDateTime = moment.atStartOfDay().plusSeconds((long)1e9d);
    }

    public Gigasecond(LocalDateTime moment) {
        addedGetDateTime = moment.plusSeconds((long)1e9d);
    }

    public LocalDateTime getDateTime() {
        return addedGetDateTime;
    }
}

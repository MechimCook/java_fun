import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
  private LocalDateTime addedGetDateTime;
  private static final int gigasecond = 1_000_000_000;
    public Gigasecond(LocalDate moment) {
      this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        addedGetDateTime = moment.plusSeconds(gigasecond);
    }

    public LocalDateTime getDateTime() {
        return addedGetDateTime;
    }
}

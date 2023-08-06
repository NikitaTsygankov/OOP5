import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservationDate, int tableNo, String name);

    void changeReservationTable(int oldReservationTable, Date reservationDate, int tableNo, String name);

}
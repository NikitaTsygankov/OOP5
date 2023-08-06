import java.util.ArrayList;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        View view = new BookingView();
        Model model = new TableModel();

        BookingPresenter bookingPresenter = new BookingPresenter(view, model);
        bookingPresenter.showTables();

        view.reservationTable(new Date(), 3, "Станислав");
        System.out.println(("==================="));
        view.reservationTable(new Date(), 1, "Евгений");
        System.out.println(("==================="));
        view.reservationTable(new Date(), 2, "Павел");
        System.out.println(("==================="));



        view.changeReservationTable(1001, new Date(), 4, "Станислав");

    }

}
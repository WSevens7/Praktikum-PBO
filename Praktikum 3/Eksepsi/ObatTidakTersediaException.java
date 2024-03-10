public class ObatTidakTersediaException extends Exception{
    public ObatTidakTersediaException(String message) {
        super("Stock Obat habis");
    }
}
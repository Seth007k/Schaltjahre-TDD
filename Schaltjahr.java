public class Schaltjahr {

    public boolean isSchaltjahr(int schaltjahr) {
        return ((schaltjahr % 4 == 0 && schaltjahr % 100 != 0) || schaltjahr % 400 == 0);
    } //const verwenden; lesbarer gestalten
}
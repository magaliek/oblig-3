public class Koe<E> extends Lenkeliste<E> {
    public Koe() {
        super();
    }

    @Override
        public E fjern() {
            if (first == null) {
                throw new UgyldigListeindeks(-1);
            }
            Node peker = first;
            first = peker.next;
            peker.previous = null;
            return peker.data;
        }
    
}

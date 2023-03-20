public class Stabel<E> extends Lenkeliste<E> {
    public Stabel() {
        super();
    }
    @Override
    public void leggTil(E x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
            end = newNode;
        } else {
        newNode.next = first;
        first.previous = newNode;
        first = newNode;
        }
    }


}

abstract public class Lenkeliste <E> implements Liste<E> {
    public class Node {
        public E data;
        public Node next;
        public Node previous;
        public Node (E x) {
            this.data = x;
            this.next = null;
            this.previous = null;
        }
    }

    public Node first;
    public Node end;

    public Lenkeliste() {
        this.first = null;
        this.end = null;
        }

    @Override
    public void leggTil(E x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            newNode.previous = end;
            end = newNode;
        }
    }

        @Override
        public int stoerrelse() {
            int count = 0;
            Node peker = first;
            if (peker == null){
                return count;
            }
            while (peker != null){
                count++;
                peker = peker.next;
            }
            return count;
        }
    
        @Override
        public E hent(){
            return first.data;
        }
    
        @Override
        public E fjern() {
            if (first == null) {
                throw new UgyldigListeindeks(-1);
            }
            E x = first.data;
            first = first.next;
            return x;
        }
    
        public String toString() {
            String output = "";
            Node current = first;
            while (current != null) {
                output += current.data;
                current = current.next;
                if (current.next != null) {
                    output += " , ";
                }
            }
            return output;
        }
}

public class Prioritetskoe<E extends Comparable<E>> extends Lenkeliste<E> {

@Override
public void leggTil(E x) {
    Node newNode = new Node(x);
    Node peker = first;
        if (first == null) {
            first = newNode;
            end = newNode;
        } else for(int i = 0; i < stoerrelse(); i++){
            if (newNode.data.compareTo(peker.data)>= 0){
                peker.next = newNode;
                newNode.previous = peker;
                peker = peker.next;
        }
        if (newNode.data.compareTo(peker.data)<= 0){
                peker.previous = newNode;
                newNode.next = peker;
                peker = peker.next;
        }
        }
    }

}

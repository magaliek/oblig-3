class IndeksertListe <E> extends Lenkeliste<E> {
    public IndeksertListe() {
        super();
    }

    public void leggTil (int pos, E x) {
        int size = stoerrelse();
        if (pos < 0 || pos > size) {
            throw new UgyldigListeindeks(-1);
        }
        Node newNode = new Node(x);
        Node peker = first;
        int count = 0;
        if (first == null){
            first = newNode;
            end = newNode;
        } else {
            while (peker.next != null) {
                peker = peker.next;
                count++;
                if (count == pos){
                    newNode.next = peker.next;
                    newNode.previous = peker;
                    peker.next = newNode;
                    size += 1;
                }
            }
        }
    }

    public void sett (int pos, E x) {
        Node newNode = new Node(x);
        Node peker = first;
        int count = 0;
        if (first == null){
            first = newNode;
            end = newNode;
        }
        if (pos < 0 || pos > stoerrelse()) {
            throw new UgyldigListeindeks(-1);
        }
        while (peker.next != null) {
            peker = peker.next;
            count++;
            if (count == pos){
                peker.next = newNode;
                newNode.previous = peker;
            }
        }
    }

    public E hent (int pos) {
        Node peker = first;
        int count = 0;
        E posData = first.data;
        if (pos < 0 || pos > stoerrelse()) {
            throw new UgyldigListeindeks(-1);
        }
        while (peker.next != null) {
            peker = peker.next;
            count++;
            if (count == pos){
                posData = peker.data;
            }
        }
        return posData;
    }



    public E fjern(int pos) {
        Node peker = first;
        E posData = peker.data;
        int count = 0;
        int size = stoerrelse();
        if (pos < 0 || pos > size || first == null) {
            throw new UgyldigListeindeks(-1);
        }
        while (peker.next != null) {
            peker = peker.next;
            count++;
            if (count == pos){
                peker.previous.next = peker.next;
                peker.next.previous = peker.previous;
                size -=1;
            }
        }
        return posData;
    }




}
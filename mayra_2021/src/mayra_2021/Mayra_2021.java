package mayra_2021;

public class Mayra_2021 {

    public static void main(String[] args) {
        System.out.println("version 1");
        System.out.println("version 1.1");
        lista l1 = new lista();

        l1.crearlista();

        l1.imprimir();
    }
}

class nodo {

    int info;

    nodo(int x) {

        info = x;

    }

    nodo sig;

}

class lista {

    nodo cab;

    lista() {
    }

    void crearlista() {

        cab = null;

        nodo q;

        int i = 3;

        while (i > 0) {

            q = new nodo(i);

            q.sig = cab;

            cab = q;

            i = i - 1;

        }

    }

    void imprimir() {

        nodo aux = cab;

        while (aux != null) {

            System.out.println(aux.info);

            aux = aux.sig;

        }

    }
}

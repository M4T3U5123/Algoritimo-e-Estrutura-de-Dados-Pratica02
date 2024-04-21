package estruturaDeDados;

public class ListaMateus implements Lista {

    private int[] array = new int[20];
    private int size = 0;

    @Override
    public boolean buscaElemento(int valor) {
        for (int i = 0; i < size; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimo() {
        if (size == 0) {
        
        }
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public int maximo() {
        if (size == 0) {
         
        }
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public int predecessor(int valor) {
        for (int i = 0; i < size; i++) {
            if (array[i] == valor) {
                if (i > 0) {
                    return array[i - 1];
                } else {
                   
                }
            }
        }
        throw new IllegalArgumentException("Elemento não encontrado");
    }


    @Override
    public int sucessor(int valor) {
        for (int i = 0; i < size; i++) {
            if (array[i] == valor) {
                if (i < size - 1) {
                    return array[i + 1];
                } else {
                   
                }
            }
        }
        throw new IllegalArgumentException("Elemento não encontrado");
    }
    @Override
    public void insereElemento(int valor) {
        if (size < array.length) {
            array[size++] = valor;
        } else {
           
        }
    }
    @Override
    public void remove(int valor) {
        int index = buscaIndice(valor);
        if (index != -1) {
            removeIndice(index);
        }
    }
    @Override
    public int buscaIndice(int valor) {
        for (int i = 0; i < size; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1; // Retorna -1 se não encontrar o elemento
    }

    @Override
    public void insereElementoPosicao(int valor, int indice) {
        if (indice < 0 || indice > size) {
            
        }
        if (size >= array.length) {
            
        }
        
        for (int i = size; i > indice; i--) {
            array[i] = array[i - 1];
        }
        array[indice] = valor;
        size++;
    }
    @Override
    public void insereInicio(int valor) {
        insereElementoPosicao(valor, 0);
    }
    @Override
    public void insereFim(int valor) {
        if (size >= array.length) {
            
        }
        array[size++] = valor;
    }

    @Override
    public void removeIndice(int indice) {
        if (indice < 0 || indice >= size) {
           
        }
       
        for (int i = indice; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }
    @Override
    public void removeInicio() {
        if (size == 0) {
           
        }
        removeIndice(0);
    }
   
    @Override
    public void removeFim() {
        if (size == 0) {
        
        }
        removeIndice(size - 1);
    }
    
}
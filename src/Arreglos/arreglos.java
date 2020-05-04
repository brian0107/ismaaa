package Arreglos;
public class arreglos {
    public static void main(String[] args) {
        int i,j,aux;
        int array_one[] = {33,24,24,23,23,2};
        int array_two[] = {23,23,233,23,24,500};
        int arrayAux[]=new int[6];
        for (i = 0; i < 6; i++){
            arrayAux[i] = array_one[i]*array_two[i];
            if (arrayAux[i] >= 800){
                arrayAux[i] = 0;
            }
        }
        for(i=0;i<6;i++){
            for(j=i+1;j<6;j++){//i+1 se pone para que siempre inicialice siendo un numero mayor que el for de afuera
                if(arrayAux[i]<arrayAux[j]){//le estamos diciendo que el for que se encuentra afuera con valor i es menor que el for del valor j haga lo siguiente
                    aux=arrayAux[i];//aqui decimos que a=auxiliar se le guarde el valor i
                    arrayAux[i]=arrayAux[j];//aqui le decimos que el valor i es igual al de j
                    arrayAux[j]=aux;// aqui eliminamos el valor i y lo remplazamos por j y asi lo vamos comparando uno por 1
                }
            }
        }
        System.out.println("La multiplicacion ordenada de mayor a menor es:");
        for(i=0;i<6;i++){
            System.out.println(arrayAux[i]);
        }

    }
}




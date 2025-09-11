class Calulator {

    double summultiplicateOfDiagonals (double [][] tab){
        var Diagonalmultipilication1 = tab[0][0] * tab[1][1] * tab[2][2];
        var Diagonalmultipilication2 = tab[0][2] * tab[1][1] * tab[2][0];
        var Sum = Diagonalmultipilication1 +  Diagonalmultipilication2;
        return Sum;
    };

    double summultiplicateOfMiddleRowMiddleColumn (double[][] tab){
        var SumOfMiddleColumn = tab[0][1] + tab[1][1] + tab[2][1];
        var SumOfMiddleRow = tab[0][1] + tab[1][1] + tab[2][1];        
        var Sum = SumOfMiddleColumn * SumOfMiddleRow;
        return Sum;
    };

    double SumOfExtremeElements (double[][] tab){
        var suma = 0.0; 
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                suma = suma + tab[i][j];
            }
        }
        var Sum = suma - tab[2][2]; 
        return Sum;
    };

}

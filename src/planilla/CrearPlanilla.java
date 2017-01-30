/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planilla;

/**
 *
 * @author oscar
 */
public class CrearPlanilla {
    
    
    private  int[][] mesTurno = {
                                  { 0,  0,      0,      0,      0,      0,      0,      0,     0,       0,      0,      0,      0,      0,      0},
                                  { 0,  1,	2,	3,	4,	5,	6,	7,	8,	9,	10,	11,	12,	13,	14 }, 
                                  { 0,  2,	1,	4,	3,	6,	5,	8,	7,	10,	9,	12,	11,	14,	13 }, 
                                  { 0,  3,	4,	5,	6,	7,	8,	9,	10,	11,	12,	13,	14,	1,	2  },
                                  { 0,  4,	3,	6,	5,	8,	7,	10,	9,	12,	11,	12,	8,	2,	1  },
                                  { 0,  5,	6,	7,	8,	9,	10,	11,	12,	13,	14,	1,	2,	3,	4  },
                                  { 0,  6,	5,	8,	7,	10,	9,	12,	11,	14,	13,	2,	1,	4,	3  },
                                  { 0,  7,	8,	9,	10,	11,	12,	13,	14,	1,	2,	3,	4,	5,	6  },
                                  { 0,  8,	7,	10,	9,	12,	11,	14,	13,	2,	1,	4,	3,	6,	5  },
                                  { 0,  9,	10,	11,	12,	13,	14,	1,	2,	3,	4,	5,	6,	7,	8  },
                                  { 0,  10,	9,	12,	11,	14,	13,	2,	1,	4,	3,	6,	5,	8,	7  },
                                  { 0,  11,	12,	13,	14,	1,	2,	3,	4,	5,	6,	7,	8,	9,	10 }, 
                                  { 0,  12,	11,	14,	13,	2,	1,	4,	3,	6,	5,	8,	7,	10,	9  },
                                  { 0,  13,	14,	1,	2,	3,	4,	5,	6,	7,	8,	9,	10,	11,	12 },
                                  { 0,  14,	13,	2,	1,	4,	3,	6,	5,	8,	7,	10,	9,	12,	11 } 
                               };

    private int[][] Dia={   
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14},
                        {0,14, 3, 2, 5, 4, 7, 6, 9, 8,11,10,13,12, 1}, //--->orden de buses del  dia 1
                        {0, 3,14, 5, 2, 7, 4, 9, 6,11, 8,13,10, 1,12}, //--->orden de buses del  dia 2
                        {0,12, 5,14, 7, 2, 9, 4,11, 6, 1, 8, 1,10, 3},             //-
                        {0, 5,12, 7,14, 9, 2,11, 4,13, 6, 1, 8, 3,10},             //-   
                        {0,10, 7,12, 9,14,11, 2,13, 4, 1, 6, 3, 8, 5},            //-
                        {0, 7,10, 9,12,11,14,13, 2, 1, 4, 3, 6, 5, 8},
                        {0, 8, 9,10,11,12,13,14, 1, 2, 3, 4, 5, 6, 7},
                        {0, 9, 8,11,10,13,12, 1,14, 3, 2, 5, 4, 7, 6},
                        {0, 6,11, 8,13,10, 1,12, 3,14, 5, 2, 7, 4, 9},
                        {0,11, 6,13, 8, 1,10, 3,12, 5,14, 7, 2, 9, 4},
                        {0, 4,13, 6, 1, 8, 3,10, 5,12, 7,14, 9, 2,11},
                        {0,13, 4, 1, 6, 3, 8, 5,10, 7,12, 9,14,11, 2},
                        {0, 2, 1, 4, 3, 6, 5, 8, 7,10, 9,12,11,14,13}
                        };

    /*metodos*/
    public int[][] planillaDespacho(int[] buses, int grupo, int mes) {
        int i ,j ,k;
              
        int[] auxBus = new int[15];
        
        /* Ordeno la lista de los buses por mes */
        for (i = 1; i <= 14; i++)
        {
            auxBus[i] = buses[this.mesTurno[mes][i]];
        }

        int[][] planillaDespachoMes = new int[31][15];
        /*para un mes(30 dias + columna posicion "0" Planilla de Control de despacho mensual*/
        k = 1;
        for (i = 1; i <= 30; i++) {
            /* 30 dias. el mes */
            for (j = 1; j <= 14; j++) {
                /* 6 buses */
                int vial = auxBus[this.Dia[k][j]];
                planillaDespachoMes[i][j] = vial;
            }
            if (k == 14) {
                k = 1;
            } else {
                k++;
            }
        }
        return planillaDespachoMes;
    }
    
}

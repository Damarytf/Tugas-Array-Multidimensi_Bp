/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array3d;
public class Array3D {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int data[][][] = new int [3][4][5];
        double matriks[][][];
        matriks = new double[4][3][2];
        String rubik[][][] = {{{"Red","Red","Red"},
            {"Red","Red","Red"},
            {"Red","Red","Red"}
        },
            {{"White","White","White"},
            {"White","White","White"},
            {"White","White","White"}
        },
            {{"Green","Green","Green"},
            {"Green","Green","Green"},
            {"Green","Green","Green"}
        },
        };

        //input data langsung ke array
        data[2][1][2] = 100;
        matriks[2][1][0] = 99.9;

        //menampilkan isi rubik
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

            //buat tab untuk setiap halaman
            for(int I=0;I<i;I++){
                System.out.print("\t");
            }
            for(int k=0;k<3;k++){
                System.out.print(rubik[i][j][k]+" ");
            }
            System.out.println("");
           }//end for j
          }//end for i
        }//end main
    }//end class

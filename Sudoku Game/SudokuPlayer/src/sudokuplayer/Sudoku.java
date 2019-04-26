/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuplayer;

/**
 *
 * @author andrewcarroll
 */
public class Sudoku {
    char [][]array = new char [9][9];
    
    public Sudoku(){
        for (int row = 1; row < 9; row++){
            for (int col = 1; col < 9; col++){
                array[row][col] = ' ';   
    }
}
    }
    
    

    public Sudoku(String start) {
        for (int row = 1; row < 9; row++){
            String[] temp = start.split("\n");{
            for (int col = 1; col < 9; col++){
                array[row][col] = temp[row].charAt(col);
            }
        }
            
        }
        
        
    }

    void setSquare(int row, int col, char val) {
        array[row][col] = val;
    }

    boolean isSolved() {
        return isNotEmpty() && isValid();
    }
    
    private boolean isNotEmpty(){
        for (int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if (array[row][col] == ' ')
                    return false;
            }
            
            
        }
        return false;
 }

    boolean isValid() {
       return checkrows() && checkcolumns() && checksquares();
    }
    private boolean checkrows(){
    for(int row = 0; row < 9; row++){
        String tempString = "";
        
        for(int col = 0; col <9; col++)
        {
            if(tempString.contains(array[row][col] + "") || array[row][col] != ' ')
            {
                return false;
            }
            tempString += array[row][col];
    }
    }
    return true;
    }
    private boolean checkcolumns(){
        for(int row = 0; row < 9; row++){
        String tempString = "";
        
        for(int col = 0; col < 9; col++)
        {
            if(tempString.contains(array[col][row] + "") || array[col][row] != ' ')
            {
                return false;
            }
            tempString += array[col][row];
    }
    }
    return true;
    }
    private boolean checksquares(){
        return false;
    }

    char getSquare(int row, int col) {

        return array[row][col];
    }
}
    
    

    


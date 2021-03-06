/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsapp;

/**
 *  Checks the correctness of the response and that it does not differ by more
 *  than 0.01
 */
class NumericQuestion extends Question
{
    private float answer;

    public NumericQuestion()
    {
        float answer = 0;
    }

    public void setAnswer(float correctResponse)
    {
        answer = correctResponse;
    }

    
    public boolean checkAnswer(String response)
    {
        float value;
        value = Float.parseFloat(response);

        if(value > answer + .01 || value < answer + -.01)
        {
            return false;
        }
        else
        {
            QuestionsApp.score = QuestionsApp.score + 1;
            return true;
        }
    }

}
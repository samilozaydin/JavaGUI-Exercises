/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progress;

/**
 *
 * @author Bilal
 */
public class classss {
    public static void main(String[] args) throws InterruptedException{
        ProgressBar progress = new ProgressBar();
        progress.setVisible(true);
        try{
            for (int i = 0; i < 101; i++) {
                progress.progbar.setValue(i);
                Thread.sleep(50);
                if(i==100){
                    progress.kapanis.setVisible(true);
                    progress.setVisible(false);
                }
            }
 
        }catch(InterruptedException ex){
            
        }
    }
        
}

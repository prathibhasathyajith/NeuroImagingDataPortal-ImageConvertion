
import java.awt.Label;
import java.awt.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javax.swing.SwingWorker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prathibha
 */
public class ResetFields extends SwingWorker<Integer, String>{
    private TextField txtfield1;
    private TextField txtfield2;
    private Label label;
    private ComboBox combo1;
    private ComboBox combo2;
    private ComboBox combo3;
    private RadioButton radio1;
    private RadioButton radio2;

    public ResetFields(TextField txtfield1, TextField txtfield2, Label label, ComboBox combo1, ComboBox combo2, ComboBox combo3, RadioButton radio1, RadioButton radio2) {
        this.txtfield1 = txtfield1;
        this.txtfield2 = txtfield2;
        this.label = label;
        this.combo1 = combo1;
        this.combo2 = combo2;
        this.combo3 = combo3;
        this.radio1 = radio1;
        this.radio2 = radio2;
    }

    

    
    
    
    @Override
    protected Integer doInBackground() throws Exception {
        
        txtfield1.setText("");
        txtfield2.setText("");
        combo1.setId("Select Age");
        radio1.fire();
        return 0;
    }
    
    
}

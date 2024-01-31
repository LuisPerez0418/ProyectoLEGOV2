package controlador;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

public class VisualizarFormula {

    private TeXFormula form;
    private TeXIcon icon;
    private String formula; 

    public VisualizarFormula(String formula) {
        this.formula = formula;
    }

    public TeXIcon getIcon(){
        try {
            this.form = new TeXFormula(this.formula);
            this.icon = this.form.createTeXIcon(TeXConstants.ALIGN_LEFT, 27);
            return this.icon;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return this.icon = null;
        }
    }
    
    public TeXIcon getIconTitulos(){
        try {
            this.form = new TeXFormula(this.formula);
            this.icon = this.form.createTeXIcon(TeXConstants.ALIGN_LEFT, 14);
            return this.icon;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return this.icon = null;
        }
    }
 
}

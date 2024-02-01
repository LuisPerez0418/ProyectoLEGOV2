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

    public void setFormula(String formula) {
        this.formula = formula;
        try {
            this.form = new TeXFormula(this.formula);
            this.icon = this.form.createTeXIcon(TeXConstants.ALIGN_LEFT, 27);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public TeXIcon getIcon() {
        return this.icon;
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


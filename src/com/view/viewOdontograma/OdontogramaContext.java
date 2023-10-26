package com.view.viewOdontograma;

import com.model.DienteOdontogramaModel;

/**
 *
 * @author Daniel Batres
 */
public class OdontogramaContext {
    private static boolean selection = false;
    private static OdontogramaSelection odontogramaSelection;
    private static DienteOdontogramaModel dienteOdontogramaModel;
    private static String selectedSide;

    public static boolean isSelection() {
        return selection;
    }

    public static void setSelection(boolean selection) {
        OdontogramaContext.selection = selection;
    }

    public static OdontogramaSelection getOdontogramaSelection() {
        return odontogramaSelection;
    }

    public static void setOdontogramaSelection(OdontogramaSelection odontogramaSelection) {
        OdontogramaContext.odontogramaSelection = odontogramaSelection;
    }

    public static DienteOdontogramaModel getDienteOdontogramaModel() {
        return dienteOdontogramaModel;
    }

    public static void setDienteOdontogramaModel(DienteOdontogramaModel dienteOdontogramaModel) {
        OdontogramaContext.dienteOdontogramaModel = dienteOdontogramaModel;
    }

    public static String getSelectedSide() {
        return selectedSide;
    }

    public static void setSelectedSide(String selectedSide) {
        OdontogramaContext.selectedSide = selectedSide;
    }
    
    public static OdontogramaSelection parseSeleccion(String odontogramaSelection) {
        OdontogramaSelection odontogramaSeleccion = OdontogramaSelection.CARIES_DENTAL;
        
        switch (odontogramaSelection) {
            case "CARIES_DENTAL":
                break;
            case "CORONA_BUEN_ESTADO":
                odontogramaSeleccion = OdontogramaSelection.CORONA_BUEN_ESTADO;
                break;
            case "CORONA_MAL_ESTADO":
                odontogramaSeleccion = OdontogramaSelection.CORONA_MAL_ESTADO;
                break;
            case "DIENTE_AUSENTE":
                odontogramaSeleccion = OdontogramaSelection.DIENTE_AUSENTE;
                break;
            case "DIENTE_INDICADO_EXTRACCION":
                odontogramaSeleccion = OdontogramaSelection.DIENTE_INDICADO_EXTRACCION;
                break;
            case "FRACTURA_CORONA_DENTAL":
                odontogramaSeleccion = OdontogramaSelection.FRACTURA_CORONA_DENTAL;
                break;
            case "OBTURACION_BUEN_ESTADO":
                odontogramaSeleccion = OdontogramaSelection.OBTURACION_BUEN_ESTADO;
                break;
            case "OBTURACION_MAL_ESTADO":
                odontogramaSeleccion = OdontogramaSelection.OBTURACION_MAL_ESTADO;
                break;
        }
        
        return odontogramaSeleccion;
    }
}

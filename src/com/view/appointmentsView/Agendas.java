package com.view.appointmentsView;

import com.context.ApplicationContext;
import com.context.ChoosedPalette;
import com.helper.ConsultasHelper;
import com.k33ptoo.components.KGradientPanel;
import com.utils.CustomScrollBar;
import com.utils.Styles;
import com.utils.Tools;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Daniel Batres
 * @version 1.0.0
 * @since 16/09/22
 */
public class Agendas extends Styles {
    ArrayList<KGradientPanel> CALENDAR_BUTTONS = new ArrayList<>();
    ArrayList<JLabel> LABELS_CALENDAR = new ArrayList<>();
    private int monthValue = 0;
    private int year = LocalDateTime.now().getYear();
    private int selectedDay = 0;
    
    /**
     * Creates new form Agendas
     */
    public Agendas() {
        initComponents();
        monthValue = LocalDateTime.now().getMonthValue();
        styleMyComponentBaby();
    }
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(fecha);
        TITLES_AND_SUBTITLES.add(title3);
        TITLES_AND_SUBTITLES.add(title4);
        TITLES_AND_SUBTITLES.add(title5);
        TITLES_AND_SUBTITLES.add(title6);
        TITLES_AND_SUBTITLES.add(title7);
        TITLES_AND_SUBTITLES.add(title8);
        TITLES_AND_SUBTITLES.add(title9);
        TITLES_AND_SUBTITLES.add(title10);
        TITLES_AND_SUBTITLES.add(title11);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text9);
        PLAIN_TEXT.add(text10);
        PLAIN_TEXT.add(text11);
        PLAIN_TEXT.add(text12);
        PLAIN_TEXT.add(text13);
        PLAIN_TEXT.add(text15);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container4);
        CONTAINERS.add(container5);
        CONTAINERS.add(container6);
    }
    
    @Override
    public void addTextFields() {
        TEXTFIELDS.add(textField1);
    }
    
    public void setData() {
        ApplicationContext.consultasListadas.clear();
        ApplicationContext.consultasListadas = ConsultasHelper.getConsultas();
        ApplicationContext.agendasTable.listTargets();
        Tools.showPanel(appointmentsState, ApplicationContext.agendasTable, 0, 0);
    }

    @Override
    public void initStyles() {
        scrollPanel.setVerticalScrollBar(new CustomScrollBar());
        scrollPanel.getVerticalScrollBar().setUnitIncrement(35);
        
        Tools.showPanel(appointmentsState, ApplicationContext.agendasTable, 10, 10);
        paintOnePanelRound(panelRound1, ChoosedPalette.getMidColor());
        
        addCalendarButtons();
        addLabelsCalendar();
        setCalendarValues(monthValue, LocalDateTime.now().getMonth(), LocalDateTime.now().getYear());
        busquedaIcon.setSize(58, 34);
        back.setSize(20, 20);
        next.setSize(20, 20);
        Tools.setImageLabel(busquedaIcon, "src/com/assets/busqueda.png", 40, 16, ChoosedPalette.getWhite());
        setIcons();
        setData();
    }
    
    private void setIcons() {
        Tools.setImageLabel(back, "src/com/assets/angulo-izquierdo.png", 5, 5, ChoosedPalette.getDarkColor());
        Tools.setImageLabel(next, "src/com/assets/anguloderecho.png", 5, 5, ChoosedPalette.getDarkColor());
    }
    
    @Override
    public void colorBasics() {
        content2.setBackground(ChoosedPalette.getPrimaryBackground());
        CALENDAR_BUTTONS.forEach(button -> {
            button.setkStartColor(ChoosedPalette.getSecondaryBackground());
            button.setkEndColor(ChoosedPalette.getSecondaryBackground());
        });
        paintAll();
        setIcons();
        needBorder1.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        needBorder2.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        needBorder3.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        LABELS_CALENDAR.forEach(label -> label.setForeground(ChoosedPalette.getTextColor()));
        paintOneContainer(container1, ChoosedPalette.getGray());
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getSecondaryBackground());
            container.setkEndColor(ChoosedPalette.getSecondaryBackground());
            container.repaint();
        });
        
        container1.setkFillBackground(false);
        paintOneContainer(container1, ChoosedPalette.getGray());
        paintOneContainer(container4, ChoosedPalette.getPrimaryBackground());
        paintOneContainer(container5, ChoosedPalette.getPrimaryBackground());
    }
    
    private void setCalendarValues(int monthNumber, Month monthValue, int year) {
        int dayNumbers = 0;
        
        switch(monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayNumbers = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayNumbers = 30;
                break;
            case 2:
                if (Tools.esAnnioBisiesto(year)) {
                    dayNumbers = 29;
                } else {
                    dayNumbers = 28;
                }
                break;
        }
        
        String mesText = "";
        
        switch (monthValue) {
            case JANUARY:
                mesText = "Enero";
                break;
            case FEBRUARY:
                mesText = "Febrero";
                break;
            case MARCH:
                mesText = "Marzo";
                break;
            case APRIL:
                mesText = "Abril";
                break;
            case MAY:
                mesText = "Mayo";
                break;
            case JUNE:
                mesText = "Junio";
                break;
            case JULY:
                mesText = "Julio";
                break;
            case AUGUST:
                mesText = "Agosto";
                break;
            case SEPTEMBER:
                mesText = "Septiembre";
                break;
            case OCTOBER:
                mesText = "Octubre";
                break;
            case NOVEMBER:
                mesText = "Noviembre";
                break;
            case DECEMBER:
                mesText = "Diciembre";
                break;
        }
        
        fecha.setText(mesText + " " + year);
        addSingleCalendarText(dayNumbers);
    }
    
    private int getMonth(String month) {
        int value = 0;
        
        switch (month) {
            case "Enero":
                value = Month.JANUARY.getValue();
                break;
            case "Febrero":
                value = Month.FEBRUARY.getValue();
                break;
            case "Marzo":
                value = Month.MARCH.getValue();
                break;
            case "Abril":
                value = Month.APRIL.getValue();
                break;
            case "Mayo":
                value = Month.MAY.getValue();
                break;
            case "Junio":
                value = Month.JUNE.getValue();
                break;
            case "Julio":
                value = Month.JULY.getValue();
                break;
            case "Agosto":
                value = Month.AUGUST.getValue();
                break;
            case "Septiembre":
                value = Month.SEPTEMBER.getValue();
                break;
            case "Octubre":
                value = Month.OCTOBER.getValue();
                break;
            case "Noviembre":
                value = Month.NOVEMBER.getValue();
                break;
            case "Diciembre":
                value = Month.DECEMBER.getValue();
                break;
        }
        
        return value;
    }
    
    private void addSingleCalendarText(int size) {
        LABELS_CALENDAR.forEach(label -> label.setText(""));
        
        int mesValue = getMonth(fecha.getText().substring(0, fecha.getText().length() - 5));
        String mes = String.valueOf(mesValue);
        
        if (String.valueOf(mesValue).length() == 1) {
            mes = "0" + mesValue;
        }
        
        CharSequence date = fecha.getText().substring(fecha.getText().length() - 4, fecha.getText().length()) + "-" + mes + "-01";
        int iterator = 0;
        
        switch (LocalDate.parse(date).getDayOfWeek()) {
            case SUNDAY:
                iterator = 0;
                break;
            case MONDAY:
                iterator = 1;
                break;
            case TUESDAY:
                iterator = 2;
                break;
            case WEDNESDAY:
                iterator = 3;
                break;
            case THURSDAY:
                iterator = 4;
                break;
            case FRIDAY:
                iterator = 5;
                break;
            case SATURDAY:
                iterator = 6;
                break;
        }
        
        for (int i = iterator; i < (size + iterator); i++) {
            LABELS_CALENDAR.get(i).setText(String.valueOf((i - iterator) + 1));
        }
    }
    
    private void selectionButton(KGradientPanel panel, JLabel label) {
        if (!label.getText().equals("")) {
            CALENDAR_BUTTONS.forEach(button -> {
                button.setkFillBackground(false);
                button.setkStartColor(ChoosedPalette.getSecondaryBackground());
                button.setkEndColor(ChoosedPalette.getSecondaryBackground());
            });

            LABELS_CALENDAR.forEach(labelText -> {
                labelText.setForeground(ChoosedPalette.getTextColor());
            });

            panel.setkFillBackground(true);
            panel.setkStartColor(ChoosedPalette.getMidColor());
            panel.setkEndColor(ChoosedPalette.getMidColor());
            label.setForeground(ChoosedPalette.getWhite());
            selectedDay = Integer.parseInt(label.getText());
        }
    }
    
    private void addTargetsByLabel(JLabel label) {
        if (!label.getText().equals("")) {
            ApplicationContext.agendasTable.listTargetsBy(Integer.parseInt(label.getText()), monthValue, year, textField1.getText());
        
            if (ApplicationContext.consultasListadas.isEmpty()) {
                Tools.showPanel(appointmentsState, ApplicationContext.sinResultados, 10, 10);
            } else {
                Tools.showPanel(appointmentsState, ApplicationContext.agendasTable, 0, 0);
                SwingUtilities.updateComponentTreeUI(appointmentsState);
            }
        }
    }
    
    private void addTargetsBy(int day, String text) {
        ApplicationContext.agendasTable.listTargetsBy(day, monthValue, year, text);
        
        if (ApplicationContext.consultasListadas.isEmpty()) {
            Tools.showPanel(appointmentsState, ApplicationContext.sinResultados, 10, 10);
        } else {
            Tools.showPanel(appointmentsState, ApplicationContext.agendasTable, 0, 0);
            SwingUtilities.updateComponentTreeUI(appointmentsState);
        }
    }
     
    private void addCalendarButtons() {
        CALENDAR_BUTTONS.add(g1);
        CALENDAR_BUTTONS.add(g2);
        CALENDAR_BUTTONS.add(g3);
        CALENDAR_BUTTONS.add(g4);
        CALENDAR_BUTTONS.add(g5);
        CALENDAR_BUTTONS.add(g6);
        CALENDAR_BUTTONS.add(g7);
        CALENDAR_BUTTONS.add(g8);
        CALENDAR_BUTTONS.add(g9);
        CALENDAR_BUTTONS.add(g10);
        CALENDAR_BUTTONS.add(g11);
        CALENDAR_BUTTONS.add(g12);
        CALENDAR_BUTTONS.add(g13);
        CALENDAR_BUTTONS.add(g14);
        CALENDAR_BUTTONS.add(g15);
        CALENDAR_BUTTONS.add(g16);
        CALENDAR_BUTTONS.add(g17);
        CALENDAR_BUTTONS.add(g18);
        CALENDAR_BUTTONS.add(g19);
        CALENDAR_BUTTONS.add(g20);
        CALENDAR_BUTTONS.add(g21);
        CALENDAR_BUTTONS.add(g22);
        CALENDAR_BUTTONS.add(g23);
        CALENDAR_BUTTONS.add(g24);
        CALENDAR_BUTTONS.add(g25);
        CALENDAR_BUTTONS.add(g26);
        CALENDAR_BUTTONS.add(g27);
        CALENDAR_BUTTONS.add(g28);
        CALENDAR_BUTTONS.add(g29);
        CALENDAR_BUTTONS.add(g30);
        CALENDAR_BUTTONS.add(g31);
        CALENDAR_BUTTONS.add(g32);
        CALENDAR_BUTTONS.add(g33);
        CALENDAR_BUTTONS.add(g34);
        CALENDAR_BUTTONS.add(g35);
        CALENDAR_BUTTONS.add(g36);
        CALENDAR_BUTTONS.add(g37);
        CALENDAR_BUTTONS.add(g38);
        CALENDAR_BUTTONS.add(g39);
        CALENDAR_BUTTONS.add(g40);
        CALENDAR_BUTTONS.add(g41);
        CALENDAR_BUTTONS.add(g42);
    }
    
    public void addLabelsCalendar() {
        LABELS_CALENDAR.add(d1);
        LABELS_CALENDAR.add(d2);
        LABELS_CALENDAR.add(d3);
        LABELS_CALENDAR.add(d4);
        LABELS_CALENDAR.add(d5);
        LABELS_CALENDAR.add(d6);
        LABELS_CALENDAR.add(d7);
        LABELS_CALENDAR.add(d8);
        LABELS_CALENDAR.add(d9);
        LABELS_CALENDAR.add(d10);
        LABELS_CALENDAR.add(d11);
        LABELS_CALENDAR.add(d12);
        LABELS_CALENDAR.add(d13);
        LABELS_CALENDAR.add(d14);
        LABELS_CALENDAR.add(d15);
        LABELS_CALENDAR.add(d16);
        LABELS_CALENDAR.add(d17);
        LABELS_CALENDAR.add(d18);
        LABELS_CALENDAR.add(d19);
        LABELS_CALENDAR.add(d20);
        LABELS_CALENDAR.add(d21);
        LABELS_CALENDAR.add(d22);
        LABELS_CALENDAR.add(d23);
        LABELS_CALENDAR.add(d24);
        LABELS_CALENDAR.add(d25);
        LABELS_CALENDAR.add(d26);
        LABELS_CALENDAR.add(d27);
        LABELS_CALENDAR.add(d28);
        LABELS_CALENDAR.add(d29);
        LABELS_CALENDAR.add(d30);
        LABELS_CALENDAR.add(d31);
        LABELS_CALENDAR.add(d32);
        LABELS_CALENDAR.add(d33);
        LABELS_CALENDAR.add(d34);
        LABELS_CALENDAR.add(d35);
        LABELS_CALENDAR.add(d36);
        LABELS_CALENDAR.add(d37);
        LABELS_CALENDAR.add(d38);
        LABELS_CALENDAR.add(d39);
        LABELS_CALENDAR.add(d40);
        LABELS_CALENDAR.add(d41);
        LABELS_CALENDAR.add(d42);
    }
    
    private void setValuesCalendar(int monthValue, int year) {
        switch (monthValue) {
            case 1:
                setCalendarValues(monthValue, Month.JANUARY, year);
                break;
            case 2:
                setCalendarValues(monthValue, Month.FEBRUARY, year);
                break;
            case 3:
                setCalendarValues(monthValue, Month.MARCH, year);
                break;
            case 4:
                setCalendarValues(monthValue, Month.APRIL, year);
                break;
            case 5:
                setCalendarValues(monthValue, Month.MAY, year);
                break;
            case 6:
                setCalendarValues(monthValue, Month.JUNE, year);
                break;
            case 7:
                setCalendarValues(monthValue, Month.JULY, year);
                break;
            case 8:
                setCalendarValues(monthValue, Month.AUGUST, year);
                break;
            case 9:
                setCalendarValues(monthValue, Month.SEPTEMBER, year);
                break;
            case 10:
                setCalendarValues(monthValue, Month.OCTOBER, year);
                break;
            case 11:
                setCalendarValues(monthValue, Month.NOVEMBER, year);
                break;
            case 12:
                setCalendarValues(monthValue, Month.DECEMBER, year);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        container4 = new com.k33ptoo.components.KGradientPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        panelRound1 = new com.utils.PanelRound();
        busquedaIcon = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        textField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        container5 = new com.k33ptoo.components.KGradientPanel();
        needBorder = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        needBorder1 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel118 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        text9 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        text10 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        text11 = new javax.swing.JLabel();
        jPanel119 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        text12 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        text13 = new javax.swing.JLabel();
        jPanel124 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        text15 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        content2 = new javax.swing.JPanel();
        container6 = new com.k33ptoo.components.KGradientPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel123 = new javax.swing.JPanel();
        needBorder2 = new javax.swing.JPanel();
        jPanel125 = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        jPanel126 = new javax.swing.JPanel();
        title4 = new javax.swing.JLabel();
        jPanel127 = new javax.swing.JPanel();
        title5 = new javax.swing.JLabel();
        jPanel128 = new javax.swing.JPanel();
        title6 = new javax.swing.JLabel();
        jPanel129 = new javax.swing.JPanel();
        title7 = new javax.swing.JLabel();
        jPanel130 = new javax.swing.JPanel();
        title8 = new javax.swing.JLabel();
        jPanel131 = new javax.swing.JPanel();
        title9 = new javax.swing.JLabel();
        jPanel132 = new javax.swing.JPanel();
        jPanel133 = new javax.swing.JPanel();
        jPanel134 = new javax.swing.JPanel();
        jPanel135 = new javax.swing.JPanel();
        jPanel136 = new javax.swing.JPanel();
        jPanel137 = new javax.swing.JPanel();
        jPanel138 = new javax.swing.JPanel();
        g1 = new com.k33ptoo.components.KGradientPanel();
        d1 = new javax.swing.JLabel();
        jPanel139 = new javax.swing.JPanel();
        g2 = new com.k33ptoo.components.KGradientPanel();
        d2 = new javax.swing.JLabel();
        jPanel140 = new javax.swing.JPanel();
        g3 = new com.k33ptoo.components.KGradientPanel();
        d3 = new javax.swing.JLabel();
        jPanel141 = new javax.swing.JPanel();
        g4 = new com.k33ptoo.components.KGradientPanel();
        d4 = new javax.swing.JLabel();
        jPanel142 = new javax.swing.JPanel();
        g5 = new com.k33ptoo.components.KGradientPanel();
        d5 = new javax.swing.JLabel();
        jPanel143 = new javax.swing.JPanel();
        g6 = new com.k33ptoo.components.KGradientPanel();
        d6 = new javax.swing.JLabel();
        jPanel144 = new javax.swing.JPanel();
        g7 = new com.k33ptoo.components.KGradientPanel();
        d7 = new javax.swing.JLabel();
        jPanel145 = new javax.swing.JPanel();
        g8 = new com.k33ptoo.components.KGradientPanel();
        d8 = new javax.swing.JLabel();
        jPanel146 = new javax.swing.JPanel();
        g9 = new com.k33ptoo.components.KGradientPanel();
        d9 = new javax.swing.JLabel();
        jPanel147 = new javax.swing.JPanel();
        g10 = new com.k33ptoo.components.KGradientPanel();
        d10 = new javax.swing.JLabel();
        jPanel148 = new javax.swing.JPanel();
        g11 = new com.k33ptoo.components.KGradientPanel();
        d11 = new javax.swing.JLabel();
        jPanel149 = new javax.swing.JPanel();
        g12 = new com.k33ptoo.components.KGradientPanel();
        d12 = new javax.swing.JLabel();
        jPanel150 = new javax.swing.JPanel();
        g13 = new com.k33ptoo.components.KGradientPanel();
        d13 = new javax.swing.JLabel();
        jPanel151 = new javax.swing.JPanel();
        g14 = new com.k33ptoo.components.KGradientPanel();
        d14 = new javax.swing.JLabel();
        jPanel152 = new javax.swing.JPanel();
        g15 = new com.k33ptoo.components.KGradientPanel();
        d15 = new javax.swing.JLabel();
        jPanel153 = new javax.swing.JPanel();
        g16 = new com.k33ptoo.components.KGradientPanel();
        d16 = new javax.swing.JLabel();
        jPanel154 = new javax.swing.JPanel();
        g17 = new com.k33ptoo.components.KGradientPanel();
        d17 = new javax.swing.JLabel();
        jPanel155 = new javax.swing.JPanel();
        g18 = new com.k33ptoo.components.KGradientPanel();
        d18 = new javax.swing.JLabel();
        jPanel156 = new javax.swing.JPanel();
        g19 = new com.k33ptoo.components.KGradientPanel();
        d19 = new javax.swing.JLabel();
        jPanel157 = new javax.swing.JPanel();
        g20 = new com.k33ptoo.components.KGradientPanel();
        d20 = new javax.swing.JLabel();
        jPanel158 = new javax.swing.JPanel();
        g21 = new com.k33ptoo.components.KGradientPanel();
        d21 = new javax.swing.JLabel();
        jPanel159 = new javax.swing.JPanel();
        g22 = new com.k33ptoo.components.KGradientPanel();
        d22 = new javax.swing.JLabel();
        jPanel160 = new javax.swing.JPanel();
        g23 = new com.k33ptoo.components.KGradientPanel();
        d23 = new javax.swing.JLabel();
        jPanel161 = new javax.swing.JPanel();
        g24 = new com.k33ptoo.components.KGradientPanel();
        d24 = new javax.swing.JLabel();
        jPanel162 = new javax.swing.JPanel();
        g25 = new com.k33ptoo.components.KGradientPanel();
        d25 = new javax.swing.JLabel();
        jPanel163 = new javax.swing.JPanel();
        g26 = new com.k33ptoo.components.KGradientPanel();
        d26 = new javax.swing.JLabel();
        jPanel164 = new javax.swing.JPanel();
        g27 = new com.k33ptoo.components.KGradientPanel();
        d27 = new javax.swing.JLabel();
        jPanel165 = new javax.swing.JPanel();
        g28 = new com.k33ptoo.components.KGradientPanel();
        d28 = new javax.swing.JLabel();
        jPanel166 = new javax.swing.JPanel();
        g29 = new com.k33ptoo.components.KGradientPanel();
        d29 = new javax.swing.JLabel();
        jPanel167 = new javax.swing.JPanel();
        g30 = new com.k33ptoo.components.KGradientPanel();
        d30 = new javax.swing.JLabel();
        jPanel168 = new javax.swing.JPanel();
        g31 = new com.k33ptoo.components.KGradientPanel();
        d31 = new javax.swing.JLabel();
        jPanel169 = new javax.swing.JPanel();
        g32 = new com.k33ptoo.components.KGradientPanel();
        d32 = new javax.swing.JLabel();
        jPanel170 = new javax.swing.JPanel();
        g33 = new com.k33ptoo.components.KGradientPanel();
        d33 = new javax.swing.JLabel();
        jPanel171 = new javax.swing.JPanel();
        g34 = new com.k33ptoo.components.KGradientPanel();
        d34 = new javax.swing.JLabel();
        jPanel172 = new javax.swing.JPanel();
        g35 = new com.k33ptoo.components.KGradientPanel();
        d35 = new javax.swing.JLabel();
        jPanel173 = new javax.swing.JPanel();
        g36 = new com.k33ptoo.components.KGradientPanel();
        d36 = new javax.swing.JLabel();
        jPanel182 = new javax.swing.JPanel();
        g37 = new com.k33ptoo.components.KGradientPanel();
        d37 = new javax.swing.JLabel();
        jPanel183 = new javax.swing.JPanel();
        g38 = new com.k33ptoo.components.KGradientPanel();
        d38 = new javax.swing.JLabel();
        jPanel184 = new javax.swing.JPanel();
        g39 = new com.k33ptoo.components.KGradientPanel();
        d39 = new javax.swing.JLabel();
        jPanel185 = new javax.swing.JPanel();
        g40 = new com.k33ptoo.components.KGradientPanel();
        d40 = new javax.swing.JLabel();
        jPanel186 = new javax.swing.JPanel();
        g41 = new com.k33ptoo.components.KGradientPanel();
        d41 = new javax.swing.JLabel();
        jPanel187 = new javax.swing.JPanel();
        g42 = new com.k33ptoo.components.KGradientPanel();
        d42 = new javax.swing.JLabel();
        jPanel174 = new javax.swing.JPanel();
        jPanel175 = new javax.swing.JPanel();
        jPanel176 = new javax.swing.JPanel();
        jPanel177 = new javax.swing.JPanel();
        jPanel178 = new javax.swing.JPanel();
        jPanel179 = new javax.swing.JPanel();
        needBorder3 = new javax.swing.JPanel();
        jPanel180 = new javax.swing.JPanel();
        title10 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel181 = new javax.swing.JPanel();
        title11 = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel120 = new javax.swing.JPanel();
        jPanel121 = new javax.swing.JPanel();
        appointmentsState = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 569));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1000, 569));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 90));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 90));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel3.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(14, 90));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel4.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 90));
        jPanel6.setMinimumSize(new java.awt.Dimension(0, 90));
        jPanel6.setOpaque(false);

        container4.setkBorderRadius(20);
        container4.setkEndColor(new java.awt.Color(204, 204, 204));
        container4.setkFillBackground(false);
        container4.setkStartColor(new java.awt.Color(204, 204, 204));
        container4.setMaximumSize(new java.awt.Dimension(1020, 70));
        container4.setMinimumSize(new java.awt.Dimension(1020, 70));
        container4.setOpaque(false);
        container4.setPreferredSize(new java.awt.Dimension(1026, 70));
        container4.setLayout(new javax.swing.BoxLayout(container4, javax.swing.BoxLayout.LINE_AXIS));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(510, 65));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(510, 65));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel12, java.awt.BorderLayout.PAGE_END);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setOpaque(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel14, java.awt.BorderLayout.LINE_END);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMaximumSize(new java.awt.Dimension(32767, 46));
        jPanel15.setMinimumSize(new java.awt.Dimension(0, 46));
        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setMaximumSize(new java.awt.Dimension(5, 32767));
        jPanel33.setMinimumSize(new java.awt.Dimension(5, 0));
        jPanel33.setOpaque(false);
        jPanel33.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel33, java.awt.BorderLayout.LINE_START);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setOpaque(false);

        container1.setBackground(new java.awt.Color(255, 255, 255));
        container1.setkEndColor(new java.awt.Color(0, 0, 0));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(0, 0, 0));
        container1.setMaximumSize(new java.awt.Dimension(2147483647, 44));
        container1.setMinimumSize(new java.awt.Dimension(320, 0));
        container1.setOpaque(false);
        container1.setPreferredSize(new java.awt.Dimension(319, 44));
        container1.setLayout(new java.awt.BorderLayout());

        panelRound1.setBackground(new java.awt.Color(0, 0, 0));
        panelRound1.setMaximumSize(new java.awt.Dimension(75, 32767));
        panelRound1.setMinimumSize(new java.awt.Dimension(75, 100));
        panelRound1.setPreferredSize(new java.awt.Dimension(75, 46));
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopRight(15);
        panelRound1.setLayout(new java.awt.BorderLayout());

        busquedaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRound1.add(busquedaIcon, java.awt.BorderLayout.CENTER);

        container1.add(panelRound1, java.awt.BorderLayout.LINE_END);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setOpaque(false);

        textField1.setBackground(new java.awt.Color(255, 255, 255));
        textField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        textField1.setForeground(new java.awt.Color(102, 102, 102));
        textField1.setText("Buscar agenda");
        textField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        textField1.setMaximumSize(new java.awt.Dimension(2147483647, 34));
        textField1.setMinimumSize(new java.awt.Dimension(3, 34));
        textField1.setPreferredSize(new java.awt.Dimension(96, 34));
        textField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField1MouseClicked(evt);
            }
        });
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        textField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                    .addContainerGap(7, Short.MAX_VALUE)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        container1.add(jPanel35, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(620, Short.MAX_VALUE)
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel15.add(jPanel34, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel15, java.awt.BorderLayout.CENTER);

        container4.add(jPanel7);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container4, javax.swing.GroupLayout.PREFERRED_SIZE, 960, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(container4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel16.setMinimumSize(new java.awt.Dimension(14, 100));
        jPanel16.setOpaque(false);
        jPanel16.setPreferredSize(new java.awt.Dimension(14, 90));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel16, java.awt.BorderLayout.LINE_END);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMaximumSize(new java.awt.Dimension(14, 90));
        jPanel17.setMinimumSize(new java.awt.Dimension(14, 90));
        jPanel17.setOpaque(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel17, java.awt.BorderLayout.LINE_START);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setOpaque(false);
        jPanel19.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel19, java.awt.BorderLayout.PAGE_END);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setOpaque(false);

        container5.setkBorderRadius(20);
        container5.setkEndColor(new java.awt.Color(204, 204, 204));
        container5.setkFillBackground(false);
        container5.setkStartColor(new java.awt.Color(204, 204, 204));
        container5.setOpaque(false);
        container5.setLayout(new java.awt.BorderLayout());

        needBorder.setOpaque(false);
        needBorder.setPreferredSize(new java.awt.Dimension(1020, 40));
        needBorder.setLayout(new java.awt.BorderLayout());

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setOpaque(false);
        jPanel23.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        needBorder.add(jPanel23, java.awt.BorderLayout.LINE_END);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setOpaque(false);
        jPanel24.setPreferredSize(new java.awt.Dimension(20, 40));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        needBorder.add(jPanel24, java.awt.BorderLayout.LINE_START);

        needBorder1.setBackground(new java.awt.Color(255, 255, 255));
        needBorder1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder1.setOpaque(false);
        needBorder1.setLayout(new java.awt.BorderLayout());

        jPanel26.setMinimumSize(new java.awt.Dimension(350, 100));
        jPanel26.setOpaque(false);
        jPanel26.setPreferredSize(new java.awt.Dimension(350, 100));

        fecha.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        fecha.setText("Septiembre 2022");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        needBorder1.add(jPanel26, java.awt.BorderLayout.LINE_END);

        jPanel27.setMinimumSize(new java.awt.Dimension(600, 0));
        jPanel27.setOpaque(false);
        jPanel27.setPreferredSize(new java.awt.Dimension(600, 39));
        jPanel27.setLayout(new java.awt.GridLayout(1, 0));

        jPanel118.setOpaque(false);
        jPanel118.setLayout(new java.awt.GridLayout(1, 0));

        jPanel41.setOpaque(false);

        text9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text9.setForeground(new java.awt.Color(153, 153, 153));
        text9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text9.setText("Fecha");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
            .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel41Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text9, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel41Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text9, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel118.add(jPanel41);

        jPanel47.setOpaque(false);

        text10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text10.setForeground(new java.awt.Color(153, 153, 153));
        text10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text10.setText("Hora");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel47Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text10, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel47Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel118.add(jPanel47);

        jPanel48.setOpaque(false);

        text11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text11.setForeground(new java.awt.Color(153, 153, 153));
        text11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        text11.setText("Foto");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
            .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel48Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text11, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel48Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel118.add(jPanel48);

        jPanel27.add(jPanel118);

        jPanel119.setOpaque(false);
        jPanel119.setLayout(new java.awt.GridLayout(1, 0));

        jPanel49.setOpaque(false);

        text12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text12.setForeground(new java.awt.Color(153, 153, 153));
        text12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text12.setText("Nombre completo");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
            .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel49Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel49Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text12, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel119.add(jPanel49);

        jPanel50.setOpaque(false);

        text13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text13.setForeground(new java.awt.Color(153, 153, 153));
        text13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text13.setText("Tratamiento");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
            .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel50Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text13, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel50Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text13, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel119.add(jPanel50);

        jPanel27.add(jPanel119);

        jPanel124.setOpaque(false);
        jPanel124.setLayout(new java.awt.GridLayout(1, 0));

        jPanel51.setOpaque(false);

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jPanel124.add(jPanel51);

        jPanel52.setOpaque(false);

        text15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text15.setForeground(new java.awt.Color(153, 153, 153));
        text15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text15.setText("Consulta");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
            .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel52Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text15, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel52Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(text15, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel124.add(jPanel52);

        jPanel27.add(jPanel124);

        needBorder1.add(jPanel27, java.awt.BorderLayout.CENTER);

        needBorder.add(needBorder1, java.awt.BorderLayout.CENTER);

        container5.add(needBorder, java.awt.BorderLayout.PAGE_START);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setOpaque(false);
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setOpaque(false);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel29, java.awt.BorderLayout.LINE_END);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setOpaque(false);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel30, java.awt.BorderLayout.LINE_START);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setOpaque(false);
        jPanel31.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel31, java.awt.BorderLayout.PAGE_START);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setOpaque(false);
        jPanel32.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel32, java.awt.BorderLayout.PAGE_END);

        jPanel28.setOpaque(false);
        jPanel28.setLayout(new java.awt.BorderLayout());

        jPanel38.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel38.setOpaque(false);
        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel25.setMinimumSize(new java.awt.Dimension(286, 0));
        jPanel25.setOpaque(false);
        jPanel25.setLayout(new java.awt.BorderLayout());

        jPanel36.setOpaque(false);
        jPanel36.setLayout(new java.awt.BorderLayout());
        jPanel25.add(jPanel36, java.awt.BorderLayout.CENTER);

        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        content2.setBackground(new java.awt.Color(255, 255, 255));
        content2.setLayout(new java.awt.BorderLayout());

        container6.setkEndColor(new java.awt.Color(204, 204, 204));
        container6.setkFillBackground(false);
        container6.setkStartColor(new java.awt.Color(204, 204, 204));
        container6.setOpaque(false);
        container6.setLayout(new java.awt.BorderLayout());

        jPanel11.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(284, 40));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel21.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel21, java.awt.BorderLayout.LINE_END);

        jPanel123.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel123.setOpaque(false);
        jPanel123.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel123Layout = new javax.swing.GroupLayout(jPanel123);
        jPanel123.setLayout(jPanel123Layout);
        jPanel123Layout.setHorizontalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel123Layout.setVerticalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel123, java.awt.BorderLayout.LINE_START);

        needBorder2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder2.setToolTipText("Hlello");
        needBorder2.setOpaque(false);
        needBorder2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel125.setOpaque(false);
        jPanel125.setLayout(new java.awt.BorderLayout());

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title3.setForeground(new java.awt.Color(0, 0, 0));
        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("D");
        jPanel125.add(title3, java.awt.BorderLayout.CENTER);

        needBorder2.add(jPanel125);

        jPanel126.setOpaque(false);
        jPanel126.setLayout(new java.awt.BorderLayout());

        title4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title4.setForeground(new java.awt.Color(0, 0, 0));
        title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title4.setText("L");
        jPanel126.add(title4, java.awt.BorderLayout.CENTER);

        needBorder2.add(jPanel126);

        jPanel127.setOpaque(false);
        jPanel127.setLayout(new java.awt.BorderLayout());

        title5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title5.setForeground(new java.awt.Color(0, 0, 0));
        title5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title5.setText("M");
        jPanel127.add(title5, java.awt.BorderLayout.CENTER);

        needBorder2.add(jPanel127);

        jPanel128.setOpaque(false);
        jPanel128.setLayout(new java.awt.BorderLayout());

        title6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title6.setForeground(new java.awt.Color(0, 0, 0));
        title6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title6.setText("M");
        jPanel128.add(title6, java.awt.BorderLayout.CENTER);

        needBorder2.add(jPanel128);

        jPanel129.setOpaque(false);
        jPanel129.setLayout(new java.awt.BorderLayout());

        title7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title7.setForeground(new java.awt.Color(0, 0, 0));
        title7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title7.setText("J");
        jPanel129.add(title7, java.awt.BorderLayout.CENTER);

        needBorder2.add(jPanel129);

        jPanel130.setOpaque(false);
        jPanel130.setLayout(new java.awt.BorderLayout());

        title8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title8.setForeground(new java.awt.Color(0, 0, 0));
        title8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title8.setText("V");
        jPanel130.add(title8, java.awt.BorderLayout.CENTER);

        needBorder2.add(jPanel130);

        jPanel131.setOpaque(false);
        jPanel131.setLayout(new java.awt.BorderLayout());

        title9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title9.setForeground(new java.awt.Color(0, 0, 0));
        title9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title9.setText("S");
        jPanel131.add(title9, java.awt.BorderLayout.CENTER);

        needBorder2.add(jPanel131);

        jPanel11.add(needBorder2, java.awt.BorderLayout.CENTER);

        container6.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel132.setOpaque(false);
        jPanel132.setLayout(new java.awt.BorderLayout());

        jPanel133.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel133.setOpaque(false);
        jPanel133.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel133Layout = new javax.swing.GroupLayout(jPanel133);
        jPanel133.setLayout(jPanel133Layout);
        jPanel133Layout.setHorizontalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel133Layout.setVerticalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        jPanel132.add(jPanel133, java.awt.BorderLayout.LINE_END);

        jPanel134.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel134.setOpaque(false);
        jPanel134.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel134Layout = new javax.swing.GroupLayout(jPanel134);
        jPanel134.setLayout(jPanel134Layout);
        jPanel134Layout.setHorizontalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel134Layout.setVerticalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        jPanel132.add(jPanel134, java.awt.BorderLayout.LINE_START);

        jPanel135.setBackground(new java.awt.Color(255, 255, 255));
        jPanel135.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel135.setOpaque(false);

        javax.swing.GroupLayout jPanel135Layout = new javax.swing.GroupLayout(jPanel135);
        jPanel135.setLayout(jPanel135Layout);
        jPanel135Layout.setHorizontalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        jPanel135Layout.setVerticalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel132.add(jPanel135, java.awt.BorderLayout.PAGE_END);

        jPanel136.setBackground(new java.awt.Color(255, 255, 255));
        jPanel136.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel136.setOpaque(false);

        javax.swing.GroupLayout jPanel136Layout = new javax.swing.GroupLayout(jPanel136);
        jPanel136.setLayout(jPanel136Layout);
        jPanel136Layout.setHorizontalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        jPanel136Layout.setVerticalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel132.add(jPanel136, java.awt.BorderLayout.PAGE_START);

        jPanel137.setOpaque(false);
        jPanel137.setLayout(new java.awt.GridLayout(6, 7));

        jPanel138.setOpaque(false);
        jPanel138.setLayout(new java.awt.BorderLayout());

        g1.setkBorderRadius(50);
        g1.setkEndColor(new java.awt.Color(255, 255, 255));
        g1.setkStartColor(new java.awt.Color(255, 255, 255));
        g1.setOpaque(false);
        g1.setPreferredSize(new java.awt.Dimension(37, 38));
        g1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g1MouseClicked(evt);
            }
        });
        g1.setLayout(new java.awt.BorderLayout());

        d1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d1.setForeground(new java.awt.Color(0, 0, 0));
        d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d1.setText("10");
        g1.add(d1, java.awt.BorderLayout.CENTER);

        jPanel138.add(g1, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel138);

        jPanel139.setOpaque(false);
        jPanel139.setLayout(new java.awt.BorderLayout());

        g2.setkBorderRadius(50);
        g2.setkEndColor(new java.awt.Color(255, 255, 255));
        g2.setkStartColor(new java.awt.Color(255, 255, 255));
        g2.setOpaque(false);
        g2.setPreferredSize(new java.awt.Dimension(37, 38));
        g2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g2MouseClicked(evt);
            }
        });
        g2.setLayout(new java.awt.BorderLayout());

        d2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d2.setForeground(new java.awt.Color(0, 0, 0));
        d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d2.setText("10");
        g2.add(d2, java.awt.BorderLayout.CENTER);

        jPanel139.add(g2, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel139);

        jPanel140.setOpaque(false);
        jPanel140.setLayout(new java.awt.BorderLayout());

        g3.setkBorderRadius(50);
        g3.setkEndColor(new java.awt.Color(255, 255, 255));
        g3.setkStartColor(new java.awt.Color(255, 255, 255));
        g3.setOpaque(false);
        g3.setPreferredSize(new java.awt.Dimension(37, 38));
        g3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g3MouseClicked(evt);
            }
        });
        g3.setLayout(new java.awt.BorderLayout());

        d3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d3.setForeground(new java.awt.Color(0, 0, 0));
        d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d3.setText("10");
        g3.add(d3, java.awt.BorderLayout.CENTER);

        jPanel140.add(g3, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel140);

        jPanel141.setOpaque(false);
        jPanel141.setLayout(new java.awt.BorderLayout());

        g4.setkBorderRadius(50);
        g4.setkEndColor(new java.awt.Color(255, 255, 255));
        g4.setkStartColor(new java.awt.Color(255, 255, 255));
        g4.setOpaque(false);
        g4.setPreferredSize(new java.awt.Dimension(37, 38));
        g4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g4MouseClicked(evt);
            }
        });
        g4.setLayout(new java.awt.BorderLayout());

        d4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d4.setForeground(new java.awt.Color(0, 0, 0));
        d4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d4.setText("10");
        g4.add(d4, java.awt.BorderLayout.CENTER);

        jPanel141.add(g4, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel141);

        jPanel142.setOpaque(false);
        jPanel142.setLayout(new java.awt.BorderLayout());

        g5.setkBorderRadius(50);
        g5.setkEndColor(new java.awt.Color(255, 255, 255));
        g5.setkStartColor(new java.awt.Color(255, 255, 255));
        g5.setOpaque(false);
        g5.setPreferredSize(new java.awt.Dimension(37, 38));
        g5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g5MouseClicked(evt);
            }
        });
        g5.setLayout(new java.awt.BorderLayout());

        d5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d5.setForeground(new java.awt.Color(0, 0, 0));
        d5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d5.setText("10");
        g5.add(d5, java.awt.BorderLayout.CENTER);

        jPanel142.add(g5, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel142);

        jPanel143.setOpaque(false);
        jPanel143.setLayout(new java.awt.BorderLayout());

        g6.setkBorderRadius(50);
        g6.setkEndColor(new java.awt.Color(255, 255, 255));
        g6.setkStartColor(new java.awt.Color(255, 255, 255));
        g6.setOpaque(false);
        g6.setPreferredSize(new java.awt.Dimension(37, 38));
        g6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g6MouseClicked(evt);
            }
        });
        g6.setLayout(new java.awt.BorderLayout());

        d6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d6.setForeground(new java.awt.Color(0, 0, 0));
        d6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d6.setText("10");
        g6.add(d6, java.awt.BorderLayout.CENTER);

        jPanel143.add(g6, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel143);

        jPanel144.setOpaque(false);
        jPanel144.setLayout(new java.awt.BorderLayout());

        g7.setkBorderRadius(50);
        g7.setkEndColor(new java.awt.Color(255, 255, 255));
        g7.setkStartColor(new java.awt.Color(255, 255, 255));
        g7.setOpaque(false);
        g7.setPreferredSize(new java.awt.Dimension(37, 38));
        g7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g7MouseClicked(evt);
            }
        });
        g7.setLayout(new java.awt.BorderLayout());

        d7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d7.setForeground(new java.awt.Color(0, 0, 0));
        d7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d7.setText("10");
        g7.add(d7, java.awt.BorderLayout.CENTER);

        jPanel144.add(g7, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel144);

        jPanel145.setOpaque(false);
        jPanel145.setLayout(new java.awt.BorderLayout());

        g8.setkBorderRadius(50);
        g8.setkEndColor(new java.awt.Color(255, 255, 255));
        g8.setkStartColor(new java.awt.Color(255, 255, 255));
        g8.setOpaque(false);
        g8.setPreferredSize(new java.awt.Dimension(37, 38));
        g8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g8MouseClicked(evt);
            }
        });
        g8.setLayout(new java.awt.BorderLayout());

        d8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d8.setForeground(new java.awt.Color(0, 0, 0));
        d8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d8.setText("10");
        g8.add(d8, java.awt.BorderLayout.CENTER);

        jPanel145.add(g8, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel145);

        jPanel146.setOpaque(false);
        jPanel146.setLayout(new java.awt.BorderLayout());

        g9.setkBorderRadius(50);
        g9.setkEndColor(new java.awt.Color(255, 255, 255));
        g9.setkStartColor(new java.awt.Color(255, 255, 255));
        g9.setOpaque(false);
        g9.setPreferredSize(new java.awt.Dimension(37, 38));
        g9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g9MouseClicked(evt);
            }
        });
        g9.setLayout(new java.awt.BorderLayout());

        d9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d9.setForeground(new java.awt.Color(0, 0, 0));
        d9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d9.setText("10");
        g9.add(d9, java.awt.BorderLayout.CENTER);

        jPanel146.add(g9, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel146);

        jPanel147.setOpaque(false);
        jPanel147.setLayout(new java.awt.BorderLayout());

        g10.setkBorderRadius(50);
        g10.setkEndColor(new java.awt.Color(255, 255, 255));
        g10.setkStartColor(new java.awt.Color(255, 255, 255));
        g10.setOpaque(false);
        g10.setPreferredSize(new java.awt.Dimension(37, 38));
        g10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g10MouseClicked(evt);
            }
        });
        g10.setLayout(new java.awt.BorderLayout());

        d10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d10.setForeground(new java.awt.Color(0, 0, 0));
        d10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d10.setText("10");
        g10.add(d10, java.awt.BorderLayout.CENTER);

        jPanel147.add(g10, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel147);

        jPanel148.setOpaque(false);
        jPanel148.setLayout(new java.awt.BorderLayout());

        g11.setkBorderRadius(50);
        g11.setkEndColor(new java.awt.Color(255, 255, 255));
        g11.setkStartColor(new java.awt.Color(255, 255, 255));
        g11.setOpaque(false);
        g11.setPreferredSize(new java.awt.Dimension(37, 38));
        g11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g11MouseClicked(evt);
            }
        });
        g11.setLayout(new java.awt.BorderLayout());

        d11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d11.setForeground(new java.awt.Color(0, 0, 0));
        d11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d11.setText("10");
        g11.add(d11, java.awt.BorderLayout.CENTER);

        jPanel148.add(g11, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel148);

        jPanel149.setOpaque(false);
        jPanel149.setLayout(new java.awt.BorderLayout());

        g12.setkBorderRadius(50);
        g12.setkEndColor(new java.awt.Color(255, 255, 255));
        g12.setkStartColor(new java.awt.Color(255, 255, 255));
        g12.setOpaque(false);
        g12.setPreferredSize(new java.awt.Dimension(37, 38));
        g12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g12MouseClicked(evt);
            }
        });
        g12.setLayout(new java.awt.BorderLayout());

        d12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d12.setForeground(new java.awt.Color(0, 0, 0));
        d12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d12.setText("10");
        g12.add(d12, java.awt.BorderLayout.CENTER);

        jPanel149.add(g12, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel149);

        jPanel150.setOpaque(false);
        jPanel150.setLayout(new java.awt.BorderLayout());

        g13.setkBorderRadius(50);
        g13.setkEndColor(new java.awt.Color(255, 255, 255));
        g13.setkStartColor(new java.awt.Color(255, 255, 255));
        g13.setOpaque(false);
        g13.setPreferredSize(new java.awt.Dimension(37, 38));
        g13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g13MouseClicked(evt);
            }
        });
        g13.setLayout(new java.awt.BorderLayout());

        d13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d13.setForeground(new java.awt.Color(0, 0, 0));
        d13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d13.setText("10");
        g13.add(d13, java.awt.BorderLayout.CENTER);

        jPanel150.add(g13, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel150);

        jPanel151.setOpaque(false);
        jPanel151.setLayout(new java.awt.BorderLayout());

        g14.setkBorderRadius(50);
        g14.setkEndColor(new java.awt.Color(255, 255, 255));
        g14.setkStartColor(new java.awt.Color(255, 255, 255));
        g14.setOpaque(false);
        g14.setPreferredSize(new java.awt.Dimension(37, 38));
        g14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g14MouseClicked(evt);
            }
        });
        g14.setLayout(new java.awt.BorderLayout());

        d14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d14.setForeground(new java.awt.Color(0, 0, 0));
        d14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d14.setText("10");
        g14.add(d14, java.awt.BorderLayout.CENTER);

        jPanel151.add(g14, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel151);

        jPanel152.setOpaque(false);
        jPanel152.setLayout(new java.awt.BorderLayout());

        g15.setkBorderRadius(50);
        g15.setkEndColor(new java.awt.Color(255, 255, 255));
        g15.setkStartColor(new java.awt.Color(255, 255, 255));
        g15.setOpaque(false);
        g15.setPreferredSize(new java.awt.Dimension(37, 38));
        g15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g15MouseClicked(evt);
            }
        });
        g15.setLayout(new java.awt.BorderLayout());

        d15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d15.setForeground(new java.awt.Color(0, 0, 0));
        d15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d15.setText("10");
        g15.add(d15, java.awt.BorderLayout.CENTER);

        jPanel152.add(g15, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel152);

        jPanel153.setOpaque(false);
        jPanel153.setLayout(new java.awt.BorderLayout());

        g16.setkBorderRadius(50);
        g16.setkEndColor(new java.awt.Color(255, 255, 255));
        g16.setkStartColor(new java.awt.Color(255, 255, 255));
        g16.setOpaque(false);
        g16.setPreferredSize(new java.awt.Dimension(37, 38));
        g16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g16MouseClicked(evt);
            }
        });
        g16.setLayout(new java.awt.BorderLayout());

        d16.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d16.setForeground(new java.awt.Color(0, 0, 0));
        d16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d16.setText("10");
        g16.add(d16, java.awt.BorderLayout.CENTER);

        jPanel153.add(g16, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel153);

        jPanel154.setOpaque(false);
        jPanel154.setLayout(new java.awt.BorderLayout());

        g17.setkBorderRadius(50);
        g17.setkEndColor(new java.awt.Color(255, 255, 255));
        g17.setkStartColor(new java.awt.Color(255, 255, 255));
        g17.setOpaque(false);
        g17.setPreferredSize(new java.awt.Dimension(37, 38));
        g17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g17MouseClicked(evt);
            }
        });
        g17.setLayout(new java.awt.BorderLayout());

        d17.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d17.setForeground(new java.awt.Color(0, 0, 0));
        d17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d17.setText("10");
        g17.add(d17, java.awt.BorderLayout.CENTER);

        jPanel154.add(g17, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel154);

        jPanel155.setOpaque(false);
        jPanel155.setLayout(new java.awt.BorderLayout());

        g18.setkBorderRadius(50);
        g18.setkEndColor(new java.awt.Color(255, 255, 255));
        g18.setkStartColor(new java.awt.Color(255, 255, 255));
        g18.setOpaque(false);
        g18.setPreferredSize(new java.awt.Dimension(37, 38));
        g18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g18MouseClicked(evt);
            }
        });
        g18.setLayout(new java.awt.BorderLayout());

        d18.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d18.setForeground(new java.awt.Color(0, 0, 0));
        d18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d18.setText("10");
        g18.add(d18, java.awt.BorderLayout.CENTER);

        jPanel155.add(g18, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel155);

        jPanel156.setOpaque(false);
        jPanel156.setLayout(new java.awt.BorderLayout());

        g19.setkBorderRadius(50);
        g19.setkEndColor(new java.awt.Color(255, 255, 255));
        g19.setkStartColor(new java.awt.Color(255, 255, 255));
        g19.setOpaque(false);
        g19.setPreferredSize(new java.awt.Dimension(37, 38));
        g19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g19MouseClicked(evt);
            }
        });
        g19.setLayout(new java.awt.BorderLayout());

        d19.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d19.setForeground(new java.awt.Color(0, 0, 0));
        d19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d19.setText("10");
        g19.add(d19, java.awt.BorderLayout.CENTER);

        jPanel156.add(g19, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel156);

        jPanel157.setOpaque(false);
        jPanel157.setLayout(new java.awt.BorderLayout());

        g20.setkBorderRadius(50);
        g20.setkEndColor(new java.awt.Color(255, 255, 255));
        g20.setkStartColor(new java.awt.Color(255, 255, 255));
        g20.setOpaque(false);
        g20.setPreferredSize(new java.awt.Dimension(37, 38));
        g20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g20MouseClicked(evt);
            }
        });
        g20.setLayout(new java.awt.BorderLayout());

        d20.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d20.setForeground(new java.awt.Color(0, 0, 0));
        d20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g20.add(d20, java.awt.BorderLayout.CENTER);

        jPanel157.add(g20, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel157);

        jPanel158.setOpaque(false);
        jPanel158.setLayout(new java.awt.BorderLayout());

        g21.setkBorderRadius(50);
        g21.setkEndColor(new java.awt.Color(255, 255, 255));
        g21.setkStartColor(new java.awt.Color(255, 255, 255));
        g21.setOpaque(false);
        g21.setPreferredSize(new java.awt.Dimension(37, 38));
        g21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g21MouseClicked(evt);
            }
        });
        g21.setLayout(new java.awt.BorderLayout());

        d21.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d21.setForeground(new java.awt.Color(0, 0, 0));
        d21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g21.add(d21, java.awt.BorderLayout.CENTER);

        jPanel158.add(g21, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel158);

        jPanel159.setOpaque(false);
        jPanel159.setLayout(new java.awt.BorderLayout());

        g22.setkBorderRadius(50);
        g22.setkEndColor(new java.awt.Color(255, 255, 255));
        g22.setkStartColor(new java.awt.Color(255, 255, 255));
        g22.setOpaque(false);
        g22.setPreferredSize(new java.awt.Dimension(37, 38));
        g22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g22MouseClicked(evt);
            }
        });
        g22.setLayout(new java.awt.BorderLayout());

        d22.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d22.setForeground(new java.awt.Color(0, 0, 0));
        d22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g22.add(d22, java.awt.BorderLayout.CENTER);

        jPanel159.add(g22, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel159);

        jPanel160.setOpaque(false);
        jPanel160.setLayout(new java.awt.BorderLayout());

        g23.setkBorderRadius(50);
        g23.setkEndColor(new java.awt.Color(255, 255, 255));
        g23.setkStartColor(new java.awt.Color(255, 255, 255));
        g23.setOpaque(false);
        g23.setPreferredSize(new java.awt.Dimension(37, 38));
        g23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g23MouseClicked(evt);
            }
        });
        g23.setLayout(new java.awt.BorderLayout());

        d23.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d23.setForeground(new java.awt.Color(0, 0, 0));
        d23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g23.add(d23, java.awt.BorderLayout.CENTER);

        jPanel160.add(g23, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel160);

        jPanel161.setOpaque(false);
        jPanel161.setLayout(new java.awt.BorderLayout());

        g24.setkBorderRadius(50);
        g24.setkEndColor(new java.awt.Color(255, 255, 255));
        g24.setkStartColor(new java.awt.Color(255, 255, 255));
        g24.setOpaque(false);
        g24.setPreferredSize(new java.awt.Dimension(37, 38));
        g24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g24MouseClicked(evt);
            }
        });
        g24.setLayout(new java.awt.BorderLayout());

        d24.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d24.setForeground(new java.awt.Color(0, 0, 0));
        d24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g24.add(d24, java.awt.BorderLayout.CENTER);

        jPanel161.add(g24, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel161);

        jPanel162.setOpaque(false);
        jPanel162.setLayout(new java.awt.BorderLayout());

        g25.setkBorderRadius(50);
        g25.setkEndColor(new java.awt.Color(255, 255, 255));
        g25.setkStartColor(new java.awt.Color(255, 255, 255));
        g25.setOpaque(false);
        g25.setPreferredSize(new java.awt.Dimension(37, 38));
        g25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g25MouseClicked(evt);
            }
        });
        g25.setLayout(new java.awt.BorderLayout());

        d25.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d25.setForeground(new java.awt.Color(0, 0, 0));
        d25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g25.add(d25, java.awt.BorderLayout.CENTER);

        jPanel162.add(g25, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel162);

        jPanel163.setOpaque(false);
        jPanel163.setLayout(new java.awt.BorderLayout());

        g26.setkBorderRadius(50);
        g26.setkEndColor(new java.awt.Color(255, 255, 255));
        g26.setkStartColor(new java.awt.Color(255, 255, 255));
        g26.setOpaque(false);
        g26.setPreferredSize(new java.awt.Dimension(37, 38));
        g26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g26MouseClicked(evt);
            }
        });
        g26.setLayout(new java.awt.BorderLayout());

        d26.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d26.setForeground(new java.awt.Color(0, 0, 0));
        d26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g26.add(d26, java.awt.BorderLayout.CENTER);

        jPanel163.add(g26, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel163);

        jPanel164.setOpaque(false);
        jPanel164.setLayout(new java.awt.BorderLayout());

        g27.setkBorderRadius(50);
        g27.setkEndColor(new java.awt.Color(255, 255, 255));
        g27.setkStartColor(new java.awt.Color(255, 255, 255));
        g27.setOpaque(false);
        g27.setPreferredSize(new java.awt.Dimension(37, 38));
        g27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g27MouseClicked(evt);
            }
        });
        g27.setLayout(new java.awt.BorderLayout());

        d27.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d27.setForeground(new java.awt.Color(0, 0, 0));
        d27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g27.add(d27, java.awt.BorderLayout.CENTER);

        jPanel164.add(g27, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel164);

        jPanel165.setOpaque(false);
        jPanel165.setLayout(new java.awt.BorderLayout());

        g28.setkBorderRadius(50);
        g28.setkEndColor(new java.awt.Color(255, 255, 255));
        g28.setkStartColor(new java.awt.Color(255, 255, 255));
        g28.setOpaque(false);
        g28.setPreferredSize(new java.awt.Dimension(37, 38));
        g28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g28MouseClicked(evt);
            }
        });
        g28.setLayout(new java.awt.BorderLayout());

        d28.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d28.setForeground(new java.awt.Color(0, 0, 0));
        d28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g28.add(d28, java.awt.BorderLayout.CENTER);

        jPanel165.add(g28, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel165);

        jPanel166.setOpaque(false);
        jPanel166.setLayout(new java.awt.BorderLayout());

        g29.setkBorderRadius(50);
        g29.setkEndColor(new java.awt.Color(255, 255, 255));
        g29.setkStartColor(new java.awt.Color(255, 255, 255));
        g29.setOpaque(false);
        g29.setPreferredSize(new java.awt.Dimension(37, 38));
        g29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g29MouseClicked(evt);
            }
        });
        g29.setLayout(new java.awt.BorderLayout());

        d29.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d29.setForeground(new java.awt.Color(0, 0, 0));
        d29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g29.add(d29, java.awt.BorderLayout.CENTER);

        jPanel166.add(g29, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel166);

        jPanel167.setOpaque(false);
        jPanel167.setLayout(new java.awt.BorderLayout());

        g30.setkBorderRadius(50);
        g30.setkEndColor(new java.awt.Color(255, 255, 255));
        g30.setkStartColor(new java.awt.Color(255, 255, 255));
        g30.setOpaque(false);
        g30.setPreferredSize(new java.awt.Dimension(37, 38));
        g30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g30MouseClicked(evt);
            }
        });
        g30.setLayout(new java.awt.BorderLayout());

        d30.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d30.setForeground(new java.awt.Color(0, 0, 0));
        d30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g30.add(d30, java.awt.BorderLayout.CENTER);

        jPanel167.add(g30, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel167);

        jPanel168.setOpaque(false);
        jPanel168.setLayout(new java.awt.BorderLayout());

        g31.setkBorderRadius(50);
        g31.setkEndColor(new java.awt.Color(255, 255, 255));
        g31.setkStartColor(new java.awt.Color(255, 255, 255));
        g31.setOpaque(false);
        g31.setPreferredSize(new java.awt.Dimension(37, 38));
        g31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g31MouseClicked(evt);
            }
        });
        g31.setLayout(new java.awt.BorderLayout());

        d31.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d31.setForeground(new java.awt.Color(0, 0, 0));
        d31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g31.add(d31, java.awt.BorderLayout.CENTER);

        jPanel168.add(g31, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel168);

        jPanel169.setOpaque(false);
        jPanel169.setLayout(new java.awt.BorderLayout());

        g32.setkBorderRadius(50);
        g32.setkEndColor(new java.awt.Color(255, 255, 255));
        g32.setkStartColor(new java.awt.Color(255, 255, 255));
        g32.setOpaque(false);
        g32.setPreferredSize(new java.awt.Dimension(37, 38));
        g32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g32MouseClicked(evt);
            }
        });
        g32.setLayout(new java.awt.BorderLayout());

        d32.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d32.setForeground(new java.awt.Color(0, 0, 0));
        d32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g32.add(d32, java.awt.BorderLayout.CENTER);

        jPanel169.add(g32, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel169);

        jPanel170.setOpaque(false);
        jPanel170.setLayout(new java.awt.BorderLayout());

        g33.setkBorderRadius(50);
        g33.setkEndColor(new java.awt.Color(255, 255, 255));
        g33.setkStartColor(new java.awt.Color(255, 255, 255));
        g33.setOpaque(false);
        g33.setPreferredSize(new java.awt.Dimension(37, 38));
        g33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g33MouseClicked(evt);
            }
        });
        g33.setLayout(new java.awt.BorderLayout());

        d33.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d33.setForeground(new java.awt.Color(0, 0, 0));
        d33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g33.add(d33, java.awt.BorderLayout.CENTER);

        jPanel170.add(g33, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel170);

        jPanel171.setOpaque(false);
        jPanel171.setLayout(new java.awt.BorderLayout());

        g34.setkBorderRadius(50);
        g34.setkEndColor(new java.awt.Color(255, 255, 255));
        g34.setkStartColor(new java.awt.Color(255, 255, 255));
        g34.setOpaque(false);
        g34.setPreferredSize(new java.awt.Dimension(37, 38));
        g34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g34MouseClicked(evt);
            }
        });
        g34.setLayout(new java.awt.BorderLayout());

        d34.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d34.setForeground(new java.awt.Color(0, 0, 0));
        d34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g34.add(d34, java.awt.BorderLayout.CENTER);

        jPanel171.add(g34, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel171);

        jPanel172.setOpaque(false);
        jPanel172.setLayout(new java.awt.BorderLayout());

        g35.setkBorderRadius(50);
        g35.setkEndColor(new java.awt.Color(255, 255, 255));
        g35.setkStartColor(new java.awt.Color(255, 255, 255));
        g35.setOpaque(false);
        g35.setPreferredSize(new java.awt.Dimension(37, 38));
        g35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g35MouseClicked(evt);
            }
        });
        g35.setLayout(new java.awt.BorderLayout());

        d35.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d35.setForeground(new java.awt.Color(0, 0, 0));
        d35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g35.add(d35, java.awt.BorderLayout.CENTER);

        jPanel172.add(g35, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel172);

        jPanel173.setOpaque(false);
        jPanel173.setLayout(new java.awt.BorderLayout());

        g36.setkBorderRadius(50);
        g36.setkEndColor(new java.awt.Color(255, 255, 255));
        g36.setkStartColor(new java.awt.Color(255, 255, 255));
        g36.setOpaque(false);
        g36.setPreferredSize(new java.awt.Dimension(37, 38));
        g36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g36MouseClicked(evt);
            }
        });
        g36.setLayout(new java.awt.BorderLayout());

        d36.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d36.setForeground(new java.awt.Color(0, 0, 0));
        d36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g36.add(d36, java.awt.BorderLayout.CENTER);

        jPanel173.add(g36, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel173);

        jPanel182.setOpaque(false);
        jPanel182.setLayout(new java.awt.BorderLayout());

        g37.setkBorderRadius(50);
        g37.setkEndColor(new java.awt.Color(255, 255, 255));
        g37.setkStartColor(new java.awt.Color(255, 255, 255));
        g37.setOpaque(false);
        g37.setPreferredSize(new java.awt.Dimension(37, 38));
        g37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g37MouseClicked(evt);
            }
        });
        g37.setLayout(new java.awt.BorderLayout());

        d37.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d37.setForeground(new java.awt.Color(0, 0, 0));
        d37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g37.add(d37, java.awt.BorderLayout.CENTER);

        jPanel182.add(g37, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel182);

        jPanel183.setOpaque(false);
        jPanel183.setLayout(new java.awt.BorderLayout());

        g38.setkBorderRadius(50);
        g38.setkEndColor(new java.awt.Color(255, 255, 255));
        g38.setkStartColor(new java.awt.Color(255, 255, 255));
        g38.setOpaque(false);
        g38.setPreferredSize(new java.awt.Dimension(37, 38));
        g38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g38MouseClicked(evt);
            }
        });
        g38.setLayout(new java.awt.BorderLayout());

        d38.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d38.setForeground(new java.awt.Color(0, 0, 0));
        d38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g38.add(d38, java.awt.BorderLayout.CENTER);

        jPanel183.add(g38, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel183);

        jPanel184.setOpaque(false);
        jPanel184.setLayout(new java.awt.BorderLayout());

        g39.setkBorderRadius(50);
        g39.setkEndColor(new java.awt.Color(255, 255, 255));
        g39.setkStartColor(new java.awt.Color(255, 255, 255));
        g39.setOpaque(false);
        g39.setPreferredSize(new java.awt.Dimension(37, 38));
        g39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g39MouseClicked(evt);
            }
        });
        g39.setLayout(new java.awt.BorderLayout());

        d39.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d39.setForeground(new java.awt.Color(0, 0, 0));
        d39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g39.add(d39, java.awt.BorderLayout.CENTER);

        jPanel184.add(g39, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel184);

        jPanel185.setOpaque(false);
        jPanel185.setLayout(new java.awt.BorderLayout());

        g40.setkBorderRadius(50);
        g40.setkEndColor(new java.awt.Color(255, 255, 255));
        g40.setkStartColor(new java.awt.Color(255, 255, 255));
        g40.setOpaque(false);
        g40.setPreferredSize(new java.awt.Dimension(37, 38));
        g40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g40MouseClicked(evt);
            }
        });
        g40.setLayout(new java.awt.BorderLayout());

        d40.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d40.setForeground(new java.awt.Color(0, 0, 0));
        d40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g40.add(d40, java.awt.BorderLayout.CENTER);

        jPanel185.add(g40, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel185);

        jPanel186.setOpaque(false);
        jPanel186.setLayout(new java.awt.BorderLayout());

        g41.setkBorderRadius(50);
        g41.setkEndColor(new java.awt.Color(255, 255, 255));
        g41.setkStartColor(new java.awt.Color(255, 255, 255));
        g41.setOpaque(false);
        g41.setPreferredSize(new java.awt.Dimension(37, 38));
        g41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g41MouseClicked(evt);
            }
        });
        g41.setLayout(new java.awt.BorderLayout());

        d41.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d41.setForeground(new java.awt.Color(0, 0, 0));
        d41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g41.add(d41, java.awt.BorderLayout.CENTER);

        jPanel186.add(g41, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel186);

        jPanel187.setOpaque(false);
        jPanel187.setLayout(new java.awt.BorderLayout());

        g42.setkBorderRadius(50);
        g42.setkEndColor(new java.awt.Color(255, 255, 255));
        g42.setkStartColor(new java.awt.Color(255, 255, 255));
        g42.setOpaque(false);
        g42.setPreferredSize(new java.awt.Dimension(37, 38));
        g42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g42MouseClicked(evt);
            }
        });
        g42.setLayout(new java.awt.BorderLayout());

        d42.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        d42.setForeground(new java.awt.Color(0, 0, 0));
        d42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g42.add(d42, java.awt.BorderLayout.CENTER);

        jPanel187.add(g42, java.awt.BorderLayout.CENTER);

        jPanel137.add(jPanel187);

        jPanel132.add(jPanel137, java.awt.BorderLayout.CENTER);

        container6.add(jPanel132, java.awt.BorderLayout.CENTER);

        content2.add(container6, java.awt.BorderLayout.PAGE_START);

        jPanel174.setOpaque(false);
        jPanel174.setLayout(new java.awt.BorderLayout());

        jPanel175.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel175.setOpaque(false);
        jPanel175.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel175Layout = new javax.swing.GroupLayout(jPanel175);
        jPanel175.setLayout(jPanel175Layout);
        jPanel175Layout.setHorizontalGroup(
            jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel175Layout.setVerticalGroup(
            jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        jPanel174.add(jPanel175, java.awt.BorderLayout.LINE_START);

        jPanel176.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel176.setOpaque(false);
        jPanel176.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel176Layout = new javax.swing.GroupLayout(jPanel176);
        jPanel176.setLayout(jPanel176Layout);
        jPanel176Layout.setHorizontalGroup(
            jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel176Layout.setVerticalGroup(
            jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        jPanel174.add(jPanel176, java.awt.BorderLayout.LINE_END);

        jPanel177.setBackground(new java.awt.Color(255, 255, 255));
        jPanel177.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel177.setOpaque(false);

        javax.swing.GroupLayout jPanel177Layout = new javax.swing.GroupLayout(jPanel177);
        jPanel177.setLayout(jPanel177Layout);
        jPanel177Layout.setHorizontalGroup(
            jPanel177Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        jPanel177Layout.setVerticalGroup(
            jPanel177Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel174.add(jPanel177, java.awt.BorderLayout.PAGE_START);

        jPanel178.setBackground(new java.awt.Color(255, 255, 255));
        jPanel178.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel178.setOpaque(false);

        javax.swing.GroupLayout jPanel178Layout = new javax.swing.GroupLayout(jPanel178);
        jPanel178.setLayout(jPanel178Layout);
        jPanel178Layout.setHorizontalGroup(
            jPanel178Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        jPanel178Layout.setVerticalGroup(
            jPanel178Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel174.add(jPanel178, java.awt.BorderLayout.PAGE_END);

        jPanel179.setOpaque(false);

        needBorder3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder3.setOpaque(false);
        needBorder3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel180.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel180.setOpaque(false);
        jPanel180.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel180MouseClicked(evt);
            }
        });

        title10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title10.setForeground(new java.awt.Color(0, 0, 0));
        title10.setText("Anterior");

        javax.swing.GroupLayout jPanel180Layout = new javax.swing.GroupLayout(jPanel180);
        jPanel180.setLayout(jPanel180Layout);
        jPanel180Layout.setHorizontalGroup(
            jPanel180Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel180Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title10)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel180Layout.setVerticalGroup(
            jPanel180Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel180Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel180Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        needBorder3.add(jPanel180);

        jPanel181.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel181.setOpaque(false);
        jPanel181.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel181MouseClicked(evt);
            }
        });

        title11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title11.setForeground(new java.awt.Color(0, 0, 0));
        title11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        title11.setText("Siguiente");

        javax.swing.GroupLayout jPanel181Layout = new javax.swing.GroupLayout(jPanel181);
        jPanel181.setLayout(jPanel181Layout);
        jPanel181Layout.setHorizontalGroup(
            jPanel181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel181Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(title11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel181Layout.setVerticalGroup(
            jPanel181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel181Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap())
        );

        needBorder3.add(jPanel181);

        javax.swing.GroupLayout jPanel179Layout = new javax.swing.GroupLayout(jPanel179);
        jPanel179.setLayout(jPanel179Layout);
        jPanel179Layout.setHorizontalGroup(
            jPanel179Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(needBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        jPanel179Layout.setVerticalGroup(
            jPanel179Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel179Layout.createSequentialGroup()
                .addComponent(needBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jPanel174.add(jPanel179, java.awt.BorderLayout.CENTER);

        content2.add(jPanel174, java.awt.BorderLayout.CENTER);

        scrollPanel.setViewportView(content2);

        jPanel25.add(scrollPanel, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel25, java.awt.BorderLayout.CENTER);

        jPanel28.add(jPanel38, java.awt.BorderLayout.LINE_END);

        jPanel39.setOpaque(false);
        jPanel39.setLayout(new java.awt.BorderLayout());

        jPanel120.setBackground(new java.awt.Color(255, 255, 255));
        jPanel120.setOpaque(false);

        javax.swing.GroupLayout jPanel120Layout = new javax.swing.GroupLayout(jPanel120);
        jPanel120.setLayout(jPanel120Layout);
        jPanel120Layout.setHorizontalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel120Layout.setVerticalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel120, java.awt.BorderLayout.LINE_END);

        jPanel121.setBackground(new java.awt.Color(255, 255, 255));
        jPanel121.setOpaque(false);
        jPanel121.setPreferredSize(new java.awt.Dimension(7, 540));

        javax.swing.GroupLayout jPanel121Layout = new javax.swing.GroupLayout(jPanel121);
        jPanel121.setLayout(jPanel121Layout);
        jPanel121Layout.setHorizontalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel121Layout.setVerticalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel121, java.awt.BorderLayout.LINE_START);

        appointmentsState.setOpaque(false);
        appointmentsState.setLayout(new java.awt.GridLayout(1, 0));
        jPanel39.add(appointmentsState, java.awt.BorderLayout.CENTER);

        jPanel28.add(jPanel39, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel28, java.awt.BorderLayout.CENTER);

        container5.add(jPanel22, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container5, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel20, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void g1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1MouseClicked
        selectionButton(g1, d1);
        addTargetsByLabel(d1);
    }//GEN-LAST:event_g1MouseClicked

    private void g2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g2MouseClicked
        selectionButton(g2, d2);
        addTargetsByLabel(d2);
    }//GEN-LAST:event_g2MouseClicked

    private void g3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g3MouseClicked
        selectionButton(g3, d3);
        addTargetsByLabel(d3);
    }//GEN-LAST:event_g3MouseClicked

    private void g4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g4MouseClicked
        selectionButton(g4, d4);
        addTargetsByLabel(d4);
    }//GEN-LAST:event_g4MouseClicked

    private void g5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g5MouseClicked
        selectionButton(g5, d5);
        addTargetsByLabel(d5);
    }//GEN-LAST:event_g5MouseClicked

    private void g6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g6MouseClicked
        selectionButton(g6, d6);
        addTargetsByLabel(d6);
    }//GEN-LAST:event_g6MouseClicked

    private void g7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g7MouseClicked
        selectionButton(g7, d7);
        addTargetsByLabel(d7);
    }//GEN-LAST:event_g7MouseClicked

    private void g8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g8MouseClicked
        selectionButton(g8, d8);
        addTargetsByLabel(d8);
    }//GEN-LAST:event_g8MouseClicked

    private void g9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g9MouseClicked
        selectionButton(g9, d9);
        addTargetsByLabel(d9);
    }//GEN-LAST:event_g9MouseClicked

    private void g10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g10MouseClicked
        selectionButton(g10, d10);
        addTargetsByLabel(d10);
    }//GEN-LAST:event_g10MouseClicked

    private void g11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g11MouseClicked
        selectionButton(g11, d11);
        addTargetsByLabel(d11);
    }//GEN-LAST:event_g11MouseClicked

    private void g12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g12MouseClicked
        selectionButton(g12, d12);
        addTargetsByLabel(d12);
    }//GEN-LAST:event_g12MouseClicked

    private void g13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g13MouseClicked
        selectionButton(g13, d13);
        addTargetsByLabel(d13);
    }//GEN-LAST:event_g13MouseClicked

    private void g14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g14MouseClicked
        selectionButton(g14, d14);
        addTargetsByLabel(d14);
    }//GEN-LAST:event_g14MouseClicked

    private void g15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g15MouseClicked
        selectionButton(g15, d15);
        addTargetsByLabel(d15);
    }//GEN-LAST:event_g15MouseClicked

    private void g16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g16MouseClicked
        selectionButton(g16, d16);
        addTargetsByLabel(d16);
    }//GEN-LAST:event_g16MouseClicked

    private void g17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g17MouseClicked
        selectionButton(g17, d17);
        addTargetsByLabel(d17);
    }//GEN-LAST:event_g17MouseClicked

    private void g18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g18MouseClicked
        selectionButton(g18, d18);
        addTargetsByLabel(d18);
    }//GEN-LAST:event_g18MouseClicked

    private void g19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g19MouseClicked
        selectionButton(g19, d19);
        addTargetsByLabel(d19);
    }//GEN-LAST:event_g19MouseClicked

    private void g20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g20MouseClicked
        selectionButton(g20, d20);
        addTargetsByLabel(d20);
    }//GEN-LAST:event_g20MouseClicked

    private void g21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g21MouseClicked
        selectionButton(g21, d21);
        addTargetsByLabel(d21);
    }//GEN-LAST:event_g21MouseClicked

    private void g22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g22MouseClicked
        selectionButton(g22, d22);
        addTargetsByLabel(d22);
    }//GEN-LAST:event_g22MouseClicked

    private void g23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g23MouseClicked
        selectionButton(g23, d23);
        addTargetsByLabel(d23);
    }//GEN-LAST:event_g23MouseClicked

    private void g24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g24MouseClicked
        selectionButton(g24, d24);
        addTargetsByLabel(d24);
    }//GEN-LAST:event_g24MouseClicked

    private void g25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g25MouseClicked
        selectionButton(g25, d25);
        addTargetsByLabel(d25);
    }//GEN-LAST:event_g25MouseClicked

    private void g26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g26MouseClicked
        selectionButton(g26, d26);
        addTargetsByLabel(d26);
    }//GEN-LAST:event_g26MouseClicked

    private void g27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g27MouseClicked
        selectionButton(g27, d27);
        addTargetsByLabel(d27);
    }//GEN-LAST:event_g27MouseClicked

    private void g28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g28MouseClicked
        selectionButton(g28, d28);
        addTargetsByLabel(d28);
    }//GEN-LAST:event_g28MouseClicked

    private void g29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g29MouseClicked
        selectionButton(g29, d29);
        addTargetsByLabel(d29);
    }//GEN-LAST:event_g29MouseClicked

    private void g30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g30MouseClicked
        selectionButton(g30, d30);
        addTargetsByLabel(d30);
    }//GEN-LAST:event_g30MouseClicked

    private void g31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g31MouseClicked
        selectionButton(g31, d31);
        addTargetsByLabel(d31);
    }//GEN-LAST:event_g31MouseClicked

    private void jPanel180MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel180MouseClicked
        if (monthValue == 1) {
            monthValue = 12;
            year--;
        } else {
            monthValue--;
        }

        setValuesCalendar(monthValue, year);
        LABELS_CALENDAR.forEach(label -> label.setForeground(ChoosedPalette.getTextColor()));
        CALENDAR_BUTTONS.forEach(button -> {
            button.setkStartColor(ChoosedPalette.getSecondaryBackground());
            button.setkEndColor(ChoosedPalette.getSecondaryBackground());
        });
        
        selectedDay = 0;
    }//GEN-LAST:event_jPanel180MouseClicked

    private void jPanel181MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel181MouseClicked
        if (monthValue == 12) {
            monthValue = 1;
            year++;
        } else {
            monthValue++;
        }

        setValuesCalendar(monthValue, year);
        LABELS_CALENDAR.forEach(label -> label.setForeground(ChoosedPalette.getTextColor()));
        CALENDAR_BUTTONS.forEach(button -> {
            button.setkStartColor(ChoosedPalette.getSecondaryBackground());
            button.setkEndColor(ChoosedPalette.getSecondaryBackground());
        });
        
        selectedDay = 0;
    }//GEN-LAST:event_jPanel181MouseClicked

    private void g32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g32MouseClicked
        selectionButton(g32, d32);
        addTargetsByLabel(d32);
    }//GEN-LAST:event_g32MouseClicked

    private void g33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g33MouseClicked
        selectionButton(g33, d33);
        addTargetsByLabel(d33);
    }//GEN-LAST:event_g33MouseClicked

    private void g34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g34MouseClicked
        selectionButton(g34, d34);
        addTargetsByLabel(d34);
    }//GEN-LAST:event_g34MouseClicked

    private void g35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g35MouseClicked
        selectionButton(g35, d35);
        addTargetsByLabel(d35);
    }//GEN-LAST:event_g35MouseClicked

    private void g36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g36MouseClicked
        selectionButton(g36, d36);
        addTargetsByLabel(d36);
    }//GEN-LAST:event_g36MouseClicked

    private void g37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g37MouseClicked
        selectionButton(g37, d37);
        addTargetsByLabel(d37);
    }//GEN-LAST:event_g37MouseClicked

    private void g38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g38MouseClicked
        selectionButton(g38, d38);
        addTargetsByLabel(d38);
    }//GEN-LAST:event_g38MouseClicked

    private void g39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g39MouseClicked
        selectionButton(g39, d39);
        addTargetsByLabel(d39);
    }//GEN-LAST:event_g39MouseClicked

    private void g40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g40MouseClicked
        selectionButton(g40, d40);
        addTargetsByLabel(d40);
    }//GEN-LAST:event_g40MouseClicked

    private void g41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g41MouseClicked
        selectionButton(g41, d41);
        addTargetsByLabel(d41);
    }//GEN-LAST:event_g41MouseClicked

    private void g42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g42MouseClicked
        selectionButton(g42, d42);
        addTargetsByLabel(d42);
    }//GEN-LAST:event_g42MouseClicked

    private void textField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyTyped
        addTargetsBy(selectedDay, textField1.getText() + evt.getKeyChar());
    }//GEN-LAST:event_textField1KeyTyped

    private void textField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField1MouseClicked
        if (textField1.getText().toLowerCase().contains("buscar")) {
            textField1.setText("");
        }
    }//GEN-LAST:event_textField1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appointmentsState;
    private javax.swing.JLabel back;
    private javax.swing.JLabel busquedaIcon;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container4;
    private com.k33ptoo.components.KGradientPanel container5;
    private com.k33ptoo.components.KGradientPanel container6;
    private javax.swing.JPanel content2;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d10;
    private javax.swing.JLabel d11;
    private javax.swing.JLabel d12;
    private javax.swing.JLabel d13;
    private javax.swing.JLabel d14;
    private javax.swing.JLabel d15;
    private javax.swing.JLabel d16;
    private javax.swing.JLabel d17;
    private javax.swing.JLabel d18;
    private javax.swing.JLabel d19;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d20;
    private javax.swing.JLabel d21;
    private javax.swing.JLabel d22;
    private javax.swing.JLabel d23;
    private javax.swing.JLabel d24;
    private javax.swing.JLabel d25;
    private javax.swing.JLabel d26;
    private javax.swing.JLabel d27;
    private javax.swing.JLabel d28;
    private javax.swing.JLabel d29;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d30;
    private javax.swing.JLabel d31;
    private javax.swing.JLabel d32;
    private javax.swing.JLabel d33;
    private javax.swing.JLabel d34;
    private javax.swing.JLabel d35;
    private javax.swing.JLabel d36;
    private javax.swing.JLabel d37;
    private javax.swing.JLabel d38;
    private javax.swing.JLabel d39;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d40;
    private javax.swing.JLabel d41;
    private javax.swing.JLabel d42;
    private javax.swing.JLabel d5;
    private javax.swing.JLabel d6;
    private javax.swing.JLabel d7;
    private javax.swing.JLabel d8;
    private javax.swing.JLabel d9;
    private javax.swing.JLabel fecha;
    private com.k33ptoo.components.KGradientPanel g1;
    private com.k33ptoo.components.KGradientPanel g10;
    private com.k33ptoo.components.KGradientPanel g11;
    private com.k33ptoo.components.KGradientPanel g12;
    private com.k33ptoo.components.KGradientPanel g13;
    private com.k33ptoo.components.KGradientPanel g14;
    private com.k33ptoo.components.KGradientPanel g15;
    private com.k33ptoo.components.KGradientPanel g16;
    private com.k33ptoo.components.KGradientPanel g17;
    private com.k33ptoo.components.KGradientPanel g18;
    private com.k33ptoo.components.KGradientPanel g19;
    private com.k33ptoo.components.KGradientPanel g2;
    private com.k33ptoo.components.KGradientPanel g20;
    private com.k33ptoo.components.KGradientPanel g21;
    private com.k33ptoo.components.KGradientPanel g22;
    private com.k33ptoo.components.KGradientPanel g23;
    private com.k33ptoo.components.KGradientPanel g24;
    private com.k33ptoo.components.KGradientPanel g25;
    private com.k33ptoo.components.KGradientPanel g26;
    private com.k33ptoo.components.KGradientPanel g27;
    private com.k33ptoo.components.KGradientPanel g28;
    private com.k33ptoo.components.KGradientPanel g29;
    private com.k33ptoo.components.KGradientPanel g3;
    private com.k33ptoo.components.KGradientPanel g30;
    private com.k33ptoo.components.KGradientPanel g31;
    private com.k33ptoo.components.KGradientPanel g32;
    private com.k33ptoo.components.KGradientPanel g33;
    private com.k33ptoo.components.KGradientPanel g34;
    private com.k33ptoo.components.KGradientPanel g35;
    private com.k33ptoo.components.KGradientPanel g36;
    private com.k33ptoo.components.KGradientPanel g37;
    private com.k33ptoo.components.KGradientPanel g38;
    private com.k33ptoo.components.KGradientPanel g39;
    private com.k33ptoo.components.KGradientPanel g4;
    private com.k33ptoo.components.KGradientPanel g40;
    private com.k33ptoo.components.KGradientPanel g41;
    private com.k33ptoo.components.KGradientPanel g42;
    private com.k33ptoo.components.KGradientPanel g5;
    private com.k33ptoo.components.KGradientPanel g6;
    private com.k33ptoo.components.KGradientPanel g7;
    private com.k33ptoo.components.KGradientPanel g8;
    private com.k33ptoo.components.KGradientPanel g9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel177;
    private javax.swing.JPanel jPanel178;
    private javax.swing.JPanel jPanel179;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel180;
    private javax.swing.JPanel jPanel181;
    private javax.swing.JPanel jPanel182;
    private javax.swing.JPanel jPanel183;
    private javax.swing.JPanel jPanel184;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel186;
    private javax.swing.JPanel jPanel187;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel needBorder;
    private javax.swing.JPanel needBorder1;
    private javax.swing.JPanel needBorder2;
    private javax.swing.JPanel needBorder3;
    private javax.swing.JLabel next;
    private com.utils.PanelRound panelRound1;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel text10;
    private javax.swing.JLabel text11;
    private javax.swing.JLabel text12;
    private javax.swing.JLabel text13;
    private javax.swing.JLabel text15;
    private javax.swing.JLabel text9;
    private javax.swing.JTextField textField1;
    private javax.swing.JLabel title10;
    private javax.swing.JLabel title11;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JLabel title7;
    private javax.swing.JLabel title8;
    private javax.swing.JLabel title9;
    // End of variables declaration//GEN-END:variables

}

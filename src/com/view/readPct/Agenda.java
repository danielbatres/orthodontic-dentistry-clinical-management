package com.view.readPct;

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
 */
public class Agenda extends Styles {
    ArrayList<KGradientPanel> CALENDAR_BUTTONS = new ArrayList<>();
    ArrayList<JLabel> LABELS_CALENDAR = new ArrayList<>();
    private int monthValue = 0;
    private int year = LocalDateTime.now().getYear();
    
    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        monthValue = LocalDateTime.now().getMonthValue();
        styleMyComponentBaby();
    }
    
    public void addTargets(int idPaciente) {
        agendaTargets.removeAll();
        ApplicationContext.agendaTargets.clear();
        ApplicationContext.consultasPacienteListadas = ConsultasHelper.obtenerConsultasPaciente(ConsultasHelper.getQUERY_CONSULTAS_ID() + idPaciente);
        
        ApplicationContext.consultasPacienteListadas.forEach(consulta -> {
            ApplicationContext.agendaTargets.add(new AgendaTarget(consulta));
        });
        
        ApplicationContext.agendaTargets.forEach(target -> {
            agendaTargets.add(target);
        });
        
        ApplicationContext.agendaTargets.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
        
        SwingUtilities.updateComponentTreeUI(agendaTargets);
        ApplicationContext.agendaGeneral.addTargets();
        ApplicationContext.agendaGeneralTargets.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
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
            case MAY:
                mesText = "Mayo";
                break;
            case APRIL:
                mesText = "Abril";
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
    
    @Override
    public void addTitlesAndSubtitles() {
        TITLES_AND_SUBTITLES.add(title1);
        TITLES_AND_SUBTITLES.add(title2);
        TITLES_AND_SUBTITLES.add(title3);
        TITLES_AND_SUBTITLES.add(title4);
        TITLES_AND_SUBTITLES.add(title5);
        TITLES_AND_SUBTITLES.add(title6);
        TITLES_AND_SUBTITLES.add(title7);
        TITLES_AND_SUBTITLES.add(title8);
        TITLES_AND_SUBTITLES.add(title9);
        TITLES_AND_SUBTITLES.add(title11);
        TITLES_AND_SUBTITLES.add(fecha);
    }

    @Override
    public void addPlainText() {
        PLAIN_TEXT.add(text1);
    }

    @Override
    public void addContainers() {
        CONTAINERS.add(container1);
        CONTAINERS.add(container6);
    }

    @Override
    public void initStyles() {
        addConsultaIcon.setSize(45, 45);
        reload.setSize(45, 45);
        Tools.setScroll(scrollPanel);
        Tools.setScroll(scrollPanel1);
        setIcons();
        addCalendarButtons();
        addLabelsCalendar();
        setCalendarValues(monthValue, LocalDateTime.now().getMonth(), LocalDateTime.now().getYear());
        Tools.setImageLabel(reload, "src/com/assets/actualizar.png", 25, 25, ChoosedPalette.getWhite());
        paintOneContainer(containerButton, ChoosedPalette.getMidColor());
        paintOneContainer(containerButton1, ChoosedPalette.getMidColor());
    }
    
    private void setIcons() {
        Tools.setImageLabel(addConsultaIcon, "src/com/assets/agregar.png", 25, 25, ChoosedPalette.getWhite());
    }
    
    @Override
    public void colorBasics() {
        content.setBackground(ChoosedPalette.getSecondaryBackground());
        content2.setBackground(ChoosedPalette.getPrimaryBackground());
        CALENDAR_BUTTONS.forEach(button -> {
            button.setkStartColor(ChoosedPalette.getSecondaryBackground());
            button.setkEndColor(ChoosedPalette.getSecondaryBackground());
        });
        paintAll();
        setIcons();
        LABELS_CALENDAR.forEach(label -> label.setForeground(ChoosedPalette.getTextColor()));
        needBorder.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        needBorder3.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
        needBorder2.setBorder(new MatteBorder(0, 0, 1, 0, ChoosedPalette.getGray()));
    }
    
    @Override
    public void dark() {
        CONTAINERS.forEach(container -> {
            container.setkFillBackground(true);
            container.setkStartColor(ChoosedPalette.getSecondaryBackground());
            container.setkEndColor(ChoosedPalette.getSecondaryBackground());
            container.repaint();
        });
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
    
    private void addTargetsBy(int idPaciente, int dia, int mes, int annio) {
        agendaTargets.removeAll();
        ApplicationContext.agendaTargets.clear();
        ApplicationContext.consultasPacienteListadas = ConsultasHelper.obtenerConsultasPorDiaMesAnnio(dia, mes, annio, idPaciente);
        
        ApplicationContext.consultasPacienteListadas.forEach(consulta -> {
            ApplicationContext.agendaTargets.add(new AgendaTarget(consulta));
        });
        
        ApplicationContext.agendaTargets.forEach(target -> {
            agendaTargets.add(target);
        });
        
        ApplicationContext.agendaTargets.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
    }
    
    private void addTargetsByLabel(JLabel label) {
        if (!label.getText().equals("")) {
            addTargetsBy(ApplicationContext.selectedPacient.getId(), Integer.parseInt(label.getText()), monthValue, year);
        
            if (ApplicationContext.consultasPacienteListadas.isEmpty()) {
                Tools.showPanel(agendaTargets, ApplicationContext.noResults, 10, 10);
            } else {
                SwingUtilities.updateComponentTreeUI(agendaTargets);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel88 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        containerButton = new com.k33ptoo.components.KGradientPanel();
        addConsultaIcon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        containerButton1 = new com.k33ptoo.components.KGradientPanel();
        reload = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        container1 = new com.k33ptoo.components.KGradientPanel();
        jPanel87 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        needBorder = new javax.swing.JPanel();
        jPanel100 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel101 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel102 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel103 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel104 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        scrollPanel1 = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        agendaTargets = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        content2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        needBorder2 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel89 = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        container6 = new com.k33ptoo.components.KGradientPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel123 = new javax.swing.JPanel();
        needBorder3 = new javax.swing.JPanel();
        jPanel125 = new javax.swing.JPanel();
        title11 = new javax.swing.JLabel();
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

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setMinimumSize(new java.awt.Dimension(976, 388));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(976, 388));
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(976, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        add(jPanel12, java.awt.BorderLayout.LINE_END);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        add(jPanel13, java.awt.BorderLayout.LINE_START);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setOpaque(false);
        jPanel19.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        add(jPanel19, java.awt.BorderLayout.PAGE_END);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(948, 80));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel11.setOpaque(false);

        text1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 153, 153));
        text1.setText("Consultas, agenda del paciente");

        title1.setBackground(new java.awt.Color(0, 0, 0));
        title1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Consultas");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(title1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel11);

        jPanel14.setOpaque(false);

        containerButton.setkEndColor(new java.awt.Color(0, 0, 0));
        containerButton.setkStartColor(new java.awt.Color(0, 0, 0));
        containerButton.setMaximumSize(new java.awt.Dimension(32767, 45));
        containerButton.setMinimumSize(new java.awt.Dimension(0, 45));
        containerButton.setOpaque(false);
        containerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                containerButtonMouseClicked(evt);
            }
        });

        addConsultaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addConsultaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nueva consulta");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout containerButtonLayout = new javax.swing.GroupLayout(containerButton);
        containerButton.setLayout(containerButtonLayout);
        containerButtonLayout.setHorizontalGroup(
            containerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerButtonLayout.createSequentialGroup()
                .addComponent(addConsultaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        containerButtonLayout.setVerticalGroup(
            containerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(addConsultaIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        containerButton1.setkEndColor(new java.awt.Color(0, 0, 0));
        containerButton1.setkStartColor(new java.awt.Color(0, 0, 0));
        containerButton1.setMaximumSize(new java.awt.Dimension(2147483647, 45));
        containerButton1.setMinimumSize(new java.awt.Dimension(0, 45));
        containerButton1.setOpaque(false);
        containerButton1.setPreferredSize(new java.awt.Dimension(0, 45));
        containerButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                containerButton1MouseClicked(evt);
            }
        });
        containerButton1.setLayout(new java.awt.BorderLayout());

        reload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        containerButton1.add(reload, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(containerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(containerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(containerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(containerButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel14);

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMinimumSize(new java.awt.Dimension(100, 20));
        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(976, 20));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel21.setOpaque(false);
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setMinimumSize(new java.awt.Dimension(7, 0));
        jPanel25.setOpaque(false);
        jPanel25.setPreferredSize(new java.awt.Dimension(7, 35));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel25, java.awt.BorderLayout.LINE_END);

        container1.setkEndColor(new java.awt.Color(204, 204, 204));
        container1.setkFillBackground(false);
        container1.setkStartColor(new java.awt.Color(204, 204, 204));
        container1.setOpaque(false);
        container1.setLayout(new java.awt.BorderLayout());

        jPanel87.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel87.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel87.setOpaque(false);
        jPanel87.setPreferredSize(new java.awt.Dimension(648, 40));
        jPanel87.setLayout(new java.awt.BorderLayout());

        jPanel91.setBackground(new java.awt.Color(255, 255, 255));
        jPanel91.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel91.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel91.setOpaque(false);
        jPanel91.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel87.add(jPanel91, java.awt.BorderLayout.LINE_START);

        jPanel92.setBackground(new java.awt.Color(255, 255, 255));
        jPanel92.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel92.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel92.setOpaque(false);
        jPanel92.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel87.add(jPanel92, java.awt.BorderLayout.LINE_END);

        needBorder.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder.setOpaque(false);
        needBorder.setLayout(new java.awt.GridLayout(1, 0));

        jPanel100.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fecha");

        javax.swing.GroupLayout jPanel100Layout = new javax.swing.GroupLayout(jPanel100);
        jPanel100.setLayout(jPanel100Layout);
        jPanel100Layout.setHorizontalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel100Layout.setVerticalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        needBorder.add(jPanel100);

        jPanel101.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hora");

        javax.swing.GroupLayout jPanel101Layout = new javax.swing.GroupLayout(jPanel101);
        jPanel101.setLayout(jPanel101Layout);
        jPanel101Layout.setHorizontalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel101Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel101Layout.setVerticalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel101Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        needBorder.add(jPanel101);

        jPanel102.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tratamiento");

        javax.swing.GroupLayout jPanel102Layout = new javax.swing.GroupLayout(jPanel102);
        jPanel102.setLayout(jPanel102Layout);
        jPanel102Layout.setHorizontalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel102Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel102Layout.setVerticalGroup(
            jPanel102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel102Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        needBorder.add(jPanel102);

        jPanel103.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Acciones");

        javax.swing.GroupLayout jPanel103Layout = new javax.swing.GroupLayout(jPanel103);
        jPanel103.setLayout(jPanel103Layout);
        jPanel103Layout.setHorizontalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel103Layout.setVerticalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        needBorder.add(jPanel103);

        jPanel104.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Consulta");

        javax.swing.GroupLayout jPanel104Layout = new javax.swing.GroupLayout(jPanel104);
        jPanel104.setLayout(jPanel104Layout);
        jPanel104Layout.setHorizontalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel104Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel104Layout.setVerticalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel104Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        needBorder.add(jPanel104);

        jPanel87.add(needBorder, java.awt.BorderLayout.CENTER);

        container1.add(jPanel87, java.awt.BorderLayout.PAGE_START);

        jPanel90.setOpaque(false);
        jPanel90.setLayout(new java.awt.BorderLayout());

        jPanel94.setBackground(new java.awt.Color(255, 255, 255));
        jPanel94.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel94.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel94.setOpaque(false);
        jPanel94.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        jPanel90.add(jPanel94, java.awt.BorderLayout.LINE_START);

        jPanel95.setBackground(new java.awt.Color(255, 255, 255));
        jPanel95.setMaximumSize(new java.awt.Dimension(14, 32767));
        jPanel95.setMinimumSize(new java.awt.Dimension(14, 0));
        jPanel95.setOpaque(false);
        jPanel95.setPreferredSize(new java.awt.Dimension(14, 35));

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        jPanel90.add(jPanel95, java.awt.BorderLayout.LINE_END);

        jPanel96.setBackground(new java.awt.Color(255, 255, 255));
        jPanel96.setOpaque(false);
        jPanel96.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel90.add(jPanel96, java.awt.BorderLayout.PAGE_START);

        jPanel97.setBackground(new java.awt.Color(255, 255, 255));
        jPanel97.setOpaque(false);
        jPanel97.setPreferredSize(new java.awt.Dimension(820, 12));

        javax.swing.GroupLayout jPanel97Layout = new javax.swing.GroupLayout(jPanel97);
        jPanel97.setLayout(jPanel97Layout);
        jPanel97Layout.setHorizontalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jPanel97Layout.setVerticalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel90.add(jPanel97, java.awt.BorderLayout.PAGE_END);

        scrollPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        content.setBackground(new java.awt.Color(255, 255, 255));

        agendaTargets.setOpaque(false);
        agendaTargets.setLayout(new javax.swing.BoxLayout(agendaTargets, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(agendaTargets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(agendaTargets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 378, Short.MAX_VALUE))
        );

        scrollPanel1.setViewportView(content);

        jPanel90.add(scrollPanel1, java.awt.BorderLayout.CENTER);

        container1.add(jPanel90, java.awt.BorderLayout.CENTER);

        jPanel21.add(container1, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel20.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setMinimumSize(new java.awt.Dimension(7, 0));
        jPanel22.setOpaque(false);
        jPanel22.setPreferredSize(new java.awt.Dimension(7, 35));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel22, java.awt.BorderLayout.LINE_START);

        jPanel23.setMinimumSize(new java.awt.Dimension(286, 0));
        jPanel23.setOpaque(false);
        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel24.setOpaque(false);
        jPanel24.setLayout(new java.awt.BorderLayout());
        jPanel23.add(jPanel24, java.awt.BorderLayout.CENTER);

        scrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        content2.setBackground(new java.awt.Color(255, 255, 255));
        content2.setLayout(new java.awt.BorderLayout());

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel80.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel80.setOpaque(false);
        jPanel80.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel80, java.awt.BorderLayout.LINE_START);

        jPanel81.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel81.setOpaque(false);
        jPanel81.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel81, java.awt.BorderLayout.LINE_END);

        jPanel82.setBackground(new java.awt.Color(255, 255, 255));
        jPanel82.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel82.setOpaque(false);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel82, java.awt.BorderLayout.PAGE_START);

        jPanel83.setBackground(new java.awt.Color(255, 255, 255));
        jPanel83.setMinimumSize(new java.awt.Dimension(14, 14));
        jPanel83.setOpaque(false);

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel83, java.awt.BorderLayout.PAGE_END);

        jPanel84.setOpaque(false);

        needBorder2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder2.setOpaque(false);
        needBorder2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel86.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel86.setOpaque(false);
        jPanel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel86MouseClicked(evt);
            }
        });

        title2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 0));
        title2.setText("Anterior");

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title2)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        needBorder2.add(jPanel86);

        jPanel89.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel89.setOpaque(false);
        jPanel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel89MouseClicked(evt);
            }
        });

        title3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title3.setForeground(new java.awt.Color(0, 0, 0));
        title3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        title3.setText("Siguiente");

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(title3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap())
        );

        needBorder2.add(jPanel89);

        fecha.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 16)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Mes");

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(needBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addComponent(needBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel84, java.awt.BorderLayout.CENTER);

        content2.add(jPanel7, java.awt.BorderLayout.CENTER);

        container6.setkEndColor(new java.awt.Color(204, 204, 204));
        container6.setkFillBackground(false);
        container6.setkStartColor(new java.awt.Color(204, 204, 204));
        container6.setOpaque(false);
        container6.setLayout(new java.awt.BorderLayout());

        jPanel17.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel17.setOpaque(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(284, 40));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel74.setMinimumSize(new java.awt.Dimension(10, 100));
        jPanel74.setOpaque(false);
        jPanel74.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel74, java.awt.BorderLayout.LINE_END);

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

        jPanel17.add(jPanel123, java.awt.BorderLayout.LINE_START);

        needBorder3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        needBorder3.setToolTipText("Hlello");
        needBorder3.setOpaque(false);
        needBorder3.setLayout(new java.awt.GridLayout());

        jPanel125.setOpaque(false);
        jPanel125.setLayout(new java.awt.BorderLayout());

        title11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title11.setForeground(new java.awt.Color(0, 0, 0));
        title11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title11.setText("D");
        jPanel125.add(title11, java.awt.BorderLayout.CENTER);

        needBorder3.add(jPanel125);

        jPanel126.setOpaque(false);
        jPanel126.setLayout(new java.awt.BorderLayout());

        title4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title4.setForeground(new java.awt.Color(0, 0, 0));
        title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title4.setText("L");
        jPanel126.add(title4, java.awt.BorderLayout.CENTER);

        needBorder3.add(jPanel126);

        jPanel127.setOpaque(false);
        jPanel127.setLayout(new java.awt.BorderLayout());

        title5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title5.setForeground(new java.awt.Color(0, 0, 0));
        title5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title5.setText("M");
        jPanel127.add(title5, java.awt.BorderLayout.CENTER);

        needBorder3.add(jPanel127);

        jPanel128.setOpaque(false);
        jPanel128.setLayout(new java.awt.BorderLayout());

        title6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title6.setForeground(new java.awt.Color(0, 0, 0));
        title6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title6.setText("M");
        jPanel128.add(title6, java.awt.BorderLayout.CENTER);

        needBorder3.add(jPanel128);

        jPanel129.setOpaque(false);
        jPanel129.setLayout(new java.awt.BorderLayout());

        title7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title7.setForeground(new java.awt.Color(0, 0, 0));
        title7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title7.setText("J");
        jPanel129.add(title7, java.awt.BorderLayout.CENTER);

        needBorder3.add(jPanel129);

        jPanel130.setOpaque(false);
        jPanel130.setLayout(new java.awt.BorderLayout());

        title8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title8.setForeground(new java.awt.Color(0, 0, 0));
        title8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title8.setText("V");
        jPanel130.add(title8, java.awt.BorderLayout.CENTER);

        needBorder3.add(jPanel130);

        jPanel131.setOpaque(false);
        jPanel131.setLayout(new java.awt.BorderLayout());

        title9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        title9.setForeground(new java.awt.Color(0, 0, 0));
        title9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title9.setText("S");
        jPanel131.add(title9, java.awt.BorderLayout.CENTER);

        needBorder3.add(jPanel131);

        jPanel17.add(needBorder3, java.awt.BorderLayout.CENTER);

        container6.add(jPanel17, java.awt.BorderLayout.PAGE_START);

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

        scrollPanel.setViewportView(content2);

        jPanel23.add(scrollPanel, java.awt.BorderLayout.CENTER);

        jPanel20.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel20, java.awt.BorderLayout.LINE_END);

        jPanel5.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void containerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerButtonMouseClicked
        ApplicationContext.paciente.mostrarPanel(ApplicationContext.nuevaConsulta);
    }//GEN-LAST:event_containerButtonMouseClicked

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
                setCalendarValues(monthValue, Month.MAY, year);
                break;
            case 5:
                setCalendarValues(monthValue, Month.APRIL, year);
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
    
    private void jPanel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel86MouseClicked
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
    }//GEN-LAST:event_jPanel86MouseClicked

    private void jPanel89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel89MouseClicked
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
    }//GEN-LAST:event_jPanel89MouseClicked

    private void containerButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_containerButton1MouseClicked
        addTargets(ApplicationContext.selectedPacient.getId());
    }//GEN-LAST:event_containerButton1MouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addConsultaIcon;
    private javax.swing.JPanel agendaTargets;
    private com.k33ptoo.components.KGradientPanel container1;
    private com.k33ptoo.components.KGradientPanel container6;
    private com.k33ptoo.components.KGradientPanel containerButton;
    private com.k33ptoo.components.KGradientPanel containerButton1;
    private javax.swing.JPanel content;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel123;
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
    private javax.swing.JPanel jPanel18;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel needBorder;
    private javax.swing.JPanel needBorder2;
    private javax.swing.JPanel needBorder3;
    private javax.swing.JLabel reload;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JScrollPane scrollPanel1;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title11;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JLabel title7;
    private javax.swing.JLabel title8;
    private javax.swing.JLabel title9;
    // End of variables declaration//GEN-END:variables

    
}

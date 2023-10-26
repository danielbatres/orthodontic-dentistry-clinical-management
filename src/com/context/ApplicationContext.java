package com.context;

import com.helper.AsistenteHelper;
import com.model.ActividadModel;
import com.model.AsistenteModel;
import com.model.ConsultaModel;
import com.model.ControlMensualModel;
import com.model.DienteOdontogramaModel;
import com.model.DoctorModel;
import com.model.PacienteModel;
import com.model.RadiografiaModel;
import com.view.MainSite;
import com.view.activity.Actividad;
import com.view.activity.ActividadTableLog;
import com.view.activity.ActividadTargetLog;
import com.view.appointmentsView.Agendas;
import com.view.appointmentsView.AgendasTable;
import com.view.appointmentsView.AppointmentTarget;
import com.view.appointmentsView.Factura;
import com.view.appointmentsView.FacturaData;
import com.view.components.Appearance;
import com.view.components.Exit;
import com.view.estados.NotConnected;
import com.view.readPct.Paciente;
import com.view.components.SideBarClose;
import com.view.components.SideBarNavigation;
import com.view.createAsistente.NewAsistenteInformation;
import com.view.createAsistente.NuevoAsistente;
import com.view.createPacient.NewPacienteInformation;
import com.view.createPacient.NewPacienteOdontologia;
import com.view.createPacient.NewPacienteOrtodoncia;
import com.view.createPacient.NuevoPaciente;
import com.view.dashboard.ActividadTable;
import com.view.dashboard.ActividadTarget;
import com.view.dashboard.ConsultaTarget;
import com.view.dashboard.ConsultasTable;
import com.view.dashboard.DashboardView;
import com.view.dashboard.DashboardScroll;
import com.view.dashboard.RecentPacientTable;
import com.view.dashboard.RecentPacientTarget;
import com.view.estados.LoadingApp;
import com.view.estados.LoadingApplication;
import com.view.estados.NoPertenece;
import com.view.estados.SinResultados;
import com.view.estados.SuccessfullySaved;
import com.view.uinterface.MainInterface;
import com.view.welcomeView.WelcomeScreen;
import com.view.ingresar.Login;
import com.view.modificarAsistente.ModifyAsistente;
import com.view.modificarAsistente.ModifyAsistenteInformation;
import com.view.modificarPaciente.ModifyPaciente;
import com.view.modificarPaciente.ModifyPacienteInformation;
import com.view.modificarPaciente.ModifyPacienteOdontologia;
import com.view.modificarPaciente.ModifyPacienteOrtodoncia;
import com.view.viewOdontograma.Odontograma;
import com.view.viewOdontograma.OdontogramaAdulto;
import com.view.viewOdontograma.OdontogramaData;
import com.view.viewOdontograma.OdontogramaJunior;
import com.view.viewOdontograma.OdontogramaTable;
import com.view.viewOdontograma.OdontogramaTarget;
import com.view.viewOdontograma.RegistroOdontograma;
import com.view.organization.Asistentes;
import com.view.organization.AsistentesTable;
import com.view.organization.AsistentesTarget;
import com.view.readPct.AddRadiografia;
import com.view.readPct.Agenda;
import com.view.readPct.AgendaGeneral;
import com.view.readPct.AgendaGeneralTarget;
import com.view.readPct.AgendaTarget;
import com.view.readPct.ControlMensual;
import com.view.readPct.ControlMensualTarget;
import com.view.readPct.DatosControl;
import com.view.readPct.DatosOdontologia;
import com.view.readPct.DatosOrtodoncia;
import com.view.readPct.Delete;
import com.view.readPct.GeneralDatos;
import com.view.readPct.Generales;
import com.view.readPct.ModificarControl;
import com.view.readPct.ModificarControlFields;
import com.view.readPct.ModifyConsulta;
import com.view.readPct.NoControl;
import com.view.readPct.NoResults;
import com.view.readPct.NuevaConsulta;
import com.view.readPct.NuevoControl;
import com.view.readPct.NuevoControlFields;
import com.view.readPct.OdontologiaDatos;
import com.view.readPct.OrtodonciaDatos;
import com.view.readPct.PacientProfile;
import com.view.readPct.PacientTarget1;
import com.view.readPct.PacienteLoadingTarget;
import com.view.readPct.PacienteTable;
import com.view.readPct.PacienteTableLoading;
import com.view.readPct.Pacientes;
import com.view.readPct.RadiografiaTarget;
import com.view.readPct.Radiografias;
import com.view.readPct.TratamientoTarget;
import com.view.readPct.ViewRadiografia;
import com.view.viewOdontograma.DeleteTarget;
import com.view.welcomeView.Welcome;
import java.util.ArrayList;

/**
 * <h1>ApplicationContext</h1>
 * 
 * En esta clase se integra el contexto completo y la logica que debe seguir la aplicacion
 * se crean variables estaticas para registrar y persistir informacion durante la sesion
 * 
 * @author Daniel Batres
 * @version 1.0.0
 * @since 14/09/22
 */
public class ApplicationContext {
    public static SesionUsuario sesionUsuario;
    public static LoadingApp loading = new LoadingApp();
    public static LoadingApplication loadingApplication = new LoadingApplication();
    public static NotConnected notConnected = new NotConnected();
    public static NoResults noResults = new NoResults();
    public static NoControl noControl = new NoControl();
    public static SuccessfullySaved success;
    public static Appearance appearance;
    public static AddRadiografia addRadiografia;
    
    public static String selectedAppereance;
    public static String selectedTreatment;
    public static String selectedTreatmentInOut;
    
    public static Login login;
    
    /*-------------- Seccion de bienvenida --------------*/
    public static Welcome welcome  = new Welcome();
    public static WelcomeScreen welcomeScreen = new WelcomeScreen();
    /*-------------- Seccion de bienvenida --------------*/
    
    public static Delete deleteRadiografia;
    public static DeleteTarget deleteTarget;
    public static OdontogramaAdulto odontogramaAdulto;
    public static OdontogramaJunior odontogramaJunior;
    
    public static ViewRadiografia viewRadiografia;
    
    public static SinResultados sinResultados;
    public static NoPertenece noPerteneceOdontologia;
    public static NoPertenece noPerteneceOrtodoncia;
    
    public static ModifyAsistenteInformation modificarInformacionAsistente;
    public static ModifyAsistente modificarAsistente;
    
    public static FacturaData facturaData;
    public static Factura registroFactura;
    
    public static ArrayList<RadiografiaModel> radiografiasListadas = new ArrayList<>();
    public static ArrayList<RadiografiaTarget> radiografiasTargets = new ArrayList<>();
    
    public static ArrayList<PacienteModel> pacientesListados = new ArrayList<>();
    public static ArrayList<AsistenteModel> asistentesListados = AsistenteHelper.listarAsistentes();
    public static ArrayList<ActividadModel> actividadesListadas = new ArrayList<>();
    public static ArrayList<ConsultaModel> consultasListadas = new ArrayList<>();
    public static ArrayList<ConsultaModel> consultasPacienteListadas = new ArrayList<>();
    public static ArrayList<AsistentesTarget> asistentesTargets = new ArrayList<>();
    public static AsistentesTable asistentesTable;
    public static RecentPacientTable recentPacientTable;
    public static ArrayList<RecentPacientTarget> recentPacientsTargets = new ArrayList<>();
    public static ActividadTable actividadTable;
    public static ArrayList<ActividadTarget> actividadRecienteTargets = new ArrayList<>();
    public static ArrayList<ConsultaTarget> consultasTargetsDashboard = new ArrayList<>();
    public static ConsultasTable consultasDashboardTable;
    public static DashboardScroll dashboardScroll;
    
    public static PacienteTable pacientesTable;
    public static PacienteTableLoading pacientesTableLoading;
    public static ArrayList<PacienteLoadingTarget> pacienteLoadingTarget = new ArrayList<>();
    public static ArrayList<PacientTarget1> pacientesTargets = new ArrayList<>();
    public static ArrayList<AppointmentTarget> agendasTargets = new ArrayList<>();
    public static AgendasTable agendasTable;

    public static DashboardView dashboard;
    public static Pacientes pacientes;
    public static Agendas agendas;
    public static Asistentes asistentes;

    public static PacienteModel selectedPacient;
    public static ControlMensualModel selectedControlMensual;
    
    public static NewAsistenteInformation newAsistenteInformation;
    public static NuevoAsistente nuevoAsistente;
    
    public static NewPacienteInformation newPacienteInformation;
    public static NewPacienteOdontologia nuevoPacienteOdontologia;
    public static NewPacienteOrtodoncia nuevoPacienteOrtodoncia;
    public static NuevoPaciente nuevoPaciente;
    
    public static ModifyPacienteInformation modificarInformacionPaciente;
    public static ModifyPacienteOdontologia modificarOdontologiaPaciente;
    public static ModifyPacienteOrtodoncia modificarOrtodonciaPaciente;
    public static ModifyPaciente modificarPaciente;
    
    public static ArrayList<ActividadTargetLog> actividadTargetsLog = new ArrayList<>();
    public static ActividadTableLog actividadTableLog;
    public static Actividad actividad;

    public static OdontogramaData odontogramaData;
    public static RegistroOdontograma registroOdontograma;
    public static ArrayList<DienteOdontogramaModel> dienteOdontogramaModels = new ArrayList<>(); 
    public static ArrayList<OdontogramaTarget> odontogramaTargets = new ArrayList<>();
    public static Odontograma odontograma;
    public static ArrayList<TratamientoTarget> tratamientosTargets = new ArrayList<>();
    public static ArrayList<ControlMensualModel> controlMensualListado = new ArrayList<>();
    public static ArrayList<ControlMensualTarget> controlTargets = new ArrayList<>();
    public static NuevoControlFields nuevoControlFields;
    public static NuevoControl nuevoControl;
    public static ControlMensual controlMensual;
    public static PacientProfile pacienteProfile;
    public static NuevaConsulta nuevaConsulta;
    public static ModifyConsulta modificarConsulta;
    public static ModificarControlFields modificarControlFields;
    public static ModificarControl modificarControl;
    public static ArrayList<AgendaTarget> agendaTargets = new ArrayList<>();
    public static ArrayList<AgendaGeneralTarget> agendaGeneralTargets = new ArrayList<>();
    public static AgendaGeneral agendaGeneral;
    public static Agenda agendaPaciente;
    public static Generales generales;
    public static Radiografias radiografias;
    public static OdontologiaDatos odontologiaDatos;
    public static OrtodonciaDatos ortodonciaDatos;
    public static GeneralDatos datosGenerales;
    public static DatosOdontologia datosOdontologia;
    public static DatosOrtodoncia datosOrtodoncia;
    public static DatosControl datosControl;
    public static OdontogramaTable odontogramaTable;
    
    public static Paciente paciente;
    
    public static SideBarNavigation sideBarNavigation;
    public static SideBarClose sideBarClose;
    public static AsistenteModel selectedAsistente;

    /*-------------- Interfaz principal --------------*/
    public static MainInterface mainInterface;
    /*-------------- Interfaz principal --------------*/
    
    /*-------------- Aplicacion --------------*/
    public static MainSite application;
    /*-------------- Aplicacion --------------*/
    
    public static Exit exit = new Exit();
    
    public static boolean isDoctorSesionActual() {
        return sesionUsuario.getSesionUsuario().getClass().equals(DoctorModel.class);
    }
    
    public static DoctorModel getDoctor() {
        return (DoctorModel) sesionUsuario.getSesionUsuario();
    }
    
    public static AsistenteModel getAsistente() {
        return (AsistenteModel) sesionUsuario.getSesionUsuario();
    }
    
    public static void iniciar() {
        appearance = new Appearance();
        viewRadiografia = new ViewRadiografia();
        deleteTarget = new DeleteTarget();
        deleteRadiografia = new Delete();
        odontogramaAdulto = new OdontogramaAdulto();
        odontogramaJunior = new OdontogramaJunior();
        addRadiografia = new AddRadiografia();
        sinResultados = new SinResultados();
        noPerteneceOdontologia = new NoPertenece("Odontolog\u00eda", "Agr\u00e9galo desde los datos generales");
        noPerteneceOrtodoncia = new NoPertenece("Ortodoncia", "Agr\u00e9galo desde los datos generales");
        odontograma = new Odontograma();
        pacientesTable = new PacienteTable();
        agendasTable = new AgendasTable();
        facturaData = new FacturaData();
        registroFactura = new Factura();
        asistentesTable = new AsistentesTable();
        pacientesTableLoading = new PacienteTableLoading();
        generales = new Generales();
        actividadTableLog = new ActividadTableLog();
        actividad = new Actividad();
        pacienteProfile = new PacientProfile();
        nuevaConsulta = new NuevaConsulta();
        modificarConsulta = new ModifyConsulta();
        agendaGeneral = new AgendaGeneral();
        agendaPaciente = new Agenda();
        nuevoControlFields = new NuevoControlFields();
        nuevoControl = new NuevoControl();
        odontogramaData = new OdontogramaData();
        registroOdontograma = new RegistroOdontograma();
        controlMensual = new ControlMensual();
        datosGenerales = new GeneralDatos();
        datosOdontologia = new DatosOdontologia();
        datosOrtodoncia = new DatosOrtodoncia();
        odontologiaDatos = new OdontologiaDatos();
        ortodonciaDatos = new OrtodonciaDatos();
        datosControl = new DatosControl();
        modificarInformacionAsistente = new ModifyAsistenteInformation();
        modificarAsistente = new ModifyAsistente();
        modificarControlFields = new ModificarControlFields();
        modificarInformacionPaciente = new ModifyPacienteInformation();
        modificarOdontologiaPaciente = new ModifyPacienteOdontologia();
        modificarOrtodonciaPaciente = new ModifyPacienteOrtodoncia();
        modificarPaciente = new ModifyPaciente();
        modificarControl = new ModificarControl();
        radiografias = new Radiografias();
        paciente = new Paciente();
        odontogramaTable = new OdontogramaTable();
        recentPacientTable = new RecentPacientTable();
        consultasDashboardTable = new ConsultasTable();
        actividadTable = new ActividadTable();
        pacientes = new Pacientes();
        dashboardScroll = new DashboardScroll();
        dashboard = new DashboardView();
        agendas = new Agendas();
        asistentes = new Asistentes();
        newAsistenteInformation = new NewAsistenteInformation();
        nuevoAsistente = new NuevoAsistente();
        newPacienteInformation = new NewPacienteInformation();
        nuevoPacienteOdontologia = new NewPacienteOdontologia();
        nuevoPacienteOrtodoncia = new NewPacienteOrtodoncia();
        nuevoPaciente = new NuevoPaciente();
        sideBarNavigation = new SideBarNavigation();
        sideBarClose = new SideBarClose();
        mainInterface = new MainInterface();
        loadingApplication.dispose();
        application.setVisible(true);
        
        String palette;
        
        if (isDoctorSesionActual()) {
            palette = getDoctor().getPaletaPreferencia();
        } else {
            palette = getAsistente().getPaletaPreferencia();
        }
        
        selectedAppereance = palette;
        changeTheme(selectedAppereance);
    }
    
    public static void changeTheme(String palette) {
        switch (palette) {
            case "light":
                ChoosedPalette.changePalette(ChoosedPalette.getWHITE_PALETTE());
                break;
            case "dark":
                ChoosedPalette.changePalette(ChoosedPalette.getDARK_PALETTE());
                break;
            default:
                System.out.println("Inv\u00e1lido");
        }
        
        appearance.colorComponent();
        viewRadiografia.colorComponent();
        agendas.colorComponent(palette);
        deleteRadiografia.colorComponent(palette);
        deleteTarget.colorComponent(palette);
        asistentesTable.colorComponent();
        addRadiografia.colorComponent();
        mainInterface.colorComponent(palette);
        sideBarNavigation.colorComponent(palette);
        sideBarClose.colorComponent(palette);
        modificarInformacionAsistente.colorComponent(palette);
        modificarAsistente.colorComponent(palette);
        sinResultados.colorComponent(palette);
        noResults.colorComponent(palette);
        facturaData.colorComponent(palette);
        noControl.colorComponent(palette);
        consultasDashboardTable.colorComponent();
        dashboard.colorComponent(palette);
        dashboardScroll.colorComponent(palette);
        asistentes.colorComponent(palette);
        actividad.colorComponent(palette);
        pacientesTableLoading.colorComponent();
        pacienteLoadingTarget.forEach(target -> target.colorComponent(palette));
        recentPacientTable.colorComponent();
        actividadTable.colorComponent();
        actividadTableLog.colorComponent();
        agendasTable.colorComponent();
        asistentesTargets.forEach(target -> target.colorComponent(palette));
        actividadTargetsLog.forEach(target -> target.colorComponent(palette));
        actividadRecienteTargets.forEach(target -> target.colorComponent(palette));
        recentPacientsTargets.forEach(target -> target.colorComponent(palette));
        agendaTargets.forEach(target -> target.colorComponent(palette));
        agendasTargets.forEach(target -> target.colorComponent(palette));
        agendaGeneralTargets.forEach(target -> target.colorComponent(palette));
        agendaGeneral.colorComponent(palette);
        odontogramaData.colorComponent(palette);
        nuevoAsistente.colorComponent(palette);
        newAsistenteInformation.colorComponent(palette);
        noPerteneceOdontologia.colorComponent(palette);
        noPerteneceOrtodoncia.colorComponent(palette);
        newPacienteInformation.colorComponent(palette);
        nuevoPacienteOdontologia.colorComponent(palette);
        nuevoPacienteOrtodoncia.colorComponent(palette);
        nuevoPaciente.colorComponent(palette);
        odontogramaTable.colorComponent(palette);
        modificarConsulta.colorComponent(palette);
        modificarInformacionPaciente.colorComponent(palette);
        modificarOdontologiaPaciente.colorComponent(palette);
        modificarOrtodonciaPaciente.colorComponent(palette);
        radiografiasTargets.forEach(target -> target.colorComponent(palette));
        modificarPaciente.colorComponent(palette);
        pacientesTable.colorComponent();
        pacientesTargets.forEach(target -> target.colorComponent(palette));
        pacientesTableLoading.colorComponent();
        radiografias.colorComponent(palette);
        odontograma.colorComponent(palette);
        odontogramaTargets.forEach(target -> target.colorComponent(palette));
        tratamientosTargets.forEach(target -> target.colorComponent(palette));
        controlTargets.forEach(target -> target.colorComponent(palette));
        pacientes.colorComponent(palette);
        paciente.colorComponent(palette);
        pacienteProfile.colorComponent(palette);
        nuevoControlFields.colorComponent(palette);
        nuevoControl.colorComponent(palette);
        datosControl.colorComponent(palette);
        controlMensual.colorComponent(palette);
        nuevaConsulta.colorComponent(palette);
        agendaPaciente.colorComponent(palette);
        generales.colorComponent(palette);
        datosGenerales.colorComponent(palette);
        datosOdontologia.colorComponent(palette);
        datosOrtodoncia.colorComponent(palette);
        modificarControlFields.colorComponent(palette);
        modificarControl.colorComponent(palette);
        odontologiaDatos.colorComponent(palette);
        ortodonciaDatos.colorComponent(palette);
        consultasTargetsDashboard.forEach(target -> target.colorComponent(palette));
        exit.colorComponent(palette);
    }
}

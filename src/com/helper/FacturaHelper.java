package com.helper;

import com.context.ApplicationContext;
import com.model.FacturaModel;
import com.model.MontosModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel Batres
 */
public class FacturaHelper extends Basics {
    private static final String CREATE_FACTURA = "INSERT INTO Facturas (idConsulta, saldo, totales) VALUES (?, ?, ?)";
    private static final String CREATE_MONTO = "INSERT INTO MontosFacturas (idFactura, monto, anotaciones) VALUES (\n" +
        "(SELECT MAX(idFactura) FROM Facturas), ? , ?);";
    private static final String UPDATE_ESTADO_CONSULTA = "UPDATE Consultas SET realizado = ? WHERE idConsulta = ?";
    private static final String GET_FACTURA = "SELECT idFactura, saldo, totales FROM Facturas WHERE idConsulta = ";
    private static final String GET_MONTOS = "SELECT idMontosFacturas, monto, anotaciones FROM MontosFacturas WHERE idFactura = ";
    private static final String GET_TOTALES = "SELECT SUM(totales) as totales FROM Facturas";
    private static final String UPDATE_FACTURA = "UPDATE Facturas SET saldo = ?, totales = ? WHERE idFactura = ?";
    private static final String UPDATE_MONTOS = "UPDATE MontosFacturas SET monto = ?, anotaciones = ? WHERE idMontosFacturas = ?";
    private static FacturaModel facturaModel;
    
    public static void createFactura(FacturaModel factura, int idConsulta) {
        FacturaHelper.facturaModel = factura;
        
        addFacturaData(idConsulta);
        addMontos();
        updateConsultaEstado(true, idConsulta);
        
        ApplicationContext.consultasDashboardTable.addTargets();
        ApplicationContext.consultasTargetsDashboard.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
        ApplicationContext.agendas.setData();
        ApplicationContext.agendasTargets.forEach(target -> target.colorComponent(ApplicationContext.selectedAppereance));
    }
    
    private static void addFacturaData(int idConsulta) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(CREATE_FACTURA);
            
            preparedStatement.setInt(1, idConsulta);
            preparedStatement.setFloat(2, facturaModel.getSaldo());
            preparedStatement.setFloat(3, facturaModel.getTotales());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void addMontos() {
        for (int i = 0; i < 4; i++) {
            float monto = facturaModel.getMontos().get(i).getMonto();
            String anotaciones = facturaModel.getMontos().get(i).getAnotaciones();
            
            try {
                PreparedStatement preparedStatement = CONNECTION.prepareStatement(CREATE_MONTO);
                
                preparedStatement.setFloat(1, monto);
                preparedStatement.setString(2, anotaciones);
                
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    public static void updateConsultaEstado(boolean estado, int idConsulta) {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_ESTADO_CONSULTA);
            
            preparedStatement.setString(1, String.valueOf(estado));
            preparedStatement.setInt(2, idConsulta);
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static FacturaModel getFactura(int idConsulta) {
        FacturaModel factura = new FacturaModel();
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(GET_FACTURA + idConsulta);
            
            while (rs.next()) {
                factura.setId(rs.getInt(1));
                factura.setSaldo(rs.getFloat(2));
                factura.setTotales(rs.getFloat(3));
            }
            
            ArrayList<MontosModel> montos = new ArrayList<>();

            st = CONNECTION.createStatement();
            rs = st.executeQuery(GET_MONTOS + factura.getId());

            while (rs.next()) {
                MontosModel monto = new MontosModel();

                monto.setIdMontos(rs.getInt(1));
                monto.setMonto(rs.getInt(2));
                monto.setAnotaciones(rs.getString(3));

                montos.add(monto);
            }
            
            factura.setMontos(montos);
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return factura;
    }
    
    public static float getTotales() {
        float totales = 0;
        
        try {
            Statement st = CONNECTION.createStatement();
            ResultSet rs = st.executeQuery(GET_TOTALES);
            
            while (rs.next()) {
                totales = rs.getFloat("totales");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return totales;
    }
    
    public static void updateFactura(FacturaModel factura) {
        FacturaHelper.facturaModel = factura;
        
        updateFacturaData();
        updateMontos();
    }
    
    private static void updateFacturaData() {
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_FACTURA);
            
            preparedStatement.setFloat(1, facturaModel.getSaldo());
            preparedStatement.setFloat(2, facturaModel.getTotales());
            preparedStatement.setInt(3, facturaModel.getId());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private static void updateMontos() {
        for (int i = 0; i < 4; i++) {
            float monto = facturaModel.getMontos().get(i).getMonto();
            String anotaciones = facturaModel.getMontos().get(i).getAnotaciones();
            int id = facturaModel.getMontos().get(i).getIdMontos();
            
            try {
                PreparedStatement preparedStatement = CONNECTION.prepareStatement(UPDATE_MONTOS);
                
                preparedStatement.setFloat(1, monto);
                preparedStatement.setString(2, anotaciones);
                preparedStatement.setInt(3, id);
                
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public interface Protocolo {
    
    public static final Integer SESION_NO_INICIADA = 0;
    public static final Integer INICIAR_SESION = 1;
    public static final Integer INICIO_SESION_USUARIO_NO_EXISTE = 2;
    public static final Integer INICIO_SESION_CONTRASEÑA_INCORRECTA = 3;
    public static final Integer INICIO_SESION_EXITO = 4;
    public static final Integer SESION_OPERARIO = 5;
    public static final Integer SESION_TECNICO = 6;
    public static final Integer SESION_SOPORTE = 7;
    public static final Integer VER_PERFIL = 8;
    public static final Integer CERRAR_SESION = 9;
    
    public static final Integer OPERARIO_VISUALIZAR_MOVIMIENTOS_ASIGNADOS = 500;
    public static final Integer OPERARIO_CONSULTAR_ITEMS_MOVIMIENTO = 501;
    public static final Integer OPERARIO_CONSULTAR_REQUISITOS_MOVIMIENTO = 502;
    public static final Integer OPERARIO_ABRIR_INCIDENCIA = 503;
    public static final Integer OPERARIO_ASIGNAR_POSICION = 504;
    public static final Integer OPERARIO_CONSULTAR_INCIDENCIAS = 505;
    
    public static final Integer TECNICO_CONSULTAR_AUDITORIAS_PENDIENTES = 600;
    public static final Integer TECNICO_CONSULTAR_INCIDENCIAS_PENDIENTES = 601;
    public static final Integer TECNICO_RESOLVER_AUDITORIA = 602;
    public static final Integer TECNICO_RESOLVER_INCIDENCIA = 603;
    public static final Integer TECNICO_CONSULTAR_AUDITORIAS_HISTORIAL = 604;
    public static final Integer TECNICO_CONSULTAR_INCIDENCIAS_HISTORIAL = 605;
    public static final Integer TECNICO_VISUALIZAR_MOVIMIENTOS_RECIENTES = 606;
    public static final Integer TECNICO_VISUALIZAR_STOCK = 607;
    
    public static final Integer SOPORTE_CONSULTAR_ESTADÍSTICAS = 700;
    public static final Integer SOPORTE_CONSULTAR_INCIDENCIAS = 701;
    public static final Integer SOPORTE_CONSULTAR_AUDITORIAS = 702;
    public static final Integer SOPORTE_CREAR_AUDITORIA = 703;
    public static final Integer SOPORTE_ASIGNAR_AUDITORIA = 704;
    public static final Integer SOPORTE_ASIGNAR_INCIDENCIA = 705;
    public static final Integer SOPORTE_COMPROBAR_RESOLUCION_AUDITORIA = 706;
    public static final Integer SOPORTE_COMPROBAR_RESOLUCION_INCIDENCIA = 707;
    public static final Integer SOPORTE_RECHAZAR_RESOLUCION_AUDITORIA = 708;
    public static final Integer SOPORTE_RECHAZAR_RESOLUCION_INCIDENCIA = 709;
    public static final Integer SOPORTE_APROBAR_RESOLUCION_AUDITORIA = 710;
    public static final Integer SOPORTE_APROBAR_RESOLUCION_INCIDENCIA = 711;
    public static final Integer SOPORTE_CONSULTAR_TECNICOS = 712;
    public static final Integer SOPORTE_CONSULTAR_OPERARIOS = 713;
    public static final Integer SOPORTE_CREAR_CUENTA_OPERARIO = 714;
    public static final Integer SOPORTE_CREAR_CUENTA_TECNICO = 715;
    
    
    
}

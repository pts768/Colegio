package com.example.pablo.colegio;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.widget.Switch;

import java.util.List;

/**
 * Created by pablo on 05/02/2016.
 */
public class CalendariosService extends IntentService {
    public static final String LEERMENSAJE = "leermensaje";
    public static final String VERCALENDARIO = "vercalendario";
    public static final String CREARUSUARIO = "crearusuario";
    public static final String MANDARMENSAJE = "mandarmensaje";
    public static final String SELECCIONARTUTORIA = "seleccionartutoria";
    public static final String SELECCIONARMENSAJE = "seleccionarmensaje";
    public static final String ASIGNARNINO = "asignarnino";
    public static final String VERLISTANINO = "verlistanino";
    public static final String MOSTRARMENSAJE = "mostrarmensaje";
    public static final String VERTUTORIA = "vertutoria";
    public static final String CANCELARTUTORIA = "cancelartutoria";
    public static final String CREARPADRE = "crearpadre";
    public static final String CREARPROFESOR = "crearprofesor";


    public static void leerMensajeHelper (Context context, int id){
        Intent intent = new Intent(context,CalendariosService.class);
        intent.setAction(LEERMENSAJE);
        intent.putExtra("id",id);
        context.startService(intent);
    }
    public static void verCalendarioHelper (Context context, int id) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(VERCALENDARIO);
        intent.putExtra("id", id);
        context.startService(intent);
    }
    public static void crearUsuarioHelper (Context context, Usuario usuario) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(CREARUSUARIO);
        intent.putExtra("usuario", usuario);
        context.startService(intent);
    }
    public static void mandarMensajeHelper (Context context, int id) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(MANDARMENSAJE);
        intent.putExtra("id", id);
        context.startService(intent);
    }
    public static void seleccionarTutoriaHelper (Context context, int id) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(SELECCIONARTUTORIA);
        intent.putExtra("id", id);
        context.startService(intent);
    }
    public static void seleccionarMensajeHelper (Context context, int id) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(SELECCIONARMENSAJE);
        intent.putExtra("id", id);
        context.startService(intent);
    }
    public static void asignarNinoHelper (Context context, int id) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(ASIGNARNINO);
        intent.putExtra("id", id);
        context.startService(intent);
    }
    public static void verListaNinoHelper (Context context, int id) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(VERLISTANINO);
        intent.putExtra("id", id);
        context.startService(intent);
    }
    public static void mostrarMensajeHelper (Context context, int id) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(MOSTRARMENSAJE);
        intent.putExtra("id", id);
        context.startService(intent);
    }
    public static void verTutoriaHelper (Context context, int id) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(VERTUTORIA);
        intent.putExtra("id", id);
        context.startService(intent);
    }
    public static void cancelarTutoriaHelper (Context context, int id) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(CANCELARTUTORIA);
        intent.putExtra("id", id);
        context.startService(intent);
    }
    public static void crearPadre (Context context, Padre padre) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(CREARPADRE);
        intent.putExtra("padre", padre);
        context.startService(intent);
    }
    public static void crearProfesor (Context context, Profesor profesor) {
        Intent intent = new Intent(context, CalendariosService.class);
        intent.setAction(CREARPROFESOR);
        intent.putExtra("profesor", profesor);
        context.startService(intent);
    }


    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public CalendariosService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String Action = intent.getAction();
        switch(Action) {
            case LEERMENSAJE:

                break;
            case VERCALENDARIO:

                break;
            case CREARUSUARIO:

                break;
            case MANDARMENSAJE:

                break;
            case SELECCIONARTUTORIA:

                break;
            case SELECCIONARMENSAJE:

                break;
            case ASIGNARNINO:

                break;
            case VERLISTANINO:

                break;
            case MOSTRARMENSAJE:

                break;
            case VERTUTORIA:

                break;
            case CANCELARTUTORIA:

                break;
            case CREARPADRE:

                break;
            case CREARPROFESOR:

                break;

        }
    }
    List<Mensaje>leermensajes(){
        return null;

    }
    List<Calendario>vercalendario(){
        return null;

    }
    void crearusuario(Usuario usuario){

    }
    void mandarmensaje(Mensaje mensaje){

    }
    void seleccionartutoria(Tutoria tutoria){

    }
    void seleccionarmensaje (Mensaje mensaje){

    }
    void asignarnino (Nino nino){

    }
    List<Nino>verlistanino(){
        return null;

    }
    List<Mensaje>mostrarmensajes(){
        return null;

    }
    Tutoria vertutoria(){
        return null;

    }
    Tutoria cancelartutoria(){
        return null;

    }

}

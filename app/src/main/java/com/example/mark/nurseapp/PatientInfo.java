package com.example.mark.nurseapp;

/**
 * Created by Mark on 4/8/2017.
 */

public class PatientInfo {
    private String m_name;
    private String m_room;
    private String m_help;

    PatientInfo( String name, int room, String help){
        m_name = name;
        m_room = Integer.toString(room);
        m_help = help;
    }

    public String get_mname(){ return m_name;}
    public String get_mroom(){ return m_room;}
    public String get_mhelp(){ return m_help;}
}

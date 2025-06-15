package com.example.Proyecto_Final_Ortiz_Florencia.config;

import com.example.Proyecto_Final_Ortiz_Florencia.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;


public class CustomRevisionListener implements RevisionListener{
    public void newRevision(Object revisionEntity) { final Revision revision = (Revision) revisionEntity; }
}

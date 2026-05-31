package com.example.demo.Config;


import com.example.demo.Modelo.audit.Revision;
import org.hibernate.envers.RevisionListener;


public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity){ final Revision revision = (Revision) revisionEntity;}
}

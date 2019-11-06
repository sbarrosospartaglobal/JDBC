package com.sparta.sb;

import com.sparta.sb.db.DAO;

public class Starter
{
    public static void main( String[] args )
    {
        DAO dao = new DAO();
        dao.runSQLQuery("3");
    }
}

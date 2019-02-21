package com.infoshare.academy.reservation;

import org.hibernate.Session;

import java.util.List;

import static com.infoshare.academy.database.HibernateConf.getSessionFactory;

public class ReservationRepositoryDaoBeen implements ReservationRepositoryDao {

    private Session getSession() {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        return session;
    }



    @Override
    public List<Reservation> getReservationList() {
        return null;
    }

    @Override
    public List<Reservation> getReservationByUserId(int userId) {
        Session session = getSession();
        List<Reservation> reservationListByUserId = session.createQuery("SELECT r FROM Reservation r WHERE r.userId='"+userId+"'", Reservation.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return reservationListByUserId;
    }

    @Override
    public List<Reservation> getReservationByCarId(int car) {
        Session session = getSession();
        List<Reservation> reservationListByCarId = session.createQuery("select r From Reservation r Where r.car='"+ car +"'",Reservation.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return reservationListByCarId;
    }
}

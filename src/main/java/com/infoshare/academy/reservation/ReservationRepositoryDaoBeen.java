package com.infoshare.academy.reservation;

import org.hibernate.Session;

import java.util.Date;
import java.util.List;
import java.util.ListResourceBundle;

import static com.infoshare.academy.database.HibernateConf.getSessionFactory;

public class ReservationRepositoryDaoBeen implements ReservationRepositoryDao {

    private Session getSession() {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        return session;
    }

    @Override
    public List<Reservation> getReservationList() {
        Session session = getSession();
        List<Reservation> reservationList = session.createQuery("SELECT r FROM Reservation r ", Reservation.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return reservationList;

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
    public List<Reservation> getReservationByCarId(int carId) {
        Session session = getSession();
        List<Reservation> reservationListByCarId = session.createQuery("select r From Reservation r Where r.carId='"+carId+"'",Reservation.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return reservationListByCarId;
    }
}

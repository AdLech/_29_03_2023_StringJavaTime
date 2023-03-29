package com.hedima.presentacion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class ProbarJavaTime {
    public static void main(String[] args) {
        //Primera forma de armar fechas
        LocalDate date = LocalDate.of(1992,8,30);
        System.out.println("fecha ->" + date);
        //Segunda forma de armar fechas
        LocalDate date2 = LocalDate.of(1992, Month.AUGUST,30);
        System.out.println("fecha ->" + date2);
        //Tercera forma de armar fechas
        LocalDate date3 = LocalDate.parse("1992-08-30");
        System.out.println("fecha ->" + date3);

        System.out.println(date.plusDays(2));
        System.out.println(date2.plusMonths(1));
        System.out.println(date2.plusYears(1));
        System.out.println(date.minusDays(2));
        System.out.println(date2.minusMonths(1));
        System.out.println(date2.minusYears(1));

        LocalDate date4 = LocalDate.of(2007, Month.JULY,7);
        System.out.println(date2.isBefore(date4));
        System.out.println(date2.isAfter(date4));

        System.out.println(LocalDate.now());

        //Diferencia de fechas
        System.out.println(Period.between(date2, date4));
        System.out.println(Period.between(date2, date4).getYears());

        System.out.println(Period.between(date2, LocalDate.now()).getYears());

        LocalTime horaInicio = LocalTime.of(12,0);
        System.out.println("horaInicio ->" + horaInicio);
        LocalTime horaFin = LocalTime.parse("12:00:00.001");
        System.out.println(horaFin);

        System.out.println(horaInicio.plusHours(1));
        System.out.println(horaInicio.minusMinutes(1));
        System.out.println(horaInicio.isBefore(horaFin));

        //Definir una fecha de fabricación y una fecha de expiración
        //Calcular los días, meses, años para que caduque

        LocalDate date7 = LocalDate.of(2022, Month.DECEMBER, 15);
        System.out.println("fecha de fabricación ->" + date7);
        LocalDate date8 = LocalDate.of(2024,Month.MARCH, 9);
        System.out.println("fecha de expiración ->" + date8);
        System.out.println(Period.between(LocalDate.now(), date8));
        System.out.println(Period.between(date7, date8).getYears());
        System.out.println(Period.between(date7, date8).getMonths());
        System.out.println(Period.between(date7, date8).getDays());
        System.out.println(Period.between(LocalDate.now(), date8));
        System.out.println(Period.between(LocalDate.now(), date8).getYears());
        System.out.println(Period.between(LocalDate.now(), date8).getMonths());
        System.out.println(Period.between(LocalDate.now(), date8).getDays());





    }

}

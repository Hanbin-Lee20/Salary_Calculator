# Salary_Record

This repository contains several java files that calculates different types of programmer's salary.

1. Payme.java:
   Interface for this program. Contains getPaymentAmount() for calculating earnings,
   toString() for displaying programmer's details, and
   display() for different way to display programmer's details.
   
2. Programmer:
   Parent class of Salaried, Hourly, Commission and BasePlusCommissionProgrammer class.
   It sets and gets programmer's basic info: First name, last name and social security number.
   Also, toString() for displaying those data.
   
3. Invoice.java:
   This is an unrelated class to programmer. It adds invoice data on each programmers.

4. SalariedProgrammer, HourlyProgrammer, CommissionProgrammer, BasePlusCommissionProgrammer.java:
   These files are subclass of Programmer.java.
   By using super() keyword, each of class gets basic info from Programmer.java.
   They also add their own features.
   

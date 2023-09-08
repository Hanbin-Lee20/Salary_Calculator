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

5. PaymeInterfaceTest.java:
   Entry point for testing each programmer class.
   It contains array to preset the programmer data.
   Used printf for clear view.

6. PaymeInterfaceTest2.java:
   In this file, the outcome is basically same, but used different way to display it.
   By overriding display() in Payme Interface, it is possible to get same outcome with simplified code.
   
   


















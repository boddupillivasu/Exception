package com.exception.java;

public class ValidationException {
    public static void main(String[] args) {
        String userName = "java java";
        String password = "vasu";
        boolean isvalid = false;

        try {
            isvalid = isvalid(userName, password);

            if (isvalid)
                System.out.println("is valid");
//            else
//                System.out.println("not valid");
        } catch (NullPointerException e) {
            System.out.println(" the password and user name is null");
        } catch (InvalidUserException e) {
            System.out.println("invalid usser exception:" + e.getMessage());
        }
    }

    private static boolean isvalid(String userName, String password) throws NullPointerException, InvalidUserException {
        boolean isvalid = false;
        // try {


        if (userName.equalsIgnoreCase("java") && password.equals("vasu"))
            isvalid = true;
        else
            throw new InvalidUserException("wrong username and password");


        // } catch (NullPointerException e) {
        // System.out.println("this is a  null point exception");
        // }

        return isvalid;
    }
}



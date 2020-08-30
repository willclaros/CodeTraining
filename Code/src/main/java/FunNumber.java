/*
 *
 *   @(#)FunNumber.java
 *
 *   Copyright (c) 2020 Code Training.
 *   Av Circunvalación, Pacata, Cochabamba, Bolivia.
 *   All rights reserved.
 *
 *   This software is the confidential and proprietary information. You shall not disclose such Confidential
 *   Information and shall use it only in accordance with the terms of the license agreement.
 *
 */

public class FunNumber {
    /**
     * You might know some pretty large perfect squares. But what about the NEXT one?
     * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
     * Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
     * If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is positive.
     * Examples:
     * findNextSquare(121) --> returns 144
     * findNextSquare(625) --> returns 676
     * findNextSquare(114) --> returns -1 since 114 is not a perfect
     *
     * @param number
     * @return
     */
    public double findNextSquare(double number) {
        return (Math.sqrt(number) % 1 == 0) ? Math.pow((Math.sqrt(number) + 1), 2) : -1;
    }
}
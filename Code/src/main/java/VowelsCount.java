/*
 *
 *  @(#)VowelsCount.java
 *
 *  Copyright (c) 2020 Code Training.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information.  You shall not  disclose such Confidential
 *  Information and shall use it only in accordance with the terms of the license agreement.
 *
 */

public class VowelsCount {

    /**
     * Return the number (count) of vowels in the given string.
     * We will consider a, e, i, o, u as vowels for this Kata (but not y).
     * The input string will only consist of lower case letters and/or spaces.
     * Example:
     * "abracadabra" ---> return 5
     *
     * @param str
     * @return Total number of vowels that exist in the word
     */
    public int vowelsCount(String str) {
        return str.toLowerCase().replaceAll("[^aáeéiíoóuú]", "").length();
    }
}

package com.pierprogramm.training.junit.codewars.mergedstringchecker;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringMergerTest {

    @Test
    public void testIsMerge() throws Exception {
        assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
        assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
        assertFalse("Codewars are not ceodwars, part1 and part2 must be ordered.", StringMerger.isMerge("codewars", "ceod", "wars"));

        assertTrue("mio 1", StringMerger.isMerge("abcabf", "abf", "abc"));

        assertTrue("1", StringMerger.isMerge("abac", "ab", "ac"));
        assertTrue("2", StringMerger.isMerge("abac", "ac", "ab"));
        assertFalse("3", StringMerger.isMerge("abcad", "acd", "ab"));
        assertFalse("4", StringMerger.isMerge("abcad", "ab", "acd"));
        assertFalse("5", StringMerger.isMerge("abc", "ac", "a"));

        assertTrue("official 1", StringMerger.isMerge("@I3%4_,Ab^[<O,&w&_3oZPO6A-J,PSrDg]@I3%4_,Ab^[g_Umm4h(<CbdX\\<t\".B;D$ZOQ;j4%\"q=c_x_e7Sk`i:,]3(d2>0o3R,",
                "@I3%4_,Ab^[g_Umm4h(<CbdX\\<t\".B;D$ZOQ;j",
                "@I3%4_,Ab^[<O,&w&_3oZPO6A-J,PSrDg]4%\"q=c_x_e7Sk`i:,]3(d2>0o3R,"));

        assertTrue("official 2", StringMerger.isMerge("OF=(BUZ\"uo3;c3UJMT#w",
                "F(Uu3JT#",
                "O=BZ\"o3;cUMw"));

        assertTrue("official banana", StringMerger.isMerge("Bananas from Bahamas",
                "Bahas",
                "Bananas from am"));
    }
}
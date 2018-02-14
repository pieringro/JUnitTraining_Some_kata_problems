package com.pierprogramm.training.junit.codewars.morsecode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MorseCodeDecoderTest {

    @Test
    public void testDecode() throws Exception {
        assertEquals("HEY JUDE", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
        assertEquals("HEY YOU, SEE ME, PICTURES CRAZY, ALL THE WORLD I'VE SEEN BEFORE ME PASSING BY",
                MorseCodeDecoder.decode(".... . -.-- / -.-- --- ..- --..-- / ... . . / -- . --..-- / .--. .. -.-. - ..- .-. . ... / -.-. .-. .- --.. -.-- --..-- / .- .-.. .-.. / - .... . / .-- --- .-. .-.. -.. / .. .----. ...- . / ... . . -. / -... . ..-. --- .-. . / -- . / .--. .- ... ... .. -. --. / -... -.--")
        );
        assertEquals("LIFE IS A WATERFALL WE DRINK FROM THE RIVER THEN WE TURN AROUND AND PUT UP OUR WALLS",
                MorseCodeDecoder.decode(".-.. .. ..-. . / .. ... / .- / .-- .- - . .-. ..-. .- .-.. .-.. / .-- . / -.. .-. .. -. -.- / ..-. .-. --- -- / - .... . / .-. .. ...- . .-. / - .... . -. / .-- . / - ..- .-. -. / .- .-. --- ..- -. -.. / .- -. -.. / .--. ..- - / ..- .--. / --- ..- .-. / .-- .- .-.. .-.. ...")
        );
        assertEquals("I CRY WHEN ANGELS DESERVE TO DIE",
                MorseCodeDecoder.decode("   .. / -.-. .-. -.-- / .-- .... . -. / .- -. --. . .-.. ... / -.. . ... . .-. ...- . / - --- / -.. .. .    "));
    }
}
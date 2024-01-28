package com.vircash.p2p_network;

import org.apache.commons.codec.digest.DigestUtils;

public class FindNonce {
    public static void main(String[] args)
    {
        int nonce=0,difficulty=6;
        String validHash=generateHashWithRequiredDifficulty(nonce,difficulty);
        System.out.println(". The hash with "+difficulty+" leading zeroes is= "+validHash);
    }

    private static String generateHashWithRequiredDifficulty(int nonce, int difficulty) {
        String sha256hex,leadingZeroes="";
        for(int i=1;i<=difficulty;i++){
            leadingZeroes=leadingZeroes+"0";
        }

        while(true)
        {
            sha256hex = DigestUtils.sha256Hex("ABCD" + Integer.toString(nonce));
            if(sha256hex.substring(0,difficulty).equals(leadingZeroes))
            {
                System.out.print("Nonce= "+nonce);
                return sha256hex;
            }
            nonce+=1;
        }
    }
}
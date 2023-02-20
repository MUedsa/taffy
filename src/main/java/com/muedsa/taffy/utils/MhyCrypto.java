package com.muedsa.taffy.utils;

import java.nio.ByteBuffer;

/**
 * Reference
 * <ul>
 *   <li><a href="https://forum.ragezone.com/f861/genshin-impact-private-server-1191004-print/index7.html">RageZone Thread: genshin impact private server</a></li>
 *   <li><a href="https://github.com/Crepe-Inc/DNTKCLI">DNTKCLI</a></li>
 *  <li><a href="https://github.com/NickTheHuy/YS-Freedom">YS-Freedom</a></li>
 * </ul>
 */
public class MhyCrypto {

    private static final int MHY_KEY_LENGTH = 4096;

    public static byte[] generateKey(long seed) {
        return generateKey(seed, MHY_KEY_LENGTH);
    }

    public static byte[] generateKey(long seed, int length) {
        if(length % 8 != 0){
            throw new IllegalArgumentException("length % 8 != 0");
        }
        MT19937_64 mt = new MT19937_64();
        mt.init(seed);
        long nextSeed = mt.nextLong();
        mt.init(nextSeed);
        mt.nextLong();
        ByteBuffer byteBuffer = ByteBuffer.allocate(length);
        for (int i = 0; i < length / 8; i++) {
            byteBuffer.putLong(mt.nextLong());
        }
        return byteBuffer.array();
    }

    public static void xor(byte[] data, byte[] key) {
        for (int i = 0; i < data.length; i++) {
            data[i] ^= key[i % key.length];
        }
    }
}

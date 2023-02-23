package com.muedsa.taffy.utils;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Reference
 * <ul>
 *   <li><a href="https://forum.ragezone.com/f861/genshin-impact-private-server-1191004-print/index7.html">RageZone Thread: Genshin Impact Private Server</a></li>
 *   <li><a href="https://github.com/Crepe-Inc/DNTKCLI">DNTKCLI</a></li>
 *  <li><a href="https://github.com/NickTheHuy/YS-Freedom">YS-Freedom</a></li>
 * </ul>
 */
public class MhyCrypto {

    private static final byte[] KEY_XOR_PAD = HexFormatUtils.parseUpperCaseHex("A2252599B762F43928E1B77391052587");

    private static final byte[] EC2B_XOR_MAGIC = HexFormatUtils.parseUpperCaseHex("CEAC3B5A867837AC");

    private static final int MHY_KEY_LENGTH = 4096;

    public static long getSeed(byte[] ec2bKey, byte[] ec2bData) {
        if(ec2bKey.length != 16){
            throw new IllegalArgumentException("ec2bKey length != 16");
        }
        if(ec2bData.length != 2048){
            throw new IllegalArgumentException("ec2bData length != 2048");
        }
        byte[] key = MhyEc2b.keyScramble(ec2bKey);
        xor(key, KEY_XOR_PAD);
        byte[] temp = new byte[] {-1, -1, -1, -1, -1, -1, -1, -1};
        for (int i = 0; i < 2048 >> 3; i++) {
            byte[] data = subBytesAndReverse(ec2bData, i * 8, 8);
            xor(temp, data);
        }
        byte[] key1 = subBytesAndReverse(key, 0, 8);
        byte[] key2 = subBytesAndReverse(key, 8, 8);

        xor(temp, key1);
        xor(temp, key2);
        xor(temp, EC2B_XOR_MAGIC);
        return new BigInteger(temp).longValueExact();
    }

    private static byte[] subBytesAndReverse(byte[] src, int srcPos, int length) {
        if(src == null || srcPos < 0 || length < 0){
            throw new IllegalArgumentException();
        }
        int endIndex = srcPos + length - 1;
        if(endIndex > src.length - 1){
            throw new IndexOutOfBoundsException();
        }
        byte[] bytes = new byte[length];
        for (int i = 0; i < length; i++) {
            bytes[i] = src[endIndex - i];
        }
        return bytes;
    }

    public static byte[] generateEc2bXorKey(long seed) {
        MT19937_64 mt = new MT19937_64();
        mt.init(seed);
        ByteBuffer byteBuffer = ByteBuffer.allocate(MHY_KEY_LENGTH);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < MHY_KEY_LENGTH >> 3; i++) {
            byteBuffer.putLong(mt.nextLong());
        }
        return byteBuffer.array();
    }

    public static byte[] generateXorKey(long seed) {
        return generateXorKey(seed, MHY_KEY_LENGTH);
    }

    public static byte[] generateXorKey(long seed, int length) {
        if(length % 8 != 0){
            throw new IllegalArgumentException("length % 8 != 0");
        }
        MT19937_64 mt = new MT19937_64();
        mt.init(seed);
        long nextSeed = mt.nextLong();
        mt.init(nextSeed);
        mt.nextLong();
        ByteBuffer byteBuffer = ByteBuffer.allocate(length);
        for (int i = 0; i < length >> 3; i++) {
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

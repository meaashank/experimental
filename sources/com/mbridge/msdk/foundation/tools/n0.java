package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes5.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static char[] f156809a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', androidx.compose.ui.graphics.vector.f.f101687s, 'b', androidx.compose.ui.graphics.vector.f.f101679k, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static MessageDigest f156810b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f156811c = "SameFileMD5";

    static {
        try {
            f156810b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e10) {
            System.err.println(n0.class.getName().concat("初始化失败，MessageDigest不支持MD5Util."));
            e10.printStackTrace();
        }
    }

    public static String a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        MessageDigest messageDigest;
        if (file == null || !file.exists()) {
            return "";
        }
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            byte[] bArr = new byte[10485760];
            while (true) {
                int i10 = randomAccessFile.read(bArr);
                if (i10 == -1) {
                    String strA = a(messageDigest.digest());
                    try {
                        randomAccessFile.close();
                        return strA;
                    } catch (IOException e10) {
                        q0.b(f156811c, e10.getMessage());
                        return strA;
                    }
                }
                messageDigest.update(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                q0.b(f156811c, th.getMessage());
                return "";
            } finally {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e11) {
                        q0.b(f156811c, e11.getMessage());
                    }
                }
            }
        }
    }

    private static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private static String a(byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer(i11 * 2);
        int i12 = i11 + i10;
        while (i10 < i12) {
            a(bArr[i10], stringBuffer);
            i10++;
        }
        return stringBuffer.toString();
    }

    private static void a(byte b10, StringBuffer stringBuffer) {
        char[] cArr = f156809a;
        char c10 = cArr[(b10 & 240) >> 4];
        char c11 = cArr[b10 & Ascii.SI];
        stringBuffer.append(c10);
        stringBuffer.append(c11);
    }
}

package org.apache.commons.lang3;

import androidx.collection.N0;
import java.util.Random;
import okio.h0;

/* JADX INFO: loaded from: classes6.dex */
public class RandomStringUtils {
    private static final Random RANDOM = new Random();

    public static String random(int i10) {
        return random(i10, false, false);
    }

    public static String randomAlphabetic(int i10) {
        return random(i10, true, false);
    }

    public static String randomAlphanumeric(int i10) {
        return random(i10, true, true);
    }

    public static String randomAscii(int i10) {
        return random(i10, 32, 127, false, false);
    }

    public static String randomNumeric(int i10) {
        return random(i10, false, true);
    }

    public static String random(int i10, boolean z10, boolean z11) {
        return random(i10, 0, 0, z10, z11);
    }

    public static String random(int i10, int i11, int i12, boolean z10, boolean z11) {
        return random(i10, i11, i12, z10, z11, null, RANDOM);
    }

    public static String random(int i10, int i11, int i12, boolean z10, boolean z11, char... cArr) {
        return random(i10, i11, i12, z10, z11, cArr, RANDOM);
    }

    public static String random(int i10, int i11, int i12, boolean z10, boolean z11, char[] cArr, Random random) {
        char cNextInt;
        if (i10 == 0) {
            return "";
        }
        if (i10 >= 0) {
            if (i11 == 0 && i12 == 0) {
                if (z10 || z11) {
                    i12 = 123;
                    i11 = 32;
                } else {
                    i11 = 0;
                    i12 = Integer.MAX_VALUE;
                }
            }
            char[] cArr2 = new char[i10];
            int i13 = i12 - i11;
            while (true) {
                int i14 = i10 - 1;
                if (i10 != 0) {
                    if (cArr == null) {
                        cNextInt = (char) (random.nextInt(i13) + i11);
                    } else {
                        cNextInt = cArr[random.nextInt(i13) + i11];
                    }
                    if ((z10 && Character.isLetter(cNextInt)) || ((z11 && Character.isDigit(cNextInt)) || (!z10 && !z11))) {
                        if (cNextInt < 56320 || cNextInt > 57343) {
                            if (cNextInt < 55296 || cNextInt > 56191) {
                                if (cNextInt < 56192 || cNextInt > 56319) {
                                    cArr2[i14] = cNextInt;
                                    i10 = i14;
                                }
                            } else if (i14 != 0) {
                                cArr2[i14] = (char) (random.nextInt(128) + h0.f225966e);
                                i10 -= 2;
                                cArr2[i10] = cNextInt;
                            }
                        } else if (i14 != 0) {
                            cArr2[i14] = cNextInt;
                            i10 -= 2;
                            cArr2[i10] = (char) (random.nextInt(128) + 55296);
                        }
                    }
                } else {
                    return new String(cArr2);
                }
            }
        } else {
            throw new IllegalArgumentException(N0.a("Requested random string length ", i10, " is less than 0."));
        }
    }

    public static String random(int i10, String str) {
        if (str == null) {
            return random(i10, 0, 0, false, false, null, RANDOM);
        }
        return random(i10, str.toCharArray());
    }

    public static String random(int i10, char... cArr) {
        if (cArr == null) {
            return random(i10, 0, 0, false, false, null, RANDOM);
        }
        return random(i10, 0, cArr.length, false, false, cArr, RANDOM);
    }
}

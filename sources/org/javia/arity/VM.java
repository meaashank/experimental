package org.javia.arity;

import Y7.a;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.mbbid.out.BidResponsed;

/* JADX INFO: loaded from: classes6.dex */
class VM {
    static final byte ABS = 29;
    static final byte ACOS = 21;
    static final byte ACOSH = 27;
    static final byte ADD = 3;
    static final byte ASIN = 20;
    static final byte ASINH = 26;
    static final byte ATAN = 22;
    static final byte ATANH = 28;
    static final byte CALL = 2;
    static final byte CBRT = 14;
    static final byte CEIL = 31;
    static final byte CONST = 1;
    static final byte COS = 18;
    static final byte COSH = 24;
    static final byte DIV = 6;
    static final byte EXP = 15;
    static final byte FACT = 11;
    static final byte FLOOR = 30;
    static final byte LN = 16;
    static final byte LOAD0 = 38;
    static final byte LOAD1 = 39;
    static final byte LOAD2 = 40;
    static final byte LOAD3 = 41;
    static final byte LOAD4 = 42;
    static final byte MOD = 7;
    static final byte MUL = 5;
    static final byte PERCENT = 12;
    static final byte POWER = 10;
    static final byte RESERVED = 0;
    static final byte RND = 8;
    static final byte SIGN = 32;
    static final byte SIN = 17;
    static final byte SINH = 23;
    static final byte SQRT = 13;
    static final byte SUB = 4;
    static final byte TAN = 19;
    static final byte TANH = 25;
    static final byte UMIN = 9;
    static final String[] opcodeName = {"reserved", "const", NotificationCompat.CATEGORY_CALL, "add", "sub", "mul", "div", "mod", "rnd", "umin", a.f79330e, "fact", "percent", "sqrt", "cbrt", "exp", BidResponsed.KEY_LN, "sin", "cos", "tan", "asin", "acos", "atan", "sinh", "cosh", "tanh", "asinh", "acosh", "atanh", "abs", "floor", "ceil", "sign", "min", "max", "gcd", "comb", "perm", "load0", "load1", "load2", "load3", "load4"};
    static final byte[] arity = {0, 0, -1, 2, 2, 2, 2, 2, 0, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0};
    static final byte MIN = 33;
    static final byte MAX = 34;
    static final byte GCD = 35;
    static final byte COMB = 36;
    static final byte PERM = 37;
    static final byte[] builtins = {13, 14, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 15, 16, 29, 30, 31, 32, MIN, MAX, GCD, COMB, PERM, 7};
}

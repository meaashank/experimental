package org.javia.arity;

import androidx.activity.C1477d;

/* JADX INFO: loaded from: classes6.dex */
class Token {
    static final int LEFT = 2;
    static final int PREFIX = 1;
    static final int RIGHT = 3;
    static final int SUFIX = 4;
    int arity;
    final int assoc;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    final int f226143id;
    String name = null;
    int position;
    final int priority;
    double value;
    final byte vmop;

    public Token(int i10, int i11, int i12, int i13) {
        this.f226143id = i10;
        this.priority = i11;
        this.assoc = i12;
        this.vmop = (byte) i13;
        this.arity = i10 == 11 ? 1 : -3;
    }

    public boolean isDerivative() {
        int length;
        String str = this.name;
        return str != null && (length = str.length()) > 0 && this.name.charAt(length - 1) == '\'';
    }

    public Token setAlpha(String str) {
        this.name = str;
        return this;
    }

    public Token setPos(int i10) {
        this.position = i10;
        return this;
    }

    public Token setValue(double d10) {
        this.value = d10;
        return this;
    }

    public String toString() {
        switch (this.f226143id) {
            case 9:
                return "" + this.value;
            case 10:
                return this.name;
            case 11:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.name);
                sb2.append('(');
                return C1477d.a(sb2, this.arity, ')');
            default:
                return "" + this.f226143id;
        }
    }
}

package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class h extends d {
    public h(char[] cArr) {
        super(cArr);
    }

    public static d C(char[] cArr) {
        return new h(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String A(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        b(sb2, i10);
        sb2.append("'");
        sb2.append(c());
        sb2.append("'");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.d
    public String B() {
        return "'" + c() + "'";
    }
}

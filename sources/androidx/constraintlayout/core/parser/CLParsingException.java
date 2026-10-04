package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105926c;

    public CLParsingException(String str, d dVar) {
        this.f105924a = str;
        if (dVar != null) {
            this.f105926c = dVar.q();
            this.f105925b = dVar.n();
        } else {
            this.f105926c = "unknown";
            this.f105925b = 0;
        }
    }

    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f105924a);
        sb2.append(" (");
        sb2.append(this.f105926c);
        sb2.append(" at line ");
        return android.support.v4.media.d.a(sb2, this.f105925b, ")");
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + d();
    }
}

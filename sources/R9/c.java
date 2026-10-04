package R9;

/* JADX INFO: loaded from: classes6.dex */
public class c implements V5.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f67794b = "pkg";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f67795c = "import_pkg";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f67796d = "result";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f67797e = "result_status";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V5.c f67798a;

    public c(V5.c cVar) {
        this.f67798a = cVar;
    }

    @Override // V5.c
    public void b() {
        this.f67798a.b();
    }

    @Override // V5.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c d(String str, boolean z10) {
        this.f67798a.d(str, z10);
        return this;
    }

    public c g(String str) {
        c(f67795c, str);
        return this;
    }

    @Override // V5.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c e(String str, int i10) {
        this.f67798a.e(str, i10);
        return this;
    }

    public c i(String str) {
        c("pkg", str);
        return this;
    }

    public c j(boolean z10) {
        d(f67796d, z10);
        return this;
    }

    public c k(String str) {
        c(f67797e, str);
        return this;
    }

    @Override // V5.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c c(String str, String str2) {
        this.f67798a.c(str, str2);
        return this;
    }

    @Override // V5.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public c a(int i10) {
        this.f67798a.a(i10);
        return this;
    }
}

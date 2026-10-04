package b7;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f125928a = "asdf-".concat(e.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f125929b = 309578419;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f125930c = 377864165;

    public static Boolean a(long j10, int i10) {
        if (i10 <= 0) {
            return null;
        }
        if (j10 == f125929b && i10 < 35) {
            return Boolean.FALSE;
        }
        if (j10 != f125930c || i10 >= 36) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (a(f125929b, i10) != null) {
            sb2.append("ENFORCE_EDGE_TO_EDGE=off ");
        }
        if (a(f125930c, i10) != null) {
            sb2.append("DISABLE_OPT_OUT_EDGE_TO_EDGE=off ");
        }
        return sb2.length() == 0 ? "none" : sb2.toString().trim();
    }

    public static void c(String str, int i10) {
        b(i10);
    }
}

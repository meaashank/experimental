package Z6;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i f84375b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84376a = true;

    public static i b() {
        if (f84375b == null) {
            synchronized (i.class) {
                try {
                    if (f84375b == null) {
                        f84375b = new i();
                    }
                } finally {
                }
            }
        }
        return f84375b;
    }

    public void a() {
        this.f84376a = false;
    }

    public boolean c() {
        return this.f84376a;
    }
}

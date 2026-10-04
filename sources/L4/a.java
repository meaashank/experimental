package L4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f58633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<J4.b> f58634c = new ArrayList();

    @Override // L4.c
    public b a() {
        if (this.f58633b == null) {
            this.f58633b = new b();
        }
        return this.f58633b;
    }

    @Override // L4.c
    public void b(b bVar) {
        this.f58633b = bVar;
        this.f58634c.clear();
    }

    @Override // L4.c
    public List<J4.b> c() {
        return this.f58634c;
    }

    public int e(float f10, float f11) {
        return Math.max(1, (int) ((3.063052912151454d / Math.asin(f11 / f10)) + 0.5d));
    }

    public int f() {
        return Math.round(this.f58633b.f58639e * 255.0f);
    }
}

package V5;

import V5.c;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes5.dex */
@Singleton
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f74619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f74620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.a f74621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f74622d;

    @Inject
    public a(Set<d> set, Set<e> set2, Set<c.a> set3, Set<f> set4) {
        this.f74619a = new j(set);
        this.f74620b = new k(set2);
        this.f74621c = new i(set3);
        this.f74622d = new l(set4);
    }

    public c.a a() {
        return this.f74621c;
    }

    public d b() {
        return this.f74619a;
    }

    public e c() {
        return this.f74620b;
    }

    public f d() {
        return this.f74622d;
    }
}

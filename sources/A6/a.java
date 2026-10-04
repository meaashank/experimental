package A6;

import com.prism.commons.utils.l0;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2349c = l0.b(a.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f2350a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<g> f2351b = new LinkedHashSet<>();

    public abstract f a();

    public Collection<g> b() {
        return this.f2351b;
    }

    public h c() {
        return this.f2350a;
    }

    public boolean d(g gVar) {
        return this.f2351b.add(gVar);
    }

    public void e(h hVar) {
        this.f2350a = hVar;
    }

    public boolean f(g gVar) {
        return this.f2351b.remove(gVar);
    }
}

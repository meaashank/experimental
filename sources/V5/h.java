package V5;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<c> f74630a;

    public h(Set<c> set) {
        this.f74630a = set;
    }

    @Override // V5.c
    public c a(int i10) {
        Iterator<c> it = this.f74630a.iterator();
        while (it.hasNext()) {
            it.next().a(i10);
        }
        return this;
    }

    @Override // V5.c
    public void b() {
        Iterator<c> it = this.f74630a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // V5.c
    public c c(String str, String str2) {
        Iterator<c> it = this.f74630a.iterator();
        while (it.hasNext()) {
            it.next().c(str, str2);
        }
        return this;
    }

    @Override // V5.c
    public c d(String str, boolean z10) {
        Iterator<c> it = this.f74630a.iterator();
        while (it.hasNext()) {
            it.next().d(str, z10);
        }
        return this;
    }

    @Override // V5.c
    public c e(String str, int i10) {
        Iterator<c> it = this.f74630a.iterator();
        while (it.hasNext()) {
            it.next().e(str, i10);
        }
        return this;
    }
}

package o6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g6.C4455a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: o6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5330c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final a<E> f223339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final e f223340b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f223343e = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<E> f223341c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<E> f223342d = new LinkedList();

    /* JADX INFO: renamed from: o6.c$a */
    public interface a<E> {
        void a(@NonNull List<E> list, @NonNull e eVar);
    }

    public C5330c(@NonNull a<E> aVar, @Nullable e eVar) {
        this.f223339a = aVar;
        this.f223340b = eVar;
    }

    public void c() {
        final ArrayList arrayList = new ArrayList(this.f223342d);
        this.f223342d.clear();
        C4455a.b().a().execute(new Runnable() { // from class: o6.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f223336a.f(arrayList);
            }
        });
    }

    public void d(E e10) {
        this.f223341c.add(e10);
    }

    public final /* synthetic */ void e(boolean z10) {
        e eVar = this.f223340b;
        if (eVar != null) {
            eVar.a(z10);
        }
    }

    public final /* synthetic */ void f(ArrayList arrayList) {
        this.f223339a.a(arrayList, new e() { // from class: o6.b
            @Override // o6.e
            public final void a(boolean z10) {
                this.f223338a.e(z10);
            }
        });
    }

    public void g(E e10) {
        this.f223341c.remove(e10);
        this.f223342d.add(e10);
        if (this.f223343e && this.f223341c.isEmpty()) {
            c();
        }
    }

    public C5330c<E> h(boolean z10) {
        this.f223343e = z10;
        return this;
    }
}

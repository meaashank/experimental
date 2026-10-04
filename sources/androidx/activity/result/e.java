package androidx.activity.result;

import d.AbstractC4282a;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static void a(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static void b(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @NotNull
    public static final <I, O> g<L0> c(@NotNull b bVar, @NotNull AbstractC4282a<I, O> abstractC4282a, I i10, @NotNull j jVar, @NotNull final ed.l<? super O, L0> lVar) {
        return new ActivityResultCallerLauncher(bVar.registerForActivityResult(abstractC4282a, jVar, new a() { // from class: androidx.activity.result.c
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                lVar.invoke(obj);
            }
        }), abstractC4282a, i10);
    }

    @NotNull
    public static final <I, O> g<L0> d(@NotNull b bVar, @NotNull AbstractC4282a<I, O> abstractC4282a, I i10, @NotNull final ed.l<? super O, L0> lVar) {
        return new ActivityResultCallerLauncher(bVar.registerForActivityResult(abstractC4282a, new a() { // from class: androidx.activity.result.d
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                lVar.invoke(obj);
            }
        }), abstractC4282a, i10);
    }

    public static final void e(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void f(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }
}

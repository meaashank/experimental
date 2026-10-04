package kotlinx.coroutines.selects;

import ed.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.selects.SelectImplementation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSelectUnbiased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1855#2,2:66\n*S KotlinDebug\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n*L\n60#1:66,2\n*E\n"})
@InterfaceC4850b0
public class n<R> extends SelectImplementation<R> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<SelectImplementation<R>.a> f220735g;

    public n(@NotNull kotlin.coroutines.i iVar) {
        super(iVar);
        this.f220735g = new ArrayList();
    }

    @InterfaceC4850b0
    public static <R> Object P(n<R> nVar, kotlin.coroutines.e<? super R> eVar) {
        nVar.Q();
        return SelectImplementation.x(nVar, eVar);
    }

    public final void Q() {
        try {
            Collections.shuffle(this.f220735g);
            Iterator<T> it = this.f220735g.iterator();
            while (it.hasNext()) {
                SelectImplementation.I(this, (SelectImplementation.a) it.next(), false, 1, null);
            }
        } finally {
            this.f220735g.clear();
        }
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.b
    public void c(@NotNull c cVar, @NotNull ed.l<? super kotlin.coroutines.e<? super R>, ? extends Object> lVar) {
        this.f220735g.add(new SelectImplementation.a(cVar.d(), cVar.c(), cVar.b(), SelectKt.l(), lVar, cVar.a()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.b
    public <Q> void d(@NotNull e<? extends Q> eVar, @NotNull p<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar) {
        this.f220735g.add(new SelectImplementation.a(eVar.d(), eVar.c(), eVar.b(), null, pVar, eVar.a()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation, kotlinx.coroutines.selects.b
    public <P, Q> void i(@NotNull g<? super P, ? extends Q> gVar, P p10, @NotNull p<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar) {
        this.f220735g.add(new SelectImplementation.a(gVar.d(), gVar.c(), gVar.b(), p10, pVar, gVar.a()));
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    @InterfaceC4850b0
    @Nullable
    public Object w(@NotNull kotlin.coroutines.e<? super R> eVar) {
        Q();
        return SelectImplementation.x(this, eVar);
    }
}

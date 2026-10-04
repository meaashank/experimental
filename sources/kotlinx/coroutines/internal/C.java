package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.J0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1963#2,14:131\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n34#1:131,14\n*E\n"})
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C f220269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f220270b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final J0 f220271c;

    static {
        C c10 = new C();
        f220269a = c10;
        W.d(D.f220272a, true);
        f220271c = c10.a();
    }

    public final J0 a() throws Throwable {
        Object next;
        try {
            List listI3 = SequencesKt___SequencesKt.I3(SequencesKt__SequencesKt.j(ServiceLoader.load(B.class, B.class.getClassLoader()).iterator()));
            Iterator it = listI3.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iA = ((B) next).a();
                    do {
                        Object next2 = it.next();
                        int iA2 = ((B) next2).a();
                        if (iA < iA2) {
                            next = next2;
                            iA = iA2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            B b10 = (B) next;
            if (b10 != null) {
                return D.f(b10, listI3);
            }
            D.b(null, null, 3, null);
            throw null;
        } catch (Throwable th) {
            D.b(th, null, 2, null);
            throw null;
        }
    }
}

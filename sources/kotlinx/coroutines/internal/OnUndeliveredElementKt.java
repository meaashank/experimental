package kotlinx.coroutines.internal;

import java.lang.reflect.InvocationTargetException;
import kotlin.C4987s;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class OnUndeliveredElementKt {
    @NotNull
    public static final <E> ed.l<Throwable, L0> a(@NotNull final ed.l<? super E, L0> lVar, final E e10, @NotNull final kotlin.coroutines.i iVar) {
        return new ed.l<Throwable, L0>() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void e(@NotNull Throwable th) {
                OnUndeliveredElementKt.b(lVar, e10, iVar);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
                e(th);
                return L0.f217464a;
            }
        };
    }

    public static final <E> void b(@NotNull ed.l<? super E, L0> lVar, E e10, @NotNull kotlin.coroutines.i iVar) {
        UndeliveredElementException undeliveredElementExceptionC = c(lVar, e10, null);
        if (undeliveredElementExceptionC != null) {
            kotlinx.coroutines.I.b(iVar, undeliveredElementExceptionC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E> UndeliveredElementException c(@NotNull ed.l<? super E, L0> lVar, E e10, @Nullable UndeliveredElementException undeliveredElementException) throws IllegalAccessException, InvocationTargetException {
        try {
            lVar.invoke(e10);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                C4987s.a(undeliveredElementException, th);
                return undeliveredElementException;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for " + e10, th);
        }
    }

    public static /* synthetic */ UndeliveredElementException d(ed.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}

package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.i;
import ed.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class PressInteractionKt$collectIsPressedAsState$1$1 extends SuspendLambda implements p<L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f90138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.L0<Boolean> f90139c;

    public static final class a<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<i.b> f90140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.L0<Boolean> f90141b;

        public a(List<i.b> list, androidx.compose.runtime.L0<Boolean> l02) {
            this.f90140a = list;
            this.f90141b = l02;
        }

        @Override // kotlinx.coroutines.flow.f
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@NotNull d dVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            if (dVar instanceof i.b) {
                this.f90140a.add(dVar);
            } else if (dVar instanceof i.c) {
                this.f90140a.remove(((i.c) dVar).f90159a);
            } else if (dVar instanceof i.a) {
                this.f90140a.remove(((i.a) dVar).f90155a);
            }
            this.f90141b.setValue(Boolean.valueOf(!this.f90140a.isEmpty()));
            return L0.f217464a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressInteractionKt$collectIsPressedAsState$1$1(e eVar, androidx.compose.runtime.L0<Boolean> l02, kotlin.coroutines.e<? super PressInteractionKt$collectIsPressedAsState$1$1> eVar2) {
        super(2, eVar2);
        this.f90138b = eVar;
        this.f90139c = l02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new PressInteractionKt$collectIsPressedAsState$1$1(this.f90138b, this.f90139c, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f90137a;
        if (i10 == 0) {
            C4885d0.n(obj);
            ArrayList arrayList = new ArrayList();
            kotlinx.coroutines.flow.e<d> eVarC = this.f90138b.c();
            a aVar = new a(arrayList, this.f90139c);
            this.f90137a = 1;
            if (eVarC.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return L0.f217464a;
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((PressInteractionKt$collectIsPressedAsState$1$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}

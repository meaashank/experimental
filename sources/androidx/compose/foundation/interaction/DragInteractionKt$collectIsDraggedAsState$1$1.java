package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.a;
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
@Vc.d(c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1", f = "DragInteraction.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class DragInteractionKt$collectIsDraggedAsState$1$1 extends SuspendLambda implements p<L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f90123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.L0<Boolean> f90124c;

    public static final class a<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<a.b> f90125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.L0<Boolean> f90126b;

        public a(List<a.b> list, androidx.compose.runtime.L0<Boolean> l02) {
            this.f90125a = list;
            this.f90126b = l02;
        }

        @Override // kotlinx.coroutines.flow.f
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@NotNull d dVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            if (dVar instanceof a.b) {
                this.f90125a.add(dVar);
            } else if (dVar instanceof a.c) {
                this.f90125a.remove(((a.c) dVar).f90146a);
            } else if (dVar instanceof a.C0196a) {
                this.f90125a.remove(((a.C0196a) dVar).f90143a);
            }
            this.f90126b.setValue(Boolean.valueOf(!this.f90125a.isEmpty()));
            return L0.f217464a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragInteractionKt$collectIsDraggedAsState$1$1(e eVar, androidx.compose.runtime.L0<Boolean> l02, kotlin.coroutines.e<? super DragInteractionKt$collectIsDraggedAsState$1$1> eVar2) {
        super(2, eVar2);
        this.f90123b = eVar;
        this.f90124c = l02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new DragInteractionKt$collectIsDraggedAsState$1$1(this.f90123b, this.f90124c, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f90122a;
        if (i10 == 0) {
            C4885d0.n(obj);
            ArrayList arrayList = new ArrayList();
            kotlinx.coroutines.flow.e<d> eVarC = this.f90123b.c();
            a aVar = new a(arrayList, this.f90124c);
            this.f90122a = 1;
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
        return ((DragInteractionKt$collectIsDraggedAsState$1$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
